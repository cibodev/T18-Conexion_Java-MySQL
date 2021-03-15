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
		db.createDB("CientificosDB");
		db.createTable("CientificosDB", "CREATE TABLE Cientificos (DNI VARCHAR(8) NOT NULL, NomApels VARCHAR(255), PRIMARY KEY (DNI));");
		db.createTable("CientificosDB", "CREATE TABLE Proyectos (IDProyecto CHAR(4) NOT NULL, Nombre VARCHAR(100), Horas INT, PRIMARY KEY (IDProyecto));");
		db.createTable("CientificosDB", "CREATE TABLE Asignado_A (Cientifico VARCHAR(8) NOT NULL, Proyecto CHAR(4) NOT NULL, PRIMARY KEY(Cientifico, Proyecto), FOREIGN KEY (Cientifico) REFERENCES Cientificos(DNI), FOREIGN KEY (Proyecto) REFERENCES Proyectos(IDProyecto));");
		db.insertData("CientificosDB", "INSERT INTO Cientificos (DNI, NomApels) VALUES (\"1\", \"1\");");
		db.insertData("CientificosDB", "INSERT INTO Cientificos (DNI, NomApels) VALUES (\"2\", \"2\");");
		db.insertData("CientificosDB", "INSERT INTO Cientificos (DNI, NomApels) VALUES (\"3\", \"3\");");
		db.insertData("CientificosDB", "INSERT INTO Cientificos (DNI, NomApels) VALUES (\"4\", \"4\");");
		db.insertData("CientificosDB", "INSERT INTO Cientificos (DNI, NomApels) VALUES (\"5\", \"5\");");
		db.insertData("CientificosDB", "INSERT INTO Proyectos (IDProyecto, Nombre) VALUES (\"1\", \"1\");");
		db.insertData("CientificosDB", "INSERT INTO Proyectos (IDProyecto, Nombre) VALUES (\"2\", \"2\");");
		db.insertData("CientificosDB", "INSERT INTO Proyectos (IDProyecto, Nombre) VALUES (\"3\", \"3\");");
		db.insertData("CientificosDB", "INSERT INTO Proyectos (IDProyecto, Nombre) VALUES (\"4\", \"4\");");
		db.insertData("CientificosDB", "INSERT INTO Proyectos (IDProyecto, Nombre) VALUES (\"5\", \"5\");");
		db.insertData("CientificosDB", "INSERT INTO Asignado_A (Cientifico, Proyecto) VALUES (\"1\", \"1\");");
		db.insertData("CientificosDB", "INSERT INTO Asignado_A (Cientifico, Proyecto) VALUES (\"2\", \"2\");");
		db.insertData("CientificosDB", "INSERT INTO Asignado_A (Cientifico, Proyecto) VALUES (\"3\", \"3\");");
		db.insertData("CientificosDB", "INSERT INTO Asignado_A (Cientifico, Proyecto) VALUES (\"4\", \"4\");");
		db.insertData("CientificosDB", "INSERT INTO Asignado_A (Cientifico, Proyecto) VALUES (\"5\", \"5\");");
		System.out.println("Cientificos");
		db.getValues("CientificosDB", "Cientificos", "DNI", "NomApels");
		System.out.println("Proyectos");
		db.getValues("CientificosDB", "Proyectos", "IDProyecto", "Nombre");
		System.out.println("Asignado_A");
		db.getValues("CientificosDB", "Asignado_A", "Cientifico", "Proyecto");
		db.closeConnection();
	}
}

