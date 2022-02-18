package com.jhs.shop.backend.apirest.models.services;

import java.util.List;
import java.io.InputStream;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface IAWSS3Service {

	void uploadFile(MultipartFile file, String FileName);
	
	List<String> getObjectsFromS3();
	
	InputStream downloadFile(String key);
	
	String GetUrlObject(String key);
}
