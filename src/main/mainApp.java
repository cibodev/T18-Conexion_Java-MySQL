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
		db.createDB("InvestigadoresDB");
		db.createTable("InvestigadoresDB", "CREATE TABLE Facultad (Codigo INT NOT NULL, Nombre VARCHAR(100), Precio INT, PRIMARY KEY (Codigo));");
		db.createTable("InvestigadoresDB", "CREATE TABLE Investigadores (DNI VARCHAR(8) NOT NULL, NomApels VARCHAR(255), Facultad INT, PRIMARY KEY (DNI), FOREIGN KEY (Facultad) REFERENCES Facultad(Codigo));");
		db.createTable("InvestigadoresDB", "CREATE TABLE Equipos (NumSerie CHAR(4) NOT NULL, Nombre VARCHAR(100), Facultad INT, PRIMARY KEY (NumSerie), FOREIGN KEY (Facultad) REFERENCES Facultad(Codigo));");
		db.createTable("InvestigadoresDB", "CREATE TABLE Reserva (Investigador VARCHAR(8) NOT NULL, Equipo CHAR(4) NOT NULL, Comienzo DATETIME, Fin DATETIME, PRIMARY KEY(Investigador, Equipo), FOREIGN KEY (Investigador) REFERENCES Investigadores(DNI), FOREIGN KEY (Equipo) REFERENCES Equipos(NumSerie));");
		db.insertData("InvestigadoresDB", "INSERT INTO Facultad (Codigo, Nombre) VALUES (\"1\", \"1\");");
		db.insertData("InvestigadoresDB", "INSERT INTO Facultad (Codigo, Nombre) VALUES (\"2\", \"2\");");
		db.insertData("InvestigadoresDB", "INSERT INTO Facultad (Codigo, Nombre) VALUES (\"3\", \"3\");");
		db.insertData("InvestigadoresDB", "INSERT INTO Facultad (Codigo, Nombre) VALUES (\"4\", \"4\");");
		db.insertData("InvestigadoresDB", "INSERT INTO Facultad (Codigo, Nombre) VALUES (\"5\", \"5\");");
		db.insertData("InvestigadoresDB", "INSERT INTO Investigadores (DNI, Facultad) VALUES (\"1\", \"1\");");
		db.insertData("InvestigadoresDB", "INSERT INTO Investigadores (DNI, Facultad) VALUES (\"2\", \"2\");");
		db.insertData("InvestigadoresDB", "INSERT INTO Investigadores (DNI, Facultad) VALUES (\"3\", \"3\");");
		db.insertData("InvestigadoresDB", "INSERT INTO Investigadores (DNI, Facultad) VALUES (\"4\", \"4\");");
		db.insertData("InvestigadoresDB", "INSERT INTO Investigadores (DNI, Facultad) VALUES (\"5\", \"5\");");
		db.insertData("InvestigadoresDB", "INSERT INTO Equipos (NumSerie, Facultad) VALUES (\"1\", \"1\");");
		db.insertData("InvestigadoresDB", "INSERT INTO Equipos (NumSerie, Facultad) VALUES (\"2\", \"2\");");
		db.insertData("InvestigadoresDB", "INSERT INTO Equipos (NumSerie, Facultad) VALUES (\"3\", \"3\");");
		db.insertData("InvestigadoresDB", "INSERT INTO Equipos (NumSerie, Facultad) VALUES (\"4\", \"4\");");
		db.insertData("InvestigadoresDB", "INSERT INTO Equipos (NumSerie, Facultad) VALUES (\"5\", \"5\");");
		db.insertData("InvestigadoresDB", "INSERT INTO Reserva (Investigador, Equipo) VALUES (\"1\", \"1\");");
		db.insertData("InvestigadoresDB", "INSERT INTO Reserva (Investigador, Equipo) VALUES (\"2\", \"2\");");
		db.insertData("InvestigadoresDB", "INSERT INTO Reserva (Investigador, Equipo) VALUES (\"3\", \"3\");");
		db.insertData("InvestigadoresDB", "INSERT INTO Reserva (Investigador, Equipo) VALUES (\"4\", \"4\");");
		db.insertData("InvestigadoresDB", "INSERT INTO Reserva (Investigador, Equipo) VALUES (\"5\", \"5\");");
		System.out.println("Facultad");
		db.getValues("InvestigadoresDB", "Facultad", "Codigo", "Nombre");
		System.out.println("Investigadores");
		db.getValues("InvestigadoresDB", "Investigadores", "DNI", "NomApels", "Facultad");
		System.out.println("Equipos");
		db.getValues("InvestigadoresDB", "Equipos", "NumSerie", "Nombre", "Facultad");
		System.out.println("Reserva");
		db.getValues("InvestigadoresDB", "Reserva", "Investigador", "Equipo", "Comienzo", "Fin");
		db.closeConnection();
	}
}

