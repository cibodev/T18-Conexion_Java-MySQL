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
		db.createDB("EmpleadosDB");
		db.createTable("EmpleadosDB", "CREATE TABLE Departamentos (Codigo INT NOT NULL, Nombre VARCHAR(50), Presupuesto INT, PRIMARY KEY (Codigo));");
		db.createTable("EmpleadosDB", "CREATE TABLE Empleados (DNI VARCHAR(8) NOT NULL, Nombre VARCHAR(100), Apellido varchar(255), Departamento INT, PRIMARY KEY(DNI), FOREIGN KEY (Departamento) REFERENCES Departamentos(Codigo));");
		db.insertData("EmpleadosDB", "INSERT INTO Departamentos (Codigo, Nombre) VALUES (\"1\", \"1\");");
		db.insertData("EmpleadosDB", "INSERT INTO Departamentos (Codigo, Nombre) VALUES (\"2\", \"2\");");
		db.insertData("EmpleadosDB", "INSERT INTO Departamentos (Codigo, Nombre) VALUES (\"3\", \"3\");");
		db.insertData("EmpleadosDB", "INSERT INTO Departamentos (Codigo, Nombre) VALUES (\"4\", \"4\");");
		db.insertData("EmpleadosDB", "INSERT INTO Departamentos (Codigo, Nombre) VALUES (\"5\", \"5\");");
		db.insertData("EmpleadosDB", "INSERT INTO Empleados (DNI, Nombre, Apellido, Departamento) VALUES (\"1111111A\", \"1\", \"1\", \"1\");");
		db.insertData("EmpleadosDB", "INSERT INTO Empleados (DNI, Nombre, Apellido, Departamento) VALUES (\"2222222B\",\"2\", \"2\", \"2\");");
		db.insertData("EmpleadosDB", "INSERT INTO Empleados (DNI, Nombre, Apellido, Departamento) VALUES (\"3333333C\", \"3\", \"3\", \"3\");");
		db.insertData("EmpleadosDB", "INSERT INTO Empleados (DNI, Nombre, Apellido, Departamento) VALUES (\"4444444D\", \"4\", \"4\", \"4\");");
		db.insertData("EmpleadosDB", "INSERT INTO Empleados (DNI, Nombre, Apellido, Departamento) VALUES (\"5555555E\", \"5\", \"5\", \"5\");");
		System.out.println("Departamentos");
		db.getValuesDepartamentos("EmpleadosDB");
		System.out.println("Empleados");
		db.getValuesEmpleados("EmpleadosDB");
		db.closeConnection();
	}


}
