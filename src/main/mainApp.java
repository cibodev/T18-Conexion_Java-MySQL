package main;
/**
 * 
 */

import java.sql.SQLException;

/**
 * @author User
 *
 */

import models.db;




public class mainApp {

	/**
	 * @param args
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		db.connectDB("root", "");
		db.createDB("PeliculasDB");
		db.createTable("PeliculasDB", "CREATE TABLE Peliculas (Codigo INT NOT NULL, Nombre VARCHAR(100), Edad INT, PRIMARY KEY (Codigo));");
		db.createTable("PeliculasDB", "CREATE TABLE Salas (Codigo INT NOT NULL, Nombre VARCHAR(100), Pelicula INT, PRIMARY KEY(Codigo), FOREIGN KEY (Pelicula) REFERENCES Peliculas(Codigo));");
		db.insertData("PeliculasDB", "INSERT INTO Peliculas (Codigo, Nombre) VALUES (\"1\", \"1\");");
		db.insertData("PeliculasDB", "INSERT INTO Peliculas (Codigo, Nombre) VALUES (\"2\", \"2\");");
		db.insertData("PeliculasDB", "INSERT INTO Peliculas (Codigo, Nombre) VALUES (\"3\", \"3\");");
		db.insertData("PeliculasDB", "INSERT INTO Peliculas (Codigo, Nombre) VALUES (\"4\", \"4\");");
		db.insertData("PeliculasDB", "INSERT INTO Peliculas (Codigo, Nombre) VALUES (\"5\", \"5\");");
		db.insertData("PeliculasDB", "INSERT INTO Salas (Codigo, Nombre, Pelicula) VALUES (\"11111\", \"1\", \"1\");");
		db.insertData("PeliculasDB", "INSERT INTO Salas (Codigo, Nombre, Pelicula) VALUES (\"22222\", \"2\", \"2\");");
		db.insertData("PeliculasDB", "INSERT INTO Salas (Codigo, Nombre, Pelicula) VALUES (\"33333\", \"3\", \"3\");");
		db.insertData("PeliculasDB", "INSERT INTO Salas (Codigo, Nombre, Pelicula) VALUES (\"44444\", \"4\", \"4\");");
		db.insertData("PeliculasDB", "INSERT INTO Salas (Codigo, Nombre, Pelicula) VALUES (\"55555\", \"5\", \"5\");");
		System.out.println("Almacenes");
		db.getValuesPeliculas("PeliculasDB");
		System.out.println("Cajas");
		db.getValuesSalas("PeliculasDB");
		db.closeConnection();
	}


}
