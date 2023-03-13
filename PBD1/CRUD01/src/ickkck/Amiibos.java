package ickkck;

public class Amiibos {
	 int idAmiibo;
	 double precio;
	 String personaje;
	 String estado;
	 String saga;
	public Amiibos() {
		System.out.println("Soy el metodo constructor");
	}
	public Amiibos(int idAmiibo, double precio, String personaje, String estado, String saga) {

		this.idAmiibo = idAmiibo;
		this.precio = precio;
		this.personaje = personaje;
		this.estado = estado;
		this.saga = saga;
	}
	public int getIdAmiibo() {
		return idAmiibo;
	}
	public void setIdAmiibo(int idAmiibo) {
		this.idAmiibo = idAmiibo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getPersonaje() {
		return personaje;
	}
	public void setPersonaje(String personaje) {
		this.personaje = personaje;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getSaga() {
		return saga;
	}
	public void setSaga(String saga) {
		this.saga = saga;
	}

}
