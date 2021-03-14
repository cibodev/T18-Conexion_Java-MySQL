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
		db.createDB("Tienda_Informatica");
		db.createTable("Tienda_Informatica", "CREATE TABLE Fabricantes (Codigo INT NOT NULL, Nombre VARCHAR(50), PRIMARY KEY (Codigo));");
		db.createTable("Tienda_Informatica", "CREATE TABLE Articulos (Codigo INT NOT NULL AUTO_INCREMENT, Nombre VARCHAR(100), Precio INT, Fabricante INT, PRIMARY KEY(Codigo), FOREIGN KEY (Fabricante) REFERENCES Fabricantes(Codigo));");
		db.insertData("Tienda_Informatica", "INSERT INTO Fabricantes (Codigo, Nombre) VALUES (\"1\", \"Fabricante 1\");");
		db.insertData("Tienda_Informatica", "INSERT INTO Fabricantes (Codigo, Nombre) VALUES (\"2\", \"Fabricante 2\");");
		db.insertData("Tienda_Informatica", "INSERT INTO Fabricantes (Codigo, Nombre) VALUES (\"3\", \"Fabricante 3\");");
		db.insertData("Tienda_Informatica", "INSERT INTO Fabricantes (Codigo, Nombre) VALUES (\"4\", \"Fabricante 4\");");
		db.insertData("Tienda_Informatica", "INSERT INTO Fabricantes (Codigo, Nombre) VALUES (\"5\", \"Fabricante 5\");");
		db.insertData("Tienda_Informatica", "INSERT INTO Articulos (Nombre, Precio, Fabricante) VALUES (\"Nombre 1\", \"10\", \"1\");");
		db.insertData("Tienda_Informatica", "INSERT INTO Articulos (Nombre, Precio, Fabricante) VALUES (\"Nombre 2\", \"10\", \"2\");");
		db.insertData("Tienda_Informatica", "INSERT INTO Articulos (Nombre, Precio, Fabricante) VALUES (\"Nombre 3\", \"10\", \"3\");");
		db.insertData("Tienda_Informatica", "INSERT INTO Articulos (Nombre, Precio, Fabricante) VALUES (\"Nombre 4\", \"10\", \"4\");");
		db.insertData("Tienda_Informatica", "INSERT INTO Articulos (Nombre, Precio, Fabricante) VALUES (\"Nombre 5\", \"10\", \"5\");");
		System.out.println("Fabricantes");
		db.getValuesFabricantes("Tienda_Informatica");
		System.out.println("Articulos");
		db.getValuesArticulos("Tienda_Informatica");
		db.closeConnection();
	}


}
