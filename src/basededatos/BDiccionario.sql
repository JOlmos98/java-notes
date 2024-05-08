
CREATE DATABASE BDiccionario;
USE BDiccionario;

CREATE TABLE TTraducciones (
  Id   INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  Esp  VARCHAR(45),
  Ing  VARCHAR(45)
);

INSERT INTO TTraducciones (Esp,Ing) VALUES ('RATON', 'MOUSE');
INSERT INTO TTRaducciones (Esp,Ing) VALUES ('pegatina', 'STICKER');
INSERT INTO TTRaducciones (Esp,Ing) VALUES ('teclado', 'keyboard');
INSERT INTO TTRaducciones (Esp,Ing) VALUES ('nube', 'cloud');
INSERT INTO TTRaducciones (Esp,Ing) VALUES ('flor', 'flower');
INSERT INTO TTRaducciones (Esp,Ing) VALUES ('NARANJA', 'orange');
INSERT INTO TTRaducciones (Esp,Ing) VALUES ('amigo', 'friend');
INSERT INTO TTRaducciones (Esp,Ing) VALUES ('hola', 'hello');
INSERT INTO TTRaducciones (Esp,Ing) VALUES ('cargador', 'charger');
INSERT INTO TTRaducciones (Esp,Ing) VALUES ('pantalla', 'screen');
INSERT INTO TTRaducciones (Esp,Ing) VALUES ('gafas', 'glasses');
INSERT INTO TTRaducciones (Esp,Ing) VALUES ('libro', 'book');
INSERT INTO TTRaducciones (Esp,Ing) VALUES ('profesor', 'teacher');