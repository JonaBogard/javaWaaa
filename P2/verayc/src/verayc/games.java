package verayc;

public class games {
	int idGame;
	String nombre;
	double precio;
	String plataforma;
	String desarrolladora;
	public games() {
		System.out.println("Soy el metodo constructor");
	}
	public games(int idGame, String nombre, double precio, String plataforma, String desarrolladora) {
		super();
		this.idGame = idGame;
		this.nombre = nombre;
		this.precio = precio;
		this.plataforma = plataforma;
		this.desarrolladora = desarrolladora;
	}
	public int getIdGame() {
		return idGame;
	}
	public void setIdGame(int idGame) {
		this.idGame = idGame;
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
	public String getPlataforma() {
		return plataforma;
	}
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	public String getDesarrolladora() {
		return desarrolladora;
	}
	public void setDesarrolladora(String desarrolladora) {
		this.desarrolladora = desarrolladora;
	}
}
