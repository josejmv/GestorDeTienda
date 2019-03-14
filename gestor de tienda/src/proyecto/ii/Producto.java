package proyecto.ii;

abstract public class Producto {
    private String codigo;
    private String descripcion;
    private float precioVenta;
    private float precioCompra;
    private int unidades;

    public Producto(String codigo, String descripcion, float precioVenta)
    {
        this.codigo=codigo;
        this.descripcion=descripcion;
        this.precioVenta=precioVenta;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
	public float getPrecioVenta() {
		return precioVenta;
	}

	public void setUnidades(int unidades, boolean check) {
		if(check == true)
		{
			this.unidades -= unidades;
		} else
		{
			this.unidades += unidades;
		}
	}

	public void setPrecioCompra(float precioCompra) {
		this.precioCompra = precioCompra;
	}

	public float getPrecioCompra() {
		return precioCompra;
	}

	public int getUnidades() {
		return unidades;
	}
	
	
	
	
}