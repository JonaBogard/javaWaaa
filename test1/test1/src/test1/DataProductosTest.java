package test1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DataProductosTest {
	
	@Test
	void testInsertarProductos() {
		Productos p= new Productos();
		p.setId(Integer.parseInt("3"));
		p.setDescripcion("Pollo");
		p.setPrecio(Double.parseDouble("9"));
		p.setProveedor("LaVenuda");
		p.setCantidad(Integer.parseInt("69"));
		assertEquals(p.insertarProductos(), true);
	}
	
	@Test
	void testCargarProductos() {
		Productos p= new Productos();
		p.setId(Integer.parseInt("3"));
		assertEquals(p.cargarProductos(), true);
	}
	@Test
	void testEliminarProductos() {
		Productos p= new Productos();
		p.setId(Integer.parseInt("3"));
		assertEquals(p.eliminarProductos(), true);
	}

	@Test
	void testActualizarProductos() {
		Productos p= new Productos();
		p.setId(Integer.parseInt("3"));
		p.setDescripcion("Polla");
		p.setPrecio(Double.parseDouble("9"));
		p.setProveedor("LaVenuda");
		p.setCantidad(Integer.parseInt("96"));
		assertEquals(p.actualizarProductos(), true);
	}

}
