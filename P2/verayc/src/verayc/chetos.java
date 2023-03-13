package verayc;

public class chetos {
	int idChetos;
	String nombre;
	double precio;
	String marca;
	String sabor;
	public chetos() {
		System.out.println("Soy el metodo constructor");
	}
	public chetos(int idChetos, String nombre, double precio, String marca, String sabor) {
		super();
		this.idChetos = idChetos;
		this.nombre = nombre;
		this.precio = precio;
		this.marca = marca;
		this.sabor = sabor;
	}
	public int getIdChetos() {
		return idChetos;
	}
	public void setIdChetos(int idChetos) {
		this.idChetos = idChetos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
}
