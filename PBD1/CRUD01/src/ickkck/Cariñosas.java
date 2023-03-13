package ickkck;

public class Cariñosas {
	int curp;
	String descripcion;
	double precio;
	String nombre;
	int edad;
	public Cariñosas() {
		System.out.println("Soy el metodo constructor");
	}
	public Cariñosas(int curp, String descripcion, double precio, String nombre, int edad) {
		super();
		this.curp = curp;
		this.descripcion = descripcion;
		this.precio = precio;
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public int getCurp() {
		return curp;
	}
	public void setCurp(int curp) {
		this.curp = curp;
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
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
