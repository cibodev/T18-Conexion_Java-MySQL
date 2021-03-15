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
		db.createDB("PiezasDB");
		db.createTable("PiezasDB", "CREATE TABLE Cientificos (Codigo INT NOT NULL, Nombre VARCHAR(100), PRIMARY KEY (Codigo));");
		db.createTable("PiezasDB", "CREATE TABLE Proyecto (ID CHAR(4) NOT NULL, Nombre VARCHAR(100), PRIMARY KEY (ID));");
		db.createTable("PiezasDB", "CREATE TABLE Suministra (CodigoPieza INT NOT NULL, idProveedor CHAR(4) NOT NULL, Precio INT,  PRIMARY KEY(CodigoPieza, idProveedor), FOREIGN KEY (CodigoPieza) REFERENCES Piezas(Codigo), FOREIGN KEY (idProveedor) REFERENCES Proveedores(id));");
		db.insertData("PiezasDB", "INSERT INTO Piezas (Codigo, Nombre) VALUES (\"1\", \"1\");");
		db.insertData("PiezasDB", "INSERT INTO Piezas (Codigo, Nombre) VALUES (\"2\", \"2\");");
		db.insertData("PiezasDB", "INSERT INTO Piezas (Codigo, Nombre) VALUES (\"3\", \"3\");");
		db.insertData("PiezasDB", "INSERT INTO Piezas (Codigo, Nombre) VALUES (\"4\", \"4\");");
		db.insertData("PiezasDB", "INSERT INTO Piezas (Codigo, Nombre) VALUES (\"5\", \"5\");");
		db.insertData("PiezasDB", "INSERT INTO Proveedores (ID, Nombre) VALUES (\"1\", \"1\");");
		db.insertData("PiezasDB", "INSERT INTO Proveedores (ID, Nombre) VALUES (\"2\", \"2\");");
		db.insertData("PiezasDB", "INSERT INTO Proveedores (ID, Nombre) VALUES (\"3\", \"3\");");
		db.insertData("PiezasDB", "INSERT INTO Proveedores (ID, Nombre) VALUES (\"4\", \"4\");");
		db.insertData("PiezasDB", "INSERT INTO Proveedores (ID, Nombre) VALUES (\"5\", \"5\");");
		db.insertData("PiezasDB", "INSERT INTO Suministra (CodigoPieza, idProveedor) VALUES (\"1\", \"1\");");
		db.insertData("PiezasDB", "INSERT INTO Suministra (CodigoPieza, idProveedor) VALUES (\"2\", \"2\");");
		db.insertData("PiezasDB", "INSERT INTO Suministra (CodigoPieza, idProveedor) VALUES (\"3\", \"3\");");
		db.insertData("PiezasDB", "INSERT INTO Suministra (CodigoPieza, idProveedor) VALUES (\"4\", \"4\");");
		db.insertData("PiezasDB", "INSERT INTO Suministra (CodigoPieza, idProveedor) VALUES (\"5\", \"5\");");
		System.out.println("Piezas");
		db.getValues("PiezasDB", "Piezas", "Codigo", "Nombre");
		System.out.println("Proveedores");
		db.getValues("PiezasDB", "Proveedores", "ID", "Nombre");
		System.out.println("Suministra");
		db.getValues("PiezasDB", "Suministra", "CodigoPieza", "idProveedor", "Precio");
		db.closeConnection();
	}


}
