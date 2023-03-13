package ickkck;

public class Waifus {
	int idWaifu;
	String nombre;
	int edad;
	double tamanoT;
	String sexo;
	public Waifus() {
		System.out.println("Soy el metodo constructor");
	}
	public Waifus(int idWaifu, String nombre, int edad, double tamanoT, String sexo) {

		this.idWaifu = idWaifu;
		this.nombre = nombre;
		this.edad = edad;
		this.tamanoT = tamanoT;
		this.sexo = sexo;
	}
	public int getIdWaifu() {
		return idWaifu;
	}
	public void setIdWaifu(int idWaifu) {
		this.idWaifu = idWaifu;
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
	public double getTamanoT() {
		return tamanoT;
	}
	public void setTamanoT(double tamanoT) {
		this.tamanoT = tamanoT;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

}
