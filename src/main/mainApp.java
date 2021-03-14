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
		db.createDB("AlmacenesDB");
		db.createTable("AlmacenesDB", "CREATE TABLE Almacenes (Codigo INT NOT NULL, Lugar VARCHAR(100), Capacidad INT, PRIMARY KEY (Codigo));");
		db.createTable("AlmacenesDB", "CREATE TABLE Cajas (NumRef CHAR(5) NOT NULL, Contenido VARCHAR(100), Valor INT, Almacen INT, PRIMARY KEY(NumRef), FOREIGN KEY (Almacen) REFERENCES Almacenes(Codigo));");
		db.insertData("AlmacenesDB", "INSERT INTO Almacenes (Codigo, Lugar) VALUES (\"1\", \"1\");");
		db.insertData("AlmacenesDB", "INSERT INTO Almacenes (Codigo, Lugar) VALUES (\"2\", \"2\");");
		db.insertData("AlmacenesDB", "INSERT INTO Almacenes (Codigo, Lugar) VALUES (\"3\", \"3\");");
		db.insertData("AlmacenesDB", "INSERT INTO Almacenes (Codigo, Lugar) VALUES (\"4\", \"4\");");
		db.insertData("AlmacenesDB", "INSERT INTO Almacenes (Codigo, Lugar) VALUES (\"5\", \"5\");");
		db.insertData("AlmacenesDB", "INSERT INTO Cajas (NumRef, Contenido, Valor, Almacen) VALUES (\"11111\", \"1\", \"1\", \"1\");");
		db.insertData("AlmacenesDB", "INSERT INTO Cajas (NumRef, Contenido, Valor, Almacen) VALUES (\"22222\", \"2\", \"2\", \"2\");");
		db.insertData("AlmacenesDB", "INSERT INTO Cajas (NumRef, Contenido, Valor, Almacen) VALUES (\"33333\", \"3\", \"3\", \"3\");");
		db.insertData("AlmacenesDB", "INSERT INTO Cajas (NumRef, Contenido, Valor, Almacen) VALUES (\"44444\", \"4\", \"4\", \"4\");");
		db.insertData("AlmacenesDB", "INSERT INTO Cajas (NumRef, Contenido, Valor, Almacen) VALUES (\"55555\", \"5\", \"5\", \"5\");");
		System.out.println("Almacenes");
		db.getValuesAlmacenes("AlmacenesDB");
		System.out.println("Cajas");
		db.getValuesCajas("AlmacenesDB");
		db.closeConnection();
	}


}
