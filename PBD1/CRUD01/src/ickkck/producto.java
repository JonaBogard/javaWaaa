package ickkck;

public class producto {
	int id;
	String descripcion;
	double precio;
	String proveedor;
	int cantidad;
	DataProducto dp = null;

	public producto() {
		dp = new DataProducto();
	}

	public boolean insertarProducto() {
		if(dp.insertarProducto(this)) {
			return true;
		}else {
			return false;
		}
	}
	
		//Descripcion
	public boolean insertarDescripcion() {
		return (true)?true:false;
	}
	public boolean deleteDescripcion() {
		return (true)?true:false;
	}
	public boolean updateDescripcion() {
		return (true)?true:false;
	}
	public boolean showDescripcion() {
		return (true)?true:false;
	}
	public boolean cleanDescripcion() {
		return (true)?true:false;
	}
	//Precio
	public boolean insertarPrecio() {
		return (true)?true:false;
	}
	public boolean deletePrecio() {
		return (true)?true:false;
	}
	public boolean updatePrecio() {
		return (true)?true:false;
	}
	public boolean showPrecio() {
		return (true)?true:false;
	}
	public boolean cleanPrecio() {
		return (true)?true:false;
	}
	
	//Proveedor
	
		public boolean insertarProveedor() {
			return (true)?true:false;
		}
		public boolean deleteProveedor() {
			return (true)?true:false;
		}
		public boolean updateProveedor() {
			return (true)?true:false;
		}
		public boolean showProveedor() {
			return (true)?true:false;
		}
		public boolean cleanProveedor() {
			return (true)?true:false;
		}
		//Cantidad
		
			public boolean insertarCantidad() {
				return (true)?true:false;
			}
			public boolean deleteCantidad() {
				return (true)?true:false;
			}
			public boolean updateCantidad() {
				return (true)?true:false;
			}
			public boolean showCantidad() {
				return (true)?true:false;
			}
			public boolean cleanCantidad() {
				return (true)?true:false;
			}
	

	public producto(int id, String descripcion, double precio, String provedor, int cantidad) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.precio = precio;
		this.provedor = provedor;
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

	public String getProvedor() {
		return provedor;
	}

	public void setProvedor(String provedor) {
		this.provedor = provedor;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	
	
	
}