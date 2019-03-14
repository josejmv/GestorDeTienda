package proyecto.ii;

public class Viveres extends Producto{
    
	private String marca;

    public Viveres(String codigo, String descripcion,float precio, String marca) {
        super(codigo, descripcion,precio);
        this.marca=marca;
    }

    public String getMarca() {
        return marca;
    }
   
}
