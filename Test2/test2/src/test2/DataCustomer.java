package test2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataCustomer {
	
	private static final String controlador="com.mysql.cj.jdbc.Driver";
	private static final String url="jdbc:mysql://localhost:3306/proyecto";
	private static final String user="root";
	private static final String password="";
	
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

	public static void main(String[] args) {
		DataCustomer dp = new DataCustomer();
		dp.conectar();
		System.out.print("Connected");
	}
	public boolean insertCustomer(Customer np) {
		PreparedStatement ps = null;
		try {
			ps = conectar().prepareStatement("INSERT INTO customer VALUES(?,?,?,?,?)");
			ps.setString(1, np.getIdCustomer());
			ps.setString(2, np.getCustomer());
			ps.setString(3, np.getTelefono());
			ps.setString(4, np.getFax());
			ps.setString(5, np.getEmail());
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean loadCustomer(Customer np) {
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = conectar().prepareStatement("SELECT * FROM customer WHERE idCustomer=?");
			ps.setString(1, np.getIdCustomer());
			rs = ps.executeQuery();
			if (rs.next()) {
				np.setIdCustomer(rs.getString(1));
				np.setCustomer(rs.getString(2));
				np.setTelefono(rs.getString(3));
				np.setFax(rs.getString(4));
				np.setEmail(rs.getString(5));
				return true;
			} else {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean deleteCustomer(String id) {
		PreparedStatement ps = null;
		try {
			Customer np = new Customer();
			np.setIdCustomer(id);
			if (np.loadCustomer()) {
				ps = conectar().prepareStatement("DELETE FROM customer WHERE idCustomer=?");
				ps.setString(1, id);
				ps.executeUpdate();
				return true;
			} else {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean updateCustomer(Customer np) {
		PreparedStatement ps = null;
		try {
		Customer np2 = new Customer();
		np2.setIdCustomer(np.getIdCustomer());
		if (np2.loadCustomer()) {
		ps = conectar().prepareStatement("UPDATE customer SET " + "Customer=?, " + "Telefono=?, " + "Fax=?, " + "Email=? " + " WHERE idCustomer=?");
		ps.setString(1, np.getCustomer());
		ps.setString(2, np.getTelefono());
		ps.setString(3, np.getFax());
		ps.setString(4, np.getEmail());
		ps.setString(5, np.getIdCustomer());
		ps.executeUpdate();
		return true;
		} else {
		return false;
	}
		} catch (SQLException e) {
		e.printStackTrace();
		return false;
		}
	}

}
