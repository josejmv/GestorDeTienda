package proyecto.ii;

public class Liquidos extends Lacteos{
   
	private float litros;
    
    public Liquidos(String codigo, String descripcion,float precio,float litros) {
        super(codigo, descripcion,precio);
        this.litros=litros;
    }

    public float getLitros() {
        return litros;
    }

	public void setLitros(float litros,boolean check) {
		
		if(check == true)
		{
			this.litros -= litros;
		} else
		{
			this.litros += litros;
		}
	}
    
    
    
}
