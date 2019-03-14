package proyecto.ii;

public class Carnes extends Producto{
    
    private float kilos;
    
    public Carnes(String codigo, String descripcion,float precio,float kilos) {
        super(codigo, descripcion,precio);
        this.kilos=kilos;
    }

	public float getKilos() {
		return kilos;
	}

	public void setKilos(float kilos,boolean check) {

		if(check == true)
		{
			this.kilos -= kilos;
		} else
		{
			this.kilos += kilos;
		}

	}
    
	
    
}
