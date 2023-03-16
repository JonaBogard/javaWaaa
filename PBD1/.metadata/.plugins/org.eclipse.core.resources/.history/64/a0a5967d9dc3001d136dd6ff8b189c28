package ickkck;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataProducto {
	
	public boolean insertarProducto(producto np) {
		PreparedStatement ps = null;
		try {
			ps = cx.conectar().prepareStatement("INSERT INTO producto VALUES(null,?,?,?,?)");
			ps.setString(1, np.getDescripcion());
			ps.setDouble(2, np.getPrecio());
			ps.setInt(3, np.getCantidad());
			ps.setString(4, np.getProveedor());
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

		public boolean insertarProveedor(producto np) {
			return true;
		}

		public boolean cargarProveedor(producto np) {
			return true;
		}

		public boolean eliminarProveedor(String SuppliersID) {
			return true;
		}

		public boolean actualizarProveedor(producto np) {
			return true;
		}
		
}
