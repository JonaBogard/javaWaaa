package test1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class DataProductos {
	
	private static final String controlador = "com.mysql.cj.jdbc.Driver";
	private static final String url = "jdbc:mysql://localhost:3306/simulacion";
	private static final String user = "root";
	private static final String password = "";
	static {
	try {
	Class.forName(controlador);
	} catch (ClassNotFoundException e) {
	e.printStackTrace();
	}
	}
	public Connection conectar() {
	Connection cx = null;
	try {
	cx = DriverManager.getConnection(url, user, password);
	System.out.println("Connection Succes");
	} catch (SQLException e) {
	e.printStackTrace();
	}
	return cx;
	}
	public static void main(String [] args) {
	DataProductos dp=new DataProductos();
	dp.conectar();
	}
	
	
		
		public boolean insertarProductos(Productos np) {
			PreparedStatement ps=null;
			try {
			ps=conectar().prepareStatement("INSERT INTO productos VALUES(?,?,?,?,?)");
			ps.setInt(1, np.getId());
			ps.setString(2, np.getDescripcion());
			ps.setDouble(3, np.getPrecio());
			ps.setString(4, np.getProveedor());
			ps.setInt(5, np.getCantidad());
			ps.executeUpdate();
			return true;
			} catch (SQLException e) {
			e.printStackTrace();
			return false;
			}
		}
	
}
