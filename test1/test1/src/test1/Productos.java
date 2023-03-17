package test1;

public class Productos {
	int id;
	String descripcion;
	double precio;
	String proveedor;
	int cantidad;
	DataProductos dp = null;

	public Productos() {
		dp = new DataProductos();
	}

	public boolean insertarProductos() {
		if (dp.insertarProductos(this)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean cargarProductos() {
		if (dp.cargarProductos(this)) {
			return true;
		} else {
			return false;
		}
	}
	public boolean eliminarProductos() {
		if (dp.eliminarProductos(this.getId())) {
			return true;
		} else {
			return false;
		}
	}
	public boolean actualizarProductos() {
		if (dp.actualizarProductos(this)) {
			return true;
		} else {
			return false;
		}
	}

	public Productos(int id, String descripcion, double precio, String proveedor, int cantidad) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.precio = precio;
		this.proveedor = proveedor;
		this.cantidad = cantidad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getProveedor() {
		return proveedor;
	}

	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
}
