/* Populate tables */
INSERT INTO entidades (nombre, apellido, email, telefono) VALUES('Andres', 'Guzman', 'profesor@bolsadeideas.com', '245');
INSERT INTO entidades (nombre, apellido, email, telefono) VALUES('John', 'Doe', 'john.doe@gmail.com', '');
INSERT INTO entidades (nombre, apellido, email, telefono) VALUES('Linus', 'Torvalds', 'linus.torvalds@gmail.com', '');
INSERT INTO entidades (nombre, apellido, email, telefono) VALUES('Jane', 'Doe', 'jane.doe@gmail.com', '');
INSERT INTO entidades (nombre, apellido, email, telefono) VALUES('Rasmus', 'Lerdorf', 'rasmus.lerdorf@gmail.com', '');
INSERT INTO entidades (nombre, apellido, email, telefono) VALUES('Erich', 'Gamma', 'erich.gamma@gmail.com', '');
INSERT INTO entidades (nombre, apellido, email, telefono) VALUES('Richard', 'Helm', 'richard.helm@gmail.com','');
INSERT INTO entidades (nombre, apellido, email, telefono) VALUES('Ralph', 'Johnson', 'ralph.johnson@gmail.com', '');
INSERT INTO entidades (nombre, apellido, email, telefono) VALUES('John', 'Vlissides', 'john.vlissides@gmail.com', '');
INSERT INTO entidades (nombre, apellido, email, telefono) VALUES('James', 'Gosling', 'james.gosling@gmail.com', '');
INSERT INTO entidades (nombre, apellido, email, telefono) VALUES('Bruce', 'Lee', 'bruce.lee@gmail.com', '');
INSERT INTO entidades (nombre, apellido, email, telefono) VALUES('Johnny', 'Doe', 'johnny.doe@gmail.com', '');
INSERT INTO entidades (nombre, apellido, email, telefono) VALUES('John', 'Roe', 'john.roe@gmail.com', '');
INSERT INTO entidades (nombre, apellido, email, telefono) VALUES('Jane', 'Roe', 'jane.roe@gmail.com',  '');
INSERT INTO entidades (nombre, apellido, email, telefono) VALUES('Richard', 'Doe', 'richard.doe@gmail.com', '');
INSERT INTO entidades (nombre, apellido, email, telefono) VALUES('Janie', 'Doe', 'janie.doe@gmail.com',  '');
INSERT INTO entidades (nombre, apellido, email, telefono) VALUES('Phillip', 'Webb', 'phillip.webb@gmail.com', '');
INSERT INTO entidades (nombre, apellido, email, telefono) VALUES('Stephane', 'Nicoll', 'stephane.nicoll@gmail.com', '');
INSERT INTO entidades (nombre, apellido, email, telefono) VALUES('Sam', 'Brannen', 'sam.brannen@gmail.com', '');  
INSERT INTO entidades (nombre, apellido, email, telefono) VALUES('Juergen', 'Hoeller', 'juergen.Hoeller@gmail.com', ''); 
INSERT INTO entidades (nombre, apellido, email, telefono) VALUES('Janie', 'Roe', 'janie.roe@gmail.com', '');
INSERT INTO entidades (nombre, apellido, email, telefono) VALUES('John', 'Smith', 'john.smith@gmail.com', '');
INSERT INTO entidades (nombre, apellido, email, telefono) VALUES('Joe', 'Bloggs', 'joe.bloggs@gmail.com', '');
INSERT INTO entidades (nombre, apellido, email, telefono) VALUES('John', 'Stiles', 'john.stiles@gmail.com', '');
INSERT INTO entidades (nombre, apellido, email, telefono) VALUES('Richard', 'Roe', 'stiles.roe@gmail.com', '');

/* Populate tabla mercaderias */
INSERT INTO mercaderias (nombre_mercaderia, precio) VALUES('Panasonic Pantalla LCD', 259990);
INSERT INTO mercaderias (nombre_mercaderia, precio) VALUES('Sony Camara digital DSC-W320B', 123490);
INSERT INTO mercaderias (nombre_mercaderia, precio) VALUES('Apple iPod shuffle', 1499990);
INSERT INTO mercaderias (nombre_mercaderia, precio) VALUES('Sony Notebook Z110', 37990);
INSERT INTO mercaderias (nombre_mercaderia, precio) VALUES('Hewlett Packard Multifuncional F2280', 69990);
INSERT INTO mercaderias (nombre_mercaderia, precio) VALUES('Bianchi Bicicleta Aro 26', 69990);
INSERT INTO mercaderias (nombre_mercaderia, precio) VALUES('Mica Comoda 5 Cajones', 299990);

/* Creamos algunas facturas */
INSERT INTO facturas (descripcion, observacion, entidad_cod_entidad, create_at) VALUES('Factura equipos de oficina', null, 1, NOW());
INSERT INTO facturas_items (cantidad, factura_id, mercaderia_id) VALUES(1, 1, 1);
INSERT INTO facturas_items (cantidad, factura_id, mercaderia_id) VALUES(2, 1, 4);
INSERT INTO facturas_items (cantidad, factura_id, mercaderia_id) VALUES(1, 1, 5);
INSERT INTO facturas_items (cantidad, factura_id, mercaderia_id) VALUES(1, 1, 7);

INSERT INTO facturas (descripcion, observacion, entidad_cod_entidad, create_at) VALUES('Factura Bicicleta', 'Alguna nota importante!', 1, NOW());
INSERT INTO facturas_items (cantidad, factura_id, mercaderia_id) VALUES(3, 2, 6);