package models;

import java.sql.*;

import javax.swing.JOptionPane;

public class db {
	public static Connection conexion;
	
	public static void connectDB(String user, String pass) throws SQLException, ClassNotFoundException{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306?useTimezone=true&serverTimezone=UTC",user, pass);
			System.out.print("Server Connected");
		} catch(SQLException | ClassNotFoundException ex  ){
			System.out.print("No se ha podido conectar con mi base de datos");
			System.out.println(ex.getMessage());
			
		}Class.forName("com.mysql.cj.jdbc.Driver");
		
	
	}

	public static void closeConnection() {
		try {
			conexion.close();
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	public static void createDB(String name) {
		try {
			String Query="CREATE DATABASE "+ name;
			Statement st= conexion.createStatement();
			st.executeUpdate(Query);
			System.out.println("DB creada con exito!");
			JOptionPane.showMessageDialog(null, "Se ha creado la DB " +name+ "de forma exitosa.");
		}catch(SQLException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Error creando la DB.");
		}	
	}
	
	public static void createTable(String db,String Query) {
		try {
			String Querydb = "USE "+db+";";
			Statement stdb= conexion.createStatement();
			stdb.executeUpdate(Querydb);
			Statement st= conexion.createStatement();
			st.executeUpdate(Query);
			System.out.println("Tabla creada con exito!");
		}catch (SQLException ex){
			System.out.println(ex.getMessage());
			System.out.println("Error crando tabla.");
		}
	}
	
	public static void insertData(String db, String Query) {
		try {
			String Querydb = "USE "+db+";";
			Statement stdb= conexion.createStatement();
			stdb.executeUpdate(Querydb);
			Statement st = conexion.createStatement();
			st.executeUpdate(Query);
			
			System.out.println("Datos almacenados correctamente");;
			
		} catch (SQLException ex ) {
			System.out.println(ex.getMessage());
			JOptionPane.showMessageDialog(null, "Error en el almacenamiento");
		}		
	}
	
	public static void getValues(String db, String table, String row) {
		try {
			String Querydb = "USE "+db+";";
			Statement stdb= conexion.createStatement();
			stdb.executeUpdate(Querydb);
						
			String Query = "SELECT * FROM "+table+";";
			Statement st = conexion.createStatement();
			ResultSet resultSet = st.executeQuery(Query);
			
			while (resultSet.next()) {
				System.out.println("\t"+row+": " +  resultSet.getString(row) + "\n");
			}
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Error en la adquisicion de datos");
		}
	}
	
	public static void getValues(String db, String table, String row, String row1) {
		try {
			String Querydb = "USE "+db+";";
			Statement stdb= conexion.createStatement();
			stdb.executeUpdate(Querydb);
						
			String Query = "SELECT * FROM "+table+";";
			Statement st = conexion.createStatement();
			ResultSet resultSet = st.executeQuery(Query);
			
			while (resultSet.next()) {
				System.out.println("\t"+row+": " +  resultSet.getString(row) + "\n"
								  +"\t"+row1+": " +  resultSet.getString(row1) + "\n");
			}
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Error en la adquisicion de datos");
		}
	}
	
	public static void getValues(String db, String table, String row, String row1, String row2) {
		try {
			String Querydb = "USE "+db+";";
			Statement stdb= conexion.createStatement();
			stdb.executeUpdate(Querydb);
						
			String Query = "SELECT * FROM "+table+";";
			Statement st = conexion.createStatement();
			ResultSet resultSet = st.executeQuery(Query);
			
			while (resultSet.next()) {
				System.out.println("\t"+row+": " +  resultSet.getString(row) + "\n"
								  +"\t"+row1+": " +  resultSet.getString(row1) + "\n"
								  +"\t"+row2+": " +  resultSet.getString(row2) + "\n");
			}
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Error en la adquisicion de datos");
		}
	}
	
	public static void getValues(String db, String table, String row, String row1, String row2, String row3) {
		try {
			String Querydb = "USE "+db+";";
			Statement stdb= conexion.createStatement();
			stdb.executeUpdate(Querydb);
						
			String Query = "SELECT * FROM "+table+";";
			Statement st = conexion.createStatement();
			ResultSet resultSet = st.executeQuery(Query);
			
			while (resultSet.next()) {
				System.out.println("\t"+row+": " +  resultSet.getString(row) + "\n"
								  +"\t"+row1+": " +  resultSet.getString(row1) + "\n"
								  +"\t"+row2+": " +  resultSet.getString(row2) + "\n"
								  +"\t"+row3+": " +  resultSet.getString(row3) + "\n");
			}
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Error en la adquisicion de datos");
		}
	}
	
	public static void deleteRecord(String db, String table_name, String ID) {
		try {
			String Querydb = "USE "+db+";";
			Statement stdb= conexion.createStatement();
			stdb.executeUpdate(Querydb);
						
			String Query = "DELETE FROM " + table_name + " WHERE ID = \"" + ID + "\""+";";
			Statement st = conexion.createStatement();
			st.executeUpdate(Query);
			
			System.out.println("Registros de tabla ELIMINADOS con exito!");
						
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			JOptionPane.showMessageDialog(null, "Error borrando el registro especificado");
		}
	}
	
	public static void deleteTabla(String db, String table_name) {
		try {
			String Querydb = "USE "+db+";";
			Statement stdb= conexion.createStatement();
			stdb.executeUpdate(Querydb);

			String Query = "DROP TABLE " + table_name + ";";
			Statement st = conexion.createStatement();
			st.executeUpdate(Query);
			
			System.out.println("TABLA ELIMINADA con exito!");
						
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			JOptionPane.showMessageDialog(null, "Error borrando la tabla");
		}
	}	

}
