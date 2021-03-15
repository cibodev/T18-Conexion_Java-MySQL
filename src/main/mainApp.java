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
		db.createDB("DirectoresDB");
		db.createTable("DirectoresDB", "CREATE TABLE Despachos (Numero INT NOT NULL, Capacidad INT, PRIMARY KEY (Numero));");
		db.createTable("DirectoresDB", "CREATE TABLE Directores (DNI varchar(8) NOT NULL, NomApels VARCHAR(255), Despacho INT, DNIJefe varchar(8),  PRIMARY KEY(DNI), FOREIGN KEY (Despacho) REFERENCES Despachos(Numero), FOREIGN KEY (DNIJefe) REFERENCES Directores(dni));");
		db.insertData("DirectoresDB", "INSERT INTO Despachos (Numero, Capacidad) VALUES (\"1\", \"1\");");
		db.insertData("DirectoresDB", "INSERT INTO Despachos (Numero, Capacidad) VALUES (\"2\", \"2\");");
		db.insertData("DirectoresDB", "INSERT INTO Despachos (Numero, Capacidad) VALUES (\"3\", \"3\");");
		db.insertData("DirectoresDB", "INSERT INTO Despachos (Numero, Capacidad) VALUES (\"4\", \"4\");");
		db.insertData("DirectoresDB", "INSERT INTO Despachos (Numero, Capacidad) VALUES (\"5\", \"5\");");
		db.insertData("DirectoresDB", "INSERT INTO Directores (DNI, NomApels, Despacho) VALUES (\"1111111A\", \"1\", \"1\");");
		db.insertData("DirectoresDB", "INSERT INTO Directores (DNI, NomApels, Despacho, DNIJefe) VALUES (\"2222222B\", \"2\", \"2\", \"1111111A\");");
		db.insertData("DirectoresDB", "INSERT INTO Directores (DNI, NomApels, Despacho, DNIJefe) VALUES (\"3333333C\", \"3\", \"3\", \"1111111A\");");
		db.insertData("DirectoresDB", "INSERT INTO Directores (DNI, NomApels, Despacho, DNIJefe) VALUES (\"4444444D\", \"4\", \"4\", \"1111111A\");");
		db.insertData("DirectoresDB", "INSERT INTO Directores (DNI, NomApels, Despacho, DNIJefe) VALUES (\"5555555E\", \"5\", \"5\", \"1111111A\");");
		System.out.println("Despachos");
		db.getValues("DirectoresDB", "Despachos", "Numero", "Capacidad");
		System.out.println("Directores");
		db.getValues("DirectoresDB", "Directores", "DNI", "NomApels", "Despacho", "DNIJefe");
		db.closeConnection();
	}


}
