package com.jhs.shop.backend.apirest.controllers;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


import com.jhs.shop.backend.apirest.models.entity.Product;
import com.jhs.shop.backend.apirest.models.services.IAWSS3Service;
import com.jhs.shop.backend.apirest.models.services.IProductService;

@CrossOrigin(origins = {"https://phonebit1.web.app", "http://localhost:4200", "*"}, methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT}, allowedHeaders = "*") 
@RestController
@RequestMapping("/api")
public class ProductRestController {
	@Autowired
	private IProductService productService;
	
	@Autowired
	private IAWSS3Service awss3Service; 
	
	private final Logger log = LoggerFactory.getLogger(ProductRestController.class);
	
	@GetMapping("/products")
	public List<Product> index(){
		
		return productService.findAll();
	}
	@GetMapping("/productscategorysubcategorymarca")
	public List<Product> getProductCategorySubCategoryMarca(Integer categoryId, Integer subcategoryId, Integer marcaId)
	{
		return productService.findProductCategorySubCategoryMarca(categoryId, subcategoryId, marcaId);
	}
	
	@GetMapping("/productscategorysubcategory/{categoryId}/{subcategoryId}")
	public List<Product> getProductCategorySubCategory(@PathVariable Integer categoryId, @PathVariable Integer subcategoryId)
	{
		List<Product> productos = productService.findProductCategorySubCategory(categoryId, subcategoryId);
		System.out.println("Nro productos: " + productos.size());
		return productos;
	}
	
	@PostMapping("/products")
	@Modifying(clearAutomatically = true)
	@ResponseStatus(HttpStatus.CREATED)
	public Product create(@RequestBody Product producto)
	{
		return productService.save(producto);	
	}
	/*
	@PostMapping("/products")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<?> create(@RequestBody Product producto, @RequestParam("archivo") MultipartFile archivo)
	{
		productService.save(producto);
		Map<String, Object>  response = new HashMap<>();	
		
		if(!archivo.isEmpty()) {
			String nombreArchivo = UUID.randomUUID().toString() + "_" + archivo.getOriginalFilename().replace(" ","");
			Path rutaArchivo = Paths.get("uploads").resolve(nombreArchivo).toAbsolutePath();
			log.info(rutaArchivo.toString());
			
			try {
				Files.copy(archivo.getInputStream(), rutaArchivo);
			} catch (IOException e) {
				response.put("mensaje", "Error al subir la imagen del cliente " + nombreArchivo);
				response.put("error", e.getMessage().concat(": ").concat(e.getCause().getMessage()));
				return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
			}
			
			String nombreFotoAnterior = producto.getSlug();
			
			if(nombreFotoAnterior !=null && nombreFotoAnterior.length() >0) {
				Path rutaFotoAnterior = Paths.get("uploads").resolve(nombreFotoAnterior).toAbsolutePath();
				File archivoFotoAnterior = rutaFotoAnterior.toFile();
				if(archivoFotoAnterior.exists() && archivoFotoAnterior.canRead()) {
					archivoFotoAnterior.delete();
				}
			}
			
			producto.setSlug(nombreArchivo);
			
			productService.save(producto);
			
			response.put("producto", producto);
			response.put("mensaje", "Has subido correctamente la imagen : " + nombreArchivo);			
			
		}
		
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
		
	}*/
	
	
	@PostMapping("/products/upload")	
	public ResponseEntity<?> upload(@RequestParam("archivo") MultipartFile archivo, @RequestParam("id") Long id){
		
		Map<String, Object>  response = new HashMap<>();	
		System.out.println("Ingreso el id: "+id);
		Product producto = productService.findById(id);
		System.out.println("Ingreso el id del producto: "+ producto.getId());
		if(!archivo.isEmpty()) {
			String nombreArchivo = UUID.randomUUID().toString() + "_" + archivo.getOriginalFilename().replace(" ","");
			Path rutaArchivo = Paths.get("uploads").resolve(nombreArchivo).toAbsolutePath();
			log.info(rutaArchivo.toString());
			
			try {
				awss3Service.uploadFile(archivo, nombreArchivo);
				nombreArchivo = awss3Service.GetUrlObject(nombreArchivo);
				Files.copy(archivo.getInputStream(), rutaArchivo);
			} catch (IOException e) {
				response.put("mensaje", "Error al subir la imagen del cliente " + nombreArchivo);
				response.put("error", e.getMessage().concat(": ").concat(e.getCause().getMessage()));
				return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
			}
			
			String nombreFotoAnterior = producto.getSlug();
			
			if(nombreFotoAnterior !=null && nombreFotoAnterior.length() >0) {
				Path rutaFotoAnterior = Paths.get("uploads").resolve(nombreFotoAnterior).toAbsolutePath();
				File archivoFotoAnterior = rutaFotoAnterior.toFile();
				if(archivoFotoAnterior.exists() && archivoFotoAnterior.canRead()) {
					archivoFotoAnterior.delete();
				}
			}
			
			producto.setSlug(nombreArchivo);			
			productService.save(producto);			
			response.put("producto", producto);
			response.put("mensaje", "Has subido correctamente la imagen : " + nombreArchivo);
			
			
		}
		
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);	
	}
	@GetMapping("/uploads/img/{nombreFoto:.+}")
	public ResponseEntity<Resource> verFoto(@PathVariable String nombreFoto)
	{
		Path rutaArchivo = Paths.get("uploads").resolve(nombreFoto).toAbsolutePath();
		Resource recurso = null;
		
		try {
			recurso = new UrlResource(rutaArchivo.toUri());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		if(!recurso.exists() && !recurso.isReadable()) {
			throw new RuntimeException("Error no se pudo cargar la imagen : "+ nombreFoto);
		}
		
		HttpHeaders cabecera = new HttpHeaders(); 
		
		cabecera.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + recurso.getFilename() + "\"");
		return new ResponseEntity<Resource>(recurso, cabecera, HttpStatus.OK);	
	}
	
}
