INSERT INTO refugio (nombre_refugio) VALUES ('Refugio A');
INSERT INTO refugio (nombre_refugio) VALUES ('Refugio B');
INSERT INTO refugio (nombre_refugio) VALUES ('Refugio C');
INSERT INTO refugio (nombre_refugio) VALUES ('Refugio D');
INSERT INTO refugio (nombre_refugio) VALUES ('Refugio E');

INSERT INTO banco (banco, NIT) VALUES ('Banco X', 'NITX123');
INSERT INTO banco (banco, NIT) VALUES ('Banco Y', 'NITY456');
INSERT INTO banco (banco, NIT) VALUES ('Banco Z', 'NITZ789');
INSERT INTO banco (banco, NIT) VALUES ('Banco W', 'NITW012');
INSERT INTO banco (banco, NIT) VALUES ('Banco V', 'NITV345');


INSERT INTO director(nombre,apellidos,telefono,email) VALUES ('hola','asdqw','adsqwd','qwdqwd');
INSERT INTO director(nombre,apellidos,telefono,email) VALUES ('hola','asdqw','adsqwd','qwdqwd');
INSERT INTO director(nombre,apellidos,telefono,email) VALUES ('hola','asdqw','adsqwd','qwdqwd');
INSERT INTO director(nombre,apellidos,telefono,email) VALUES ('hola','asdqw','adsqwd','qwdqwd');
INSERT INTO director(nombre,apellidos,telefono,email) VALUES ('hola','asdqw','adsqwd','qwdqwd');
INSERT INTO director(nombre,apellidos,telefono,email) VALUES ('hola','asdqw','adsqwd','qwdqwd');
INSERT INTO director(nombre,apellidos,telefono,email) VALUES ('hola','asdqw','adsqwd','qwdqwd');



INSERT INTO sede (ciudad, direccion, pais, estado, director_id) VALUES ('Ciudad A', 'Dirección A1', 'País A', 'Activa', 1);
INSERT INTO sede (ciudad, direccion, pais, estado, director_id) VALUES ('Ciudad B', 'Dirección B1', 'País B', 'Inactiva', 2);
INSERT INTO sede (ciudad, direccion, pais, estado, director_id) VALUES ('Ciudad C', 'Dirección C1', 'País C', 'Activa', 3);
INSERT INTO sede (ciudad, direccion, pais, estado, director_id) VALUES ('Ciudad D', 'Dirección D1', 'País D', 'Inactiva', 4);
INSERT INTO sede (ciudad, direccion, pais, estado, director_id) VALUES ('Ciudad E', 'Dirección E1', 'País E', 'Activa', 5);

INSERT INTO socio(nombre, apellidos, telefono, email, sede_id, banco_id) VALUES ('Juan', 'Perez', '123456789', 'juan.perez@email.com', 1, 1);
INSERT INTO socio(nombre, apellidos, telefono, email, sede_id, banco_id) VALUES ('Maria', 'Lopez', '987654321', 'maria.lopez@email.com', 2, 2);
INSERT INTO socio(nombre, apellidos, telefono, email, sede_id, banco_id) VALUES ('Carlos', 'Gonzalez', '456789012', 'carlos.gonzalez@email.com', 4, 1);
INSERT INTO socio(nombre, apellidos, telefono, email, sede_id, banco_id) VALUES ('Ana', 'Martinez', '345678901', 'ana.martinez@email.com', 3, 3);

INSERT INTO voluntario (nombre, apellidos, telefono, email, tipo_voluntario, profesion) VALUES ('Ana', 'García', '555123456', 'ana.garcia@email.com', 'Tipo 3', 'Psicóloga');
INSERT INTO voluntario (nombre, apellidos, telefono, email, tipo_voluntario, profesion) VALUES ('Carlos', 'Martínez', '555987654', 'carlos.martinez@email.com', 'Tipo 1', 'Educador');
INSERT INTO voluntario (nombre, apellidos, telefono, email, tipo_voluntario, profesion) VALUES ('Laura', 'Rodríguez', '555567890', 'laura.rodriguez@email.com', 'Tipo 2', 'Enfermera');
INSERT INTO voluntario (nombre, apellidos, telefono, email, tipo_voluntario, profesion) VALUES ('Miguel', 'Fernández', '555234567', 'miguel.fernandez@email.com', 'Tipo 3', 'Abogado');
INSERT INTO voluntario (nombre, apellidos, telefono, email, tipo_voluntario, profesion) VALUES ('Isabel', 'López', '555876543', 'isabel.lopez@email.com', 'Tipo 1', 'Artista');
