package proyecto.ii;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Menu{
	
	private BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	private ArrayList<Producto> productos = new ArrayList<Producto>();
	private ArrayList<Factura> facturas = new ArrayList<Factura>();
	
    public void inicio() throws Exception {
    	
    	byte opcion=0;
    	
    	System.out.println("\nMenu.");
        System.out.println("\n1. Agregar producto.");
        System.out.println("2. Modificar existencia de producto");
        System.out.println("3. Facturar venta");
        System.out.println("4. Mostrar ingresos totales");
        System.out.println("5. Mostrar egresos totales");
        System.out.println("6. Mostrar las 10 mejores ventas de lacteos y carnes");
        System.out.println("7. Mostrar productos con existencia menor a 10");
        System.out.println("8. Salir");
        System.out.print("opcion: ");
        
        do
        {
        opcion = Byte.parseByte(entrada.readLine());
        } while(opcion<1 || opcion>8);
        
        switch(opcion)
        {
        case 1:
        {
        	add();
        } break;
        case 2:
        {
        	modificarExistencia();
        } break;
        case 3:
        {
        	facturarVenta();
        } break;
        case 4:
        {
        	ingresos();
        } break;
        case 5:
        {
        	egresos();
        } break;
        case 6:
        {
        	excentosMayVenta(); // no completado
        } break;
        case 7:
        {
        	menorExistencia();
        } break;
        case 8:
        {
        	System.exit(0);
        }
        }
    }
	
    public void add() throws Exception, IOException {


    	boolean band = false;
        byte opcion=0;
        byte opcion2=0;
        String codigo = null;
        String descripcion = null;
        String marca = null;
        float precio = 0;
        
        
        System.out.println("\nseleccione el tipo de producto que desea agregar");
        System.out.println("1. Enlatados");
        System.out.println("2. Viveres");
        System.out.println("3. Lacteos");
        System.out.println("4. Carnes");
        System.out.print("Opcion: ");
        
        do
        {

        	opcion = Byte.parseByte(entrada.readLine());
        } while(opcion<1 || opcion>4);
        
        if(opcion==3)
        {
            System.out.println("\nLacteos de tipo:");
            System.out.println("1. Liquidos");
            System.out.println("2. Solidos");
            System.out.print("Opcion: ");
            
            do
            {

            	opcion2 = Byte.parseByte(entrada.readLine());
            } while(opcion2<1 || opcion2 >2);
        }
        
        switch(opcion)
        {        	
            case 1:
            {
                System.out.print("\ningrese el codigo del producto: ");
                codigo = entrada.readLine();
                System.out.print("ingrese una descripcion del producto: ");
                descripcion = entrada.readLine();
                System.out.print("ingrese la marca del producto: ");
                marca = entrada.readLine();
                System.out.print("ingrese el precio de venta del producto: ");
                precio = Float.parseFloat(entrada.readLine());
                
                for(Producto cod : productos)
                {
                	if(codigo.intern() == cod.getCodigo().intern())
                	{
                		System.out.println("\nya hay un producto con el codigo "+codigo+"\n");
                		band = true;
                	} 
                }
                
                if(band == false)
                {
                	productos.add(new Enlatados(codigo,descripcion,precio,marca));
                	System.out.println("\nsu producto ha sido agregado satisfactoriamente\n");
                }
                
                inicio();
            } break;
            case 2:
            {
            	System.out.print("\ningrese el codigo del producto: ");
            	codigo = entrada.readLine();
                System.out.print("ingrese una descripcion del producto: ");
                descripcion = entrada.readLine();
                System.out.print("ingrese la marca del producto: ");
                marca = entrada.readLine();
                System.out.print("ingrese el precio de venta del producto: ");
                precio = Float.parseFloat(entrada.readLine());
                
                for(Producto cod : productos)
                {
                	if(codigo.intern() == cod.getCodigo().intern())
                	{
                		System.out.println("\nya hay un producto con el codigo "+codigo+"\n");
                		band = true;
                	} 
                }
                
                if(band == false)
                {
                	productos.add(new Viveres(codigo,descripcion,precio,marca));
                	System.out.println("\nsu producto ha sido agregado satisfactoriamente\n");
                }
                
                inicio();
            } break;
            case 3:
            {
            	switch(opcion2)
            	{
            	case 1:
            	{
            		System.out.print("\ningrese el codigo del producto: ");
            		codigo = entrada.readLine();
                    System.out.print("ingrese una descripcion del producto: ");
                    descripcion = entrada.readLine();
                    System.out.print("ingrese el precio del producto: ");
                    precio = Float.parseFloat(entrada.readLine());
                   
                    for(Producto cod : productos)
                    {
                    	if(codigo.intern() == cod.getCodigo().intern())
                    	{
                    		System.out.println("\nya hay un producto con el codigo "+codigo+"\n");
                    		band = true;
                    	} 
                    }
                    
                    if(band == false)
                    {
                    	productos.add(new Liquidos(codigo,descripcion,precio,0));
                    	System.out.println("\nsu producto ha sido agregado satisfactoriamente\n");
                    }
                    inicio();
            	} break;
            	case 2:
            	{
            		System.out.print("\ningrese el codigo del producto: ");
            		codigo = entrada.readLine();
                    System.out.print("ingrese una descripcion del producto: ");
                    descripcion = entrada.readLine();
                    System.out.print("ingrese el precio del producto: ");
                    precio = Float.parseFloat(entrada.readLine());
                   
                    for(Producto cod : productos)
                    {
                    	if(codigo.intern() == cod.getCodigo().intern())
                    	{
                    		System.out.println("\nya hay un producto con el codigo "+codigo+"\n");
                    		band = true;
                    	} 
                    }
                    
                    if(band == false)
                    {
                    	productos.add(new Solidos(codigo,descripcion,precio,0));
                    	System.out.println("\nsu producto ha sido agregado satisfactoriamente\n");
                    }
                    inicio();
            	} break;
            	}
            } break;
            case 4:
            {
            	System.out.print("\ningrese el codigo del producto: ");
            	codigo = entrada.readLine();
                System.out.print("ingrese una descripcion del producto: ");
                descripcion = entrada.readLine();
                System.out.print("ingrese el precio del producto: ");
                precio = Float.parseFloat(entrada.readLine());
               
                for(Producto cod : productos)
                {
                	if(codigo.intern() == cod.getCodigo().intern())
                	{
                		System.out.println("\nya hay un producto con el codigo "+codigo+"\n");
                		band = true;
                	} 
                }
                
                if(band == false)
                {
                	productos.add(new Carnes(codigo,descripcion,precio,0));
                	System.out.println("\nsu producto ha sido agregado satisfactoriamente\n");
                }
                inicio();
            } break;
        }
        
    }

    
    public void modificarExistencia() throws Exception {
    	String codigo = null;
    	int unidades = 0;
    	float litros = 0;
    	float kilogramos = 0;
    	float precioCompra = 0;
    	boolean band = false;
    	
    	System.out.print("\nIngrese el codigo del producto que desea modificar: ");
    	codigo = entrada.readLine();
    	
    	for(Producto prod : productos)
    	{
    		if(codigo.intern() == prod.getCodigo().intern())
    		{
    			if(prod.getClass().getSimpleName().intern() == "Solidos")
    			{
    				System.out.print("\ningrese la cantidad de Kilogramos que agregara al producto: ");
    				kilogramos = Float.parseFloat(entrada.readLine());
    				System.out.print("ingrese el precio de compra del producto: ");
    				precioCompra = Float.parseFloat(entrada.readLine());
    				System.out.println("");
    				((Solidos)prod).setKilos(kilogramos, false);
    				prod.setPrecioCompra(precioCompra);
    				band = true;
    			} else if(prod.getClass().getSimpleName().intern() == "Carnes")
    			{
    				System.out.print("\ningrese la cantidad de Kilogramos que agregara al producto: ");
    				kilogramos = Float.parseFloat(entrada.readLine());
    				System.out.print("ingrese el precio de compra del producto");
    				precioCompra = Float.parseFloat(entrada.readLine());
    				System.out.println("");
    				((Carnes)prod).setKilos(kilogramos, false);
    				prod.setPrecioCompra(precioCompra);
    				band = true;
    			} else if(prod.getClass().getSimpleName().intern() =="Liquidos")
    			{
    				System.out.print("\ningrese la cantidad de Litros que agregara al producto: ");
    				litros = Float.parseFloat(entrada.readLine());
    				System.out.print("ingrese el precio de compra del producto");
    				precioCompra = Float.parseFloat(entrada.readLine());
    				System.out.println("");
    				((Liquidos)prod).setLitros(litros, false);
    				prod.setPrecioCompra(precioCompra);
    				band = true;
    			} else
    			{
    				System.out.print("\ningrese la cantidad de unidades que agregara al producto: ");
    				unidades = Integer.parseInt(entrada.readLine());
    				System.out.print("ingrese el precio de compra del producto");
    				precioCompra = Float.parseFloat(entrada.readLine());
    				System.out.println("");
    				prod.setUnidades(unidades, false);
    				prod.setPrecioCompra(precioCompra);
    				band = true;
    			}
    		}
    	}
    	
    	if(band == false)
    	{
    		System.out.println("\nel producto no ha sido encontrado\n");
    	}
    	
    	inicio();
    }

    
    public void facturarVenta() throws Exception {
    	
    	ArrayList<Integer> cantidad1 = new ArrayList<Integer>();
    	ArrayList<Float> cantidad2 = new ArrayList<Float>();
    	ArrayList<Producto> productosVendidos = new ArrayList<Producto>();
    	String codigo = null;
    	String cedula = null;
    	boolean band = false;
    	boolean band2 = false;
    	byte opcion=0;
    	int aux1 = 0;
    	int i=0;
    	int j=0;
    	float aux2 = 0;
    	float total=0;
    	float total1=0;
    	float total2=0;
    	float total3=0;
    	
    	
    	System.out.print("\ningrese la cedula del cliente: ");
    	cedula = entrada.readLine();
    	
    	do
	    {	
    		System.out.print("\ningrese el codigo del producto: ");
	    	codigo = entrada.readLine();
	    	
	    	for(Producto prod : productosVendidos)
	    	{
	    		if(codigo.intern() == prod.getCodigo().intern() )
	    		{
	    			band2 = true;
	    			band = true;
	    			System.out.println("\nel producto ya ha sido agregado a la factura\n");
	    		}
	    	}
	    	
	    	if (band2 == false)
	    	{	
		    	for(Producto prod : productos)
		    	{
		    		if(codigo.intern() == prod.getCodigo().intern())
		    		{
		    			band = true;
		    			
		    			if(prod.getClass().getSimpleName().intern() == "Solidos")
						{
							System.out.print("ingrese la cantidad en Kilogramos que se van a vender: ");
							aux2 = Float.parseFloat(entrada.readLine());
							
							if(aux2 > ((Solidos)prod).getKilos())
							{
								System.out.println("\nla cantidad deseada excede la cantidad en existencia");
							} else
							{
								cantidad2.add(aux2);
								productosVendidos.add(prod);
								((Solidos)prod).setKilos(aux2,true);
							}
						} else if (prod.getClass().getSimpleName().intern() == "Carnes")
						{
							System.out.print("ingrese la cantidad en Kilogramos que se van a vender: ");
							aux2 = Float.parseFloat(entrada.readLine());
							
							if(aux2 > ((Carnes)prod).getKilos())
							{
								System.out.println("\nla cantidad deseada excede la cantidad en existencia");
							} else
							{
								cantidad2.add(aux2);
								productosVendidos.add(prod);
								((Carnes)prod).setKilos(aux2, true);
							}
						} else if(prod.getClass().getSimpleName().intern() == "Liquidos")
						{
							System.out.print("ingrese la cantidad en Litros que se van a vender: ");
							aux2 = Float.parseFloat(entrada.readLine());
							
							if(aux2 > ((Liquidos)prod).getLitros())
							{
								System.out.println("\nla cantidad deseada excede la cantidad en existencia");
							} else
							{
								cantidad2.add(aux2);
								productosVendidos.add(prod);
								((Liquidos)prod).setLitros(aux2, true);
							}
						}else
						{
							System.out.print("ingrese la cantidad que se van a vender: ");
							aux1 = Integer.parseInt(entrada.readLine());
							
							if(aux1 > prod.getUnidades())
							{
								System.out.println("\nla cantidad deseada excede la cantidad en existencia");
							} else
							{
								cantidad1.add(aux1);
								productosVendidos.add(prod);
								prod.setUnidades(aux1,true);
							}
						}
		    		}
		    	}
	    	}
	    	
	    	if(band == false)
	    	{
	    		System.out.println("\nel producto no ha sido encontrado");
	    	}
	    	
	    	band = false;
	    	band2 = false;
	    	System.out.println("\nDesea agregar otro producto a la factura?");
	    	System.out.print("1. SI\n2. NO\nOpcion: ");
	    	do
	    	{
	    		opcion = Byte.parseByte(entrada.readLine());
	    		
	    	} while(opcion<1 || opcion>2);
	    } while(opcion==1);	
  
    	System.out.println("");
    	
    	for (Producto fact : productosVendidos)
    	{
    		if(fact.getClass().getSimpleName().intern() == "Enlatados" || fact.getClass().getSimpleName().intern() == "Viveres")
    		{
	    		System.out.print(fact.getClass().getSimpleName()+": "+fact.getCodigo()+" | cantidad a llevar: "+cantidad1.get(j).intValue()+" unidades | ");
	    		System.out.println("precio: "+(((fact.getPrecioVenta()*cantidad1.get(j).intValue()))+(fact.getPrecioVenta()*0.12))+" bs");
	    		total1+=(((fact.getPrecioVenta()*cantidad1.get(j).intValue()))+(fact.getPrecioVenta()*0.12));
	    		total3+=(fact.getPrecioVenta()*0.12);
	    		j++;
    		} else if (fact.getClass().getSimpleName().intern() == "Liquidos")
    		{
    			System.out.print(fact.getClass().getSimpleName()+": "+fact.getCodigo()+" | cantidad a llevar: "+cantidad2.get(i).floatValue()+" litros | ");
    			System.out.println("precio: "+((fact.getPrecioVenta()*cantidad2.get(i).floatValue()))+" bs");
    			total2+=(fact.getPrecioVenta()*cantidad2.get(i).floatValue());
    			i++;
    		} else
    		{
    			System.out.print(fact.getClass().getSimpleName()+": "+fact.getCodigo()+" | cantidad a llevar: "+cantidad2.get(i).floatValue()+" kilogramos | ");
    			System.out.println("precio: "+((fact.getPrecioVenta()*cantidad2.get(i).floatValue()))+" bs");
    			total2+=(((fact.getPrecioVenta()*cantidad2.get(i).floatValue())));
    			i++;
    		}
    	}
    
    	total=(total1+total2);
    	
    	System.out.println("\ncosto total de productos con iva: "+total1+" bs");
    	System.out.println("costo total de productos sin iva: "+total2+" bs");
    	System.out.println("costo total del iva: "+total3+" bs");
    	System.out.println("total a pagar: "+total+" bs");
    	
    	if(productosVendidos.isEmpty()==true)
    	{
    		System.out.println("\ncompra cancelada\n");
    	}else
    	{
    		facturas.add(new Factura(cedula,total,productosVendidos));    		
    	}
    	
    	inicio();
    }

    
    public void ingresos() throws Exception {
    	
    	float total = 0;
    	
    	if(facturas.isEmpty()==false)
    	{
    		for (Factura fact : facturas)
    		{
    			total+=fact.getCuenta();
    		}
    		
    		System.out.println("\nel total recaudado es de: "+total+" bs");
    	} else
    	{
    		System.out.println("\nno se han realizado facturas\n\n");
    	}
    	inicio();
    }

   
    public void egresos() throws Exception {
    	
    	float egresosTotales = 0;
    	
    	for (Producto prod : productos)
    	{
    		if(prod.getClass().getSimpleName().intern() == "Liquidos")
    		{
    			egresosTotales += (prod.getPrecioCompra()*((Liquidos)prod).getLitros());
    		} else if (prod.getClass().getSimpleName().intern() == "Solidos")
    		{
    			egresosTotales += (prod.getPrecioCompra()*((Solidos)prod).getKilos());
    		} else if(prod.getClass().getSimpleName().intern() == "Carnes")
    		{
    			egresosTotales += (prod.getPrecioCompra()*((Carnes)prod).getKilos());
    		}else
    		{
    			egresosTotales += (prod.getPrecioCompra()*prod.getUnidades());
    		}
    	}
    	
    	System.out.println("\nla cantidad invertida por los productos en el almacen es de: "+egresosTotales+" bs\n");
    	
    	inicio();
    }

 
    public void excentosMayVenta() throws Exception {
    
    	
    	ArrayList<Producto> excentos = new ArrayList<Producto>();
    	ArrayList<Producto> excentosR = new ArrayList<Producto>();
    	int cont=1;
    	boolean band = false;
    	
    	for(Factura fact : facturas)
    	{
    		for(int i=0;i<fact.getProductosVendidos().size();i++)
    		{
	    		if(fact.getProductosVendidos().get(i).getClass().getSimpleName().intern() == "Solidos")
	    		{
	    			for(Producto prod : excentos)
	    			{
	    				band=false;
	    				if(prod.getCodigo().intern() == fact.getProductosVendidos().get(i).getCodigo().intern())
	    				{
	    					band=true;
	    					excentosR.add(fact.getProductosVendidos().get(i));
	    				}
	    			}
	    			if(band==false)
	    			{
	    				excentos.add(fact.getProductosVendidos().get(i));
	    			}
	    		} else if(fact.getProductosVendidos().get(i).getClass().getSimpleName().intern() == "Liquidos")
	    		{
	    			for(Producto prod : excentos)
	    			{
	    				band=false;
	    				if(prod.getCodigo().intern() == fact.getProductosVendidos().get(i).getCodigo().intern())
	    				{
	    					band=true;
	    					excentosR.add(fact.getProductosVendidos().get(i));
	    				}
	    			}
	    			if(band==false)
	    			{
	    				excentos.add(fact.getProductosVendidos().get(i));
	    			}
	    		} else if(fact.getProductosVendidos().get(i).getClass().getSimpleName().intern() == "Carnes")
	    		{
	    			for(Producto prod : excentos)
	    			{
	    				band=false;
	    				if(prod.getCodigo().intern() == fact.getProductosVendidos().get(i).getCodigo().intern())
	    				{
	    					band=true;
	    					excentosR.add(fact.getProductosVendidos().get(i));
	    				}
	    			}
	    			if(band==false)
	    			{
	    				excentos.add(fact.getProductosVendidos().get(i));
	    			}
	    		}
    		}
    	}
    	
    	for(Producto prod : excentos)
    	{
    		cont=1;
    		for(Producto prodR : excentosR)
    		{
    			if(prod.getCodigo().intern() == prodR.getCodigo().intern())
    			{
    				cont++;
    			}
    		}
    		
    		System.out.print("\n"+prod.getClass().getSimpleName().intern()+"\t\t|| Codigo:"+prod.getCodigo()+"\t\t|| Precio de venta: "+(prod.getPrecioVenta())+"bs"+"\t|| "+cont+" productos vendidos\n");
    	}
    	
    	inicio();
    	
    }

 
    public void menorExistencia() throws Exception {
    	
    	System.out.println("");
    	System.out.println("PODUCTOS CON EXISTENCIA MENOR A 10:\n");
    	int i=1;
    	
    	for(Producto prod : productos)
    	{
    		if(prod.getClass().getSimpleName().intern() == "Liquidos")
    		{	
    			if(((Liquidos)prod).getLitros()<10)
    			{
    				System.out.println(i+") Codigo del producto: "+prod.getCodigo()+" | Existencia: "+((Liquidos)prod).getLitros()+" Litros");
    				i++;
    			}
    		} else if(prod.getClass().getSimpleName().intern() == "Solidos")
    		{
    			if(((Solidos)prod).getKilos()<10)
    			{
    				System.out.println(i+") Codigo del producto: "+prod.getCodigo()+" | Existencia: "+((Solidos)prod).getKilos()+" Kilogramos");
    				i++;
    			}
    		} else if(prod.getClass().getSimpleName().intern() == "Carnes")
    		{
    			if(((Carnes)prod).getKilos()<10)
    			{
    				System.out.println(i+") Codigo del producto: "+prod.getCodigo()+" | Existencia: "+((Carnes)prod).getKilos()+" Kilogramos");
    				i++;
    			}
    		} else
    		{
    			if(prod.getUnidades()<10)
    			{
    			System.out.println(i+") Codigo del producto: "+prod.getCodigo()+" | Existencia: "+prod.getUnidades()+" Unidades");
    			i++;
    			}
    		}
    	}
    	
    	System.out.println("");
    	
    	inicio();
    	
    }


    public void salir() {
        System.exit(0);
    }
    
}
