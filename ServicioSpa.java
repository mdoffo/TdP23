import java.util.Scanner;

import java.util.Scanner;


public class ServicioSpa {
    
    // ATRIBUTOS
    private String Descripcion;
    private double Precio;

    // METODOS
    public void setDescripcion () { 
       Scanner entrada = new Scanner(System.in) ;
       System.out.println("Ingrese Descripcion: ");
       String descri = entrada.next();
       Descripcion = descri;
    }
    public void setPrecio () { 
       Scanner entrada = new Scanner(System.in) ;
       System.out.println("Ingrese Precio: $ ");
       double prec = entrada.nextDouble();
       Precio = prec;
    }
    public String getDescripcion() {
        return Descripcion;
    }
    public double getPrecio() {
        return Precio;
    }
}
