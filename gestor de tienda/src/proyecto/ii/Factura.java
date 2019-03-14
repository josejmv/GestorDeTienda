package proyecto.ii;

import java.util.ArrayList;

public class Factura {
	
	private String cedula;
	private float cuenta;
	private ArrayList<Producto> productosVendidos = new ArrayList<Producto>();
	
	
	public Factura(String cedula, float cuenta, ArrayList<Producto> productosVendidos) {
		this.cedula = cedula;
		this.cuenta = cuenta;
		this.productosVendidos = productosVendidos;
	}


	public String getCedula() {
		return cedula;
	}


	public float getCuenta() {
		return cuenta;
	}


	public ArrayList<Producto> getProductosVendidos() {
		return productosVendidos;
	}
	
	
	
	
}
