INSERT INTO user (id, first_name, middle_name, last_name, mobile, email, password_hash, admin, vendor, registered_at, last_login, intro, profile) VALUES (1,'Jhames','FG','Galindo','983715555','jhs@gmail.com','123456',1,1,'2021-01-01 00:00:00','2021-01-01 00:00:00','a','b');

INSERT INTO category (id, parent_id, title, meta_title, slug, content, link) VALUES (1,1,'Laptops y Tablets','Laptops y Tablets','Laptops y Tablets','Laptops y Tablets','/marcalaptoptablet');
INSERT INTO category (id, parent_id, title, meta_title, slug, content, link) VALUES (2,1,'Computadoras','Computadoras','Computadoras','Computadoras',NULL);
INSERT INTO category (id, parent_id, title, meta_title, slug, content, link) VALUES (3,1,'Zona Gamer','Zona Gamer','Zona Gamer','Zona Gamer',NULL);
INSERT INTO category (id, parent_id, title, meta_title, slug, content, link) VALUES (4,1,'Partes de Pc','Partes de Pc','Partes de Pc','Partes de Pc',NULL);
INSERT INTO category (id, parent_id, title, meta_title, slug, content, link) VALUES (5,1,'Monitores y Mas','Monitores y Mas','Monitores y Mas','Monitores y Mas',NULL);
INSERT INTO category (id, parent_id, title, meta_title, slug, content, link) VALUES (6,1,'Impresoras','Impresoras','Impresoras','Impresoras',NULL);
INSERT INTO category (id, parent_id, title, meta_title, slug, content, link) VALUES (7,1,'Accesorios','Accesorios','Accesorios','Accesorios',NULL);
INSERT INTO category (id, parent_id, title, meta_title, slug, content, link) VALUES (8,1,'Licencias Originales','Licencias Originales','Licencias Originales','Licencias Originales',NULL);
INSERT INTO category (id, parent_id, title, meta_title, slug, content, link) VALUES (9,1,'Routers y ADSL','Routers y ADSL','Routers y ADSL','Routers y ADSL',NULL);
INSERT INTO category (id, parent_id, title, meta_title, slug, content, link) VALUES (10,1,'Smartphones y Accesorios','Smartphones y Accesorios','Smartphones y Accesorios','Smartphones y Accesorios',NULL);
INSERT INTO category (id, parent_id, title, meta_title, slug, content, link) VALUES (11,1,'Camaras Seguridad','Camaras Seguridad','Camaras Seguridad','Camaras Seguridad',NULL);
INSERT INTO category (id, parent_id, title, meta_title, slug, content, link) VALUES (12,1,'Terminal Puntos de Venta - POS','Terminal Puntos de Venta - POS','Terminal Puntos de Venta - POS','Terminal Puntos de Venta - POS',NULL);

INSERT INTO `subcategory` VALUES (1,'Laptop'),(2,'Laptop Gamer'),(3,'Linea Empresarial'),(4,'All-in-One'),(5,'Tablets');

INSERT INTO category_subcategory (category_id, subcategory_id) VALUES (1,1);

INSERT INTO characteristic (id, title) VALUES (1,'Procesador');
INSERT INTO characteristic (id, title) VALUES (2,'Memoria Ram');
INSERT INTO characteristic (id, title) VALUES (3,'Almacenamiento');
INSERT INTO characteristic (id, title) VALUES (4,'Tarjeta de Video');
INSERT INTO characteristic (id, title) VALUES (5,'Pantalla');
INSERT INTO characteristic (id, title) VALUES (6,'Modelo');
INSERT INTO characteristic (id, title) VALUES (7,'Color');
INSERT INTO characteristic (id, title) VALUES (8,'Serie');
INSERT INTO characteristic (id, title) VALUES (9,'Socket');
INSERT INTO characteristic (id, title) VALUES (10,'Chipset');
INSERT INTO characteristic (id, title) VALUES (11,'Capacidad');
INSERT INTO characteristic (id, title) VALUES (12,'Ranuras de expansión');
INSERT INTO characteristic (id, title) VALUES (13,'Iluminación');
INSERT INTO characteristic (id, title) VALUES (14,'Pantalla');
INSERT INTO characteristic (id, title) VALUES (15,'Angulo de Visión');
INSERT INTO characteristic (id, title) VALUES (16,'Brillo');
INSERT INTO characteristic (id, title) VALUES (17,'Resolución');
INSERT INTO characteristic (id, title) VALUES (18,'Tipo de Panel');
INSERT INTO characteristic (id, title) VALUES (19,'Motor Gráfico');
INSERT INTO characteristic (id, title) VALUES (20,'Tipo de Memoria');
INSERT INTO characteristic (id, title) VALUES (21,'SKUP'),(22,'Producto');
INSERT INTO characteristic (id, title) VALUES (23,'Impedancia');
INSERT INTO characteristic (id, title) VALUES (24,'Cable');
INSERT INTO characteristic (id, title) VALUES (25,'Tarjeta de Video');
INSERT INTO characteristic (id, title) VALUES (26,'Procesador');
INSERT INTO characteristic (id, title) VALUES (27,'Almacenamiento');
INSERT INTO characteristic (id, title) VALUES (28,'Teclado');
INSERT INTO characteristic (id, title) VALUES (29,'Sistema Operativo');

INSERT INTO `subcategory_characteristic` VALUES (1,1),(1,2),(1,3),(1,4),(1,5),(1,6),(1,7);

INSERT INTO characteristicdetail VALUES (1,'ASUS');
INSERT INTO characteristicdetail VALUES (2,'ZENBOOK UX425EA');
INSERT INTO characteristicdetail VALUES (3,'Laptop');
INSERT INTO characteristicdetail VALUES (4,'Intel Core i5-1135G7 Processor 2.4 GHz');
INSERT INTO characteristicdetail VALUES (5,'8 GB DDR4');
INSERT INTO characteristicdetail VALUES (6,'512GB SSD');
INSERT INTO characteristicdetail VALUES (7,'Intel Xe Iris (integrado)');
INSERT INTO characteristicdetail VALUES (8,'14 pulgadas');
INSERT INTO characteristicdetail VALUES (9,'WINDOWS 10');
INSERT INTO characteristicdetail VALUES (10,'AMD Ryzen 5');
INSERT INTO characteristicdetail VALUES (11,'GT 710');
INSERT INTO characteristicdetail VALUES (12,'8GB DDR4');
INSERT INTO characteristicdetail VALUES (13,'PC Hogar&Oficina');
INSERT INTO characteristicdetail VALUES (14,'1TB (HDD)');
INSERT INTO characteristicdetail VALUES (15,'B450M PRO-M2 MAX');
INSERT INTO characteristicdetail VALUES (16,'19.5\" HD');
INSERT INTO characteristicdetail VALUES (17,'Teclado + Mouse');

INSERT INTO characteristic_characteristicdetail (characteristic_id, characteristicdetail_id) VALUES (1,1);
INSERT INTO characteristic_characteristicdetail (characteristic_id, characteristicdetail_id) VALUES (3,3);
INSERT INTO characteristic_characteristicdetail (characteristic_id, characteristicdetail_id) VALUES (4,4);
INSERT INTO characteristic_characteristicdetail (characteristic_id, characteristicdetail_id) VALUES (5,5);
INSERT INTO characteristic_characteristicdetail (characteristic_id, characteristicdetail_id) VALUES (6,6);
INSERT INTO characteristic_characteristicdetail (characteristic_id, characteristicdetail_id) VALUES (7,7);
INSERT INTO characteristic_characteristicdetail (characteristic_id, characteristicdetail_id) VALUES (2,10);

INSERT INTO marca (id, title, foto) VALUES (1,'AMD','amd.jpg');
INSERT INTO marca (id, title, foto) VALUES (2,'HP','hp.jpg');
INSERT INTO marca (id, title, foto) VALUES (3,'ASUS','asus.jpg');
INSERT INTO marca (id, title, foto) VALUES (4,'DELL','dell.jpg');
INSERT INTO marca (id, title, foto) VALUES (5,'LENOVO','lenovo.jpg');
INSERT INTO marca (id, title, foto) VALUES (6,'ACER','acer.jpg');

INSERT INTO product (id, user_id, title, marca_id, meta_title, slug, summary, type, sku, price, discount, quantity, shop, created_at, updated_at, published_at, starts_at, ends_at, content) VALUES (1,1,'Celular Xiaomi Mi 11',1,'Mi 11','81c9fcb6-cb6a-4f70-912b-cf83d319ccee_mi11.jpg','algo',123,'mi_11_ve',3150,0,5,1,'2021-01-01 00:00:00','2021-01-01 00:00:00','2021-01-01 00:00:00','2021-01-01 00:00:00','2021-01-01 00:00:00','si');
INSERT INTO product (id, user_id, title, marca_id, meta_title, slug, summary, type, sku, price, discount, quantity, shop, created_at, updated_at, published_at, starts_at, ends_at, content) VALUES (2,1,'Celular Xiaomi Redmi 7',1,'Mi 11','53d4611b-5887-4ac1-9c55-d4647279bab6_redmi7.png','algo',123,'mi_11_ve',1000,0,5,1,'2021-01-01 00:00:00','2021-01-01 00:00:00','2021-01-01 00:00:00','2021-01-01 00:00:00','2021-01-01 00:00:00','si');
INSERT INTO product (id, user_id, title, marca_id, meta_title, slug, summary, type, sku, price, discount, quantity, shop, created_at, updated_at, published_at, starts_at, ends_at, content) VALUES (3,1,'Celular Xiaomi Redmi 8',1,'Mi 11','e1c9dd05-6e7d-4ed8-91bd-f2a79de5cfaa_redmi8.jpeg','algo',123,'mi_11_ve',1150,0,5,1,'2021-01-01 00:00:00','2021-01-01 00:00:00','2021-01-01 00:00:00','2021-01-01 00:00:00','2021-01-01 00:00:00','si');
INSERT INTO product (id, user_id, title, marca_id, meta_title, slug, summary, type, sku, price, discount, quantity, shop, created_at, updated_at, published_at, starts_at, ends_at, content) VALUES (4,1,'Celular Xiaomi Redmi 9',1,'Mi 11','eca55a7f-45e2-45be-bc9a-44ab55184244_redmi9.jpg','algo',123,'mi_11_ve',950,0,5,1,'2021-01-01 00:00:00','2021-01-01 00:00:00','2021-01-01 00:00:00','2021-01-01 00:00:00','2021-01-01 00:00:00','si');
INSERT INTO product (id, user_id, title, marca_id, meta_title, slug, summary, type, sku, price, discount, quantity, shop, created_at, updated_at, published_at, starts_at, ends_at, content) VALUES (5,1,'Celular Xiaomi Redmi 10',1,'Mi 11','92c911d3-7164-4c5f-a9a2-db880313451b_redmi10.jpg','algo',123,'mi_11_ve',300,0,5,1,'2021-01-01 00:00:00','2021-01-01 00:00:00','2021-01-01 00:00:00','2021-01-01 00:00:00','2021-01-01 00:00:00','si');
INSERT INTO product (id, user_id, title, marca_id, meta_title, slug, summary, type, sku, price, discount, quantity, shop, created_at, updated_at, published_at, starts_at, ends_at, content) VALUES (6,1,'Celular Xiaomi Redmi 7 Lite',1,'Mi 11','910fdf8b-8abf-4dfa-bc01-24b63eaec1ea_redmi7lite.jpg','algo',123,'mi_11_ve',550,0,5,1,'2021-01-01 00:00:00','2021-01-01 00:00:00','2021-01-01 00:00:00','2021-01-01 00:00:00','2021-01-01 00:00:00','si');
INSERT INTO product (id, user_id, title, marca_id, meta_title, slug, summary, type, sku, price, discount, quantity, shop, created_at, updated_at, published_at, starts_at, ends_at, content) VALUES (7,1,'Celular Xiaomi Redmi 8 Lite',1,'Mi 11','924ee29a-df79-48cf-b7e0-8e04fafa889f_redmi8lite.jpg','algo',123,'mi_11_ve',680,0,5,1,'2021-01-01 00:00:00','2021-01-01 00:00:00','2021-01-01 00:00:00','2021-01-01 00:00:00','2021-01-01 00:00:00','si');
INSERT INTO product (id, user_id, title, marca_id, meta_title, slug, summary, type, sku, price, discount, quantity, shop, created_at, updated_at, published_at, starts_at, ends_at, content) VALUES (8,1,'Celular Xiaomi Redmi 9 Lite',1,'Mi 11','7f991c43-d591-4650-8b3e-ab1563509356_redmi9lite.jpg','algo',123,'mi_11_ve',720,0,5,1,'2021-01-01 00:00:00','2021-01-01 00:00:00','2021-01-01 00:00:00','2021-01-01 00:00:00','2021-01-01 00:00:00','si');
INSERT INTO product (id, user_id, title, marca_id, meta_title, slug, summary, type, sku, price, discount, quantity, shop, created_at, updated_at, published_at, starts_at, ends_at, content) VALUES (9,1,'Celular Xiaomi Redmi 10 Lite',1,'Mi 11','https://jhs-shop01.s3.amazonaws.com/0f9be8dc-966c-4fd5-af08-19bc7e8e4c14_redmi10lite.jpg','algo',123,'mi_11_ve',120,0,5,1,'2021-01-01 00:00:00','2021-01-01 00:00:00','2021-01-01 00:00:00','2021-01-01 00:00:00','2021-01-01 00:00:00','si');
INSERT INTO product (id, user_id, title, marca_id, meta_title, slug, summary, type, sku, price, discount, quantity, shop, created_at, updated_at, published_at, starts_at, ends_at, content) VALUES (10,1,'Celular Xiaomi Redmi 7 Pro',1,'Mi 11','79b14086-57ca-4fce-9be7-e2d159acbc20_redmi7pro.jpg','algo',123,'mi_11_ve',350,0,5,1,'2021-01-01 00:00:00','2021-01-01 00:00:00','2021-01-01 00:00:00','2021-01-01 00:00:00','2021-01-01 00:00:00','si');
INSERT INTO product (id, user_id, title, marca_id, meta_title, slug, summary, type, sku, price, discount, quantity, shop, created_at, updated_at, published_at, starts_at, ends_at, content) VALUES (11,1,'Celular Xiaomi Redmi 8 Pro',1,'Mi 11','d0f45d65-f178-4e1e-a433-32f95158828e_redmi8pro.jpg','algo',123,'mi_11_ve',1120,0,5,1,'2021-01-01 00:00:00','2021-01-01 00:00:00','2021-01-01 00:00:00','2021-01-01 00:00:00','2021-01-01 00:00:00','si');
INSERT INTO product (id, user_id, title, marca_id, meta_title, slug, summary, type, sku, price, discount, quantity, shop, created_at, updated_at, published_at, starts_at, ends_at, content) VALUES (12,1,'Celular Xiaomi Redmi 9 Pro',1,'Mi 11','ccd12c77-8a27-4e33-9fac-47dc3db6f469_redmi9pro.png','algo',123,'mi_11_ve',880,0,5,1,'2021-01-01 00:00:00','2021-01-01 00:00:00','2021-01-01 00:00:00','2021-01-01 00:00:00','2021-01-01 00:00:00','si');
INSERT INTO product (id, user_id, title, marca_id, meta_title, slug, summary, type, sku, price, discount, quantity, shop, created_at, updated_at, published_at, starts_at, ends_at, content) VALUES (13,1,'Celular Xiaomi Redmi 10 Pro',1,'Mi 11','f7fed018-1d75-42d4-9ce6-7ccf66defd61_redmi10pro.jpg','algo',123,'mi_11_ve',920,0,5,1,'2021-01-01 00:00:00','2021-01-01 00:00:00','2021-01-01 00:00:00','2021-01-01 00:00:00','2021-01-01 00:00:00','si');
INSERT INTO product (id, user_id, title, marca_id, meta_title, slug, summary, type, sku, price, discount, quantity, shop, created_at, updated_at, published_at, starts_at, ends_at, content) VALUES (14,1,'Celular Xiaomi Poco X3',1,'Mi 11','88d54a8a-61d7-4677-8e33-3716ded63dc9_pocox3.jpg','algo',123,'mi_11_ve',1530,0,5,1,'2021-01-01 00:00:00','2021-01-01 00:00:00','2021-01-01 00:00:00','2021-01-01 00:00:00','2021-01-01 00:00:00','si');
INSERT INTO product (id, user_id, title, marca_id, meta_title, slug, summary, type, sku, price, discount, quantity, shop, created_at, updated_at, published_at, starts_at, ends_at, content) VALUES (15,1,'Tablet',1,'Tablet','898fe977-6884-44c8-9774-5ab47a6af15b_20180504_214256.jpg','',0,'Tablet_lenovo',1850,0,1,1,'2020-12-31 19:00:00','2020-12-31 19:00:00','2020-12-31 19:00:00','2020-12-31 19:00:00','2020-12-31 19:00:00','Algo');
INSERT INTO product (id, user_id, title, marca_id, meta_title, slug, summary, type, sku, price, discount, quantity, shop, created_at, updated_at, published_at, starts_at, ends_at, content) VALUES (17,1,'laptop hp dv7',1,'laptop hp dv7','cc8e97df-3d19-4270-b4b9-3ccec8933809_laptop-hp-15.jpg','',0,'laptop hp dv7',5605,0,1,1,'2020-12-31 19:00:00','2020-12-31 19:00:00','2020-12-31 19:00:00','2020-12-31 19:00:00','2020-12-31 19:00:00','sdd');
INSERT INTO product (id, user_id, title, marca_id, meta_title, slug, summary, type, sku, price, discount, quantity, shop, created_at, updated_at, published_at, starts_at, ends_at, content) VALUES (18,1,'laptop hp dv8',1,'laptop hp dv8','67ce6d16-296d-427b-b666-19511b46b3dc_laptop-hp-15.jpg','',0,'laptop hp dv8',5605,0,1,1,'2020-12-31 19:00:00','2020-12-31 19:00:00','2020-12-31 19:00:00','2020-12-31 19:00:00','2020-12-31 19:00:00','sdd');
INSERT INTO product (id, user_id, title, marca_id, meta_title, slug, summary, type, sku, price, discount, quantity, shop, created_at, updated_at, published_at, starts_at, ends_at, content) VALUES (19,1,'Laptop HP DV9',1,'Laptop HP DV9','90aae065-069f-4f0d-ab5d-9c9dacc14b7c_laptop-hp-15.jpg','',0,'Laptop HP DV9',7000,0,1,1,'2020-12-31 19:00:00','2020-12-31 19:00:00','2020-12-31 19:00:00','2020-12-31 19:00:00','2020-12-31 19:00:00','sdd');

INSERT INTO relations (id, category_id, subcategory_id, characteristic_id, characteristicdetail_id) VALUES (14,1,1,1,1),(15,1,1,2,10),(16,1,1,3,3),(17,1,1,4,4),(18,1,1,5,5),(19,1,1,6,6),(20,1,1,7,7);
INSERT INTO `productdetail` VALUES (17,18,14),(18,18,15),(19,18,16),(20,18,17),(21,18,18),(22,18,19),(23,18,20),(24,19,14),(25,19,15),(26,19,16),(27,19,17),(28,19,18),(29,19,19),(30,19,20);



