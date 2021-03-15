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
		db.createDB("GrandesAlmacenesDB");
		db.createTable("GrandesAlmacenesDB", "CREATE TABLE Cajeros (Codigo INT NOT NULL, NomApels VARCHAR(255), PRIMARY KEY (Codigo));");
		db.createTable("GrandesAlmacenesDB", "CREATE TABLE Productos (Codigo INT NOT NULL, Nombre VARCHAR(100), Precio INT, PRIMARY KEY (Codigo));");
		db.createTable("GrandesAlmacenesDB", "CREATE TABLE Maquinas_Registradoras (Codigo INT NOT NULL, Piso INT, PRIMARY KEY (Codigo));");
		db.createTable("GrandesAlmacenesDB", "CREATE TABLE Venta (Cajero INT NOT NULL, Maquina INT NOT NULL, Producto  INT NOT NULL, PRIMARY KEY(Cajero, Maquina, Producto), FOREIGN KEY (Cajero) REFERENCES Cajeros(Codigo), FOREIGN KEY (Maquina) REFERENCES Maquinas_Registradoras(Codigo), FOREIGN KEY (Producto) REFERENCES Productos(Codigo));");
		db.insertData("GrandesAlmacenesDB", "INSERT INTO Cajeros (Codigo, NomApels) VALUES (\"1\", \"1\");");
		db.insertData("GrandesAlmacenesDB", "INSERT INTO Cajeros (Codigo, NomApels) VALUES (\"2\", \"2\");");
		db.insertData("GrandesAlmacenesDB", "INSERT INTO Cajeros (Codigo, NomApels) VALUES (\"3\", \"3\");");
		db.insertData("GrandesAlmacenesDB", "INSERT INTO Cajeros (Codigo, NomApels) VALUES (\"4\", \"4\");");
		db.insertData("GrandesAlmacenesDB", "INSERT INTO Cajeros (Codigo, NomApels) VALUES (\"5\", \"5\");");
		db.insertData("GrandesAlmacenesDB", "INSERT INTO Productos (Codigo, Nombre) VALUES (\"1\", \"1\");");
		db.insertData("GrandesAlmacenesDB", "INSERT INTO Productos (Codigo, Nombre) VALUES (\"2\", \"2\");");
		db.insertData("GrandesAlmacenesDB", "INSERT INTO Productos (Codigo, Nombre) VALUES (\"3\", \"3\");");
		db.insertData("GrandesAlmacenesDB", "INSERT INTO Productos (Codigo, Nombre) VALUES (\"4\", \"4\");");
		db.insertData("GrandesAlmacenesDB", "INSERT INTO Productos (Codigo, Nombre) VALUES (\"5\", \"5\");");
		db.insertData("GrandesAlmacenesDB", "INSERT INTO Maquinas_Registradoras (Codigo, Piso) VALUES (\"1\", \"1\");");
		db.insertData("GrandesAlmacenesDB", "INSERT INTO Maquinas_Registradoras (Codigo, Piso) VALUES (\"2\", \"2\");");
		db.insertData("GrandesAlmacenesDB", "INSERT INTO Maquinas_Registradoras (Codigo, Piso) VALUES (\"3\", \"3\");");
		db.insertData("GrandesAlmacenesDB", "INSERT INTO Maquinas_Registradoras (Codigo, Piso) VALUES (\"4\", \"4\");");
		db.insertData("GrandesAlmacenesDB", "INSERT INTO Maquinas_Registradoras (Codigo, Piso) VALUES (\"5\", \"5\");");
		db.insertData("GrandesAlmacenesDB", "INSERT INTO Venta (Cajero, Maquina, Producto) VALUES (\"1\", \"1\", \"1\");");
		db.insertData("GrandesAlmacenesDB", "INSERT INTO Venta (Cajero, Maquina, Producto) VALUES (\"2\", \"2\", \"2\");");
		db.insertData("GrandesAlmacenesDB", "INSERT INTO Venta (Cajero, Maquina, Producto) VALUES (\"3\", \"3\", \"3\");");
		db.insertData("GrandesAlmacenesDB", "INSERT INTO Venta (Cajero, Maquina, Producto) VALUES (\"4\", \"4\", \"4\");");
		db.insertData("GrandesAlmacenesDB", "INSERT INTO Venta (Cajero, Maquina, Producto) VALUES (\"5\", \"5\", \"5\");");
		System.out.println("Cajeros");
		db.getValues("GrandesAlmacenesDB", "Cajeros", "Codigo", "NomApels");
		System.out.println("Productos");
		db.getValues("GrandesAlmacenesDB", "Productos", "Codigo", "Nombre");
		System.out.println("Maquinas_Registradoras");
		db.getValues("GrandesAlmacenesDB", "Maquinas_Registradoras", "Codigo", "Piso");
		System.out.println("Venta");
		db.getValues("GrandesAlmacenesDB", "Venta", "Cajero", "Maquina", "Producto");
		db.closeConnection();
	}
}

