package proyecto.ii;

public class Enlatados extends Producto{
    
    private String marca;
    
    public Enlatados(String codigo, String descripcion,float precio, String marca)
    {
        super(codigo,descripcion,precio);
        this.marca=marca;
    }

	public String getMarca() {
		return marca;
	}
	
	
}
