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
		if(dp.insertarProductos(this)) {
			return true;
		}else {
			return false;
		}
	}
	
	//Descripcion
	
	public boolean insertarDescripcion() {
		return (dp.insertarProductos(this))?true:false;
	}
	public boolean cargarDescripcion() {
		return (true)?true:false;
	}
	public boolean eliminarDescripcion() {
		return (true)?true:false;
	}
	public boolean actualizarDescripcion() {
		return (true)?true:false;
	}
	
	//Precio
	
	public boolean insertarPrecio() {
		return (dp.insertarProductos(this))?true:false;
	}
	public boolean cargarPrecio() {
		return (true)?true:false;
	}
	public boolean eliminarPrecio() {
		return (true)?true:false;
	}
	public boolean actualizarPrecio() {
		return (true)?true:false;
	}
	
	//Proveedor
	
	public boolean insertarProveedor() {
		return (dp.insertarProductos(this))?true:false;
	}
	public boolean cargarProveedor() {
		return (true)?true:false;
	}
	public boolean eliminarProveedor() {
		return (true)?true:false;
	}
	public boolean actualizarProveedor() {
		return (true)?true:false;
	}
	
	//Cantidad
	
	public boolean insertarCantidad() {
		return (dp.insertarProductos(this))?true:false;
	}
	public boolean cargarCantidad() {
		return (true)?true:false;
	}
	public boolean eliminarCantidad() {
		return (true)?true:false;
	}
	public boolean actualizarCantidad() {
		return (true)?true:false;
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
