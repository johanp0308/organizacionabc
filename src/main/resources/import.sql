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

INSERT INTO Persona (nombre, apellidos, telefono, email) VALUES ('Juan', 'Pérez', '123456789', 'juan@example.com');
INSERT INTO Persona (nombre, apellidos, telefono, email) VALUES ('María', 'Gómez', '987654321', 'maria@example.com');
INSERT INTO Persona (nombre, apellidos, telefono, email) VALUES ('Carlos', 'Rodríguez', '555555555', 'carlos@example.com');
INSERT INTO Persona (nombre, apellidos, telefono, email) VALUES ('Laura', 'López', '111111111', 'laura@example.com');
INSERT INTO Persona (nombre, apellidos, telefono, email) VALUES ('Pedro', 'Martínez', '999999999', 'pedro@example.com');


INSERT INTO Sede (ciudad, direccion, pais, estado, persona_id) VALUES ('Ciudad A', 'Dirección A1', 'País A', 'Activa', 1);
INSERT INTO Sede (ciudad, direccion, pais, estado, persona_id) VALUES ('Ciudad B', 'Dirección B1', 'País B', 'Inactiva', 2);
INSERT INTO Sede (ciudad, direccion, pais, estado, persona_id) VALUES ('Ciudad C', 'Dirección C1', 'País C', 'Activa', 3);
INSERT INTO Sede (ciudad, direccion, pais, estado, persona_id) VALUES ('Ciudad D', 'Dirección D1', 'País D', 'Inactiva', 4);
INSERT INTO Sede (ciudad, direccion, pais, estado, persona_id) VALUES ('Ciudad E', 'Dirección E1', 'País E', 'Activa', 5);

INSERT INTO socio VALUES(1,1,1,1);