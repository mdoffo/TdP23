
import java.util.Scanner;


public class ServicioSpa {
    
    // ATRIBUTOS
    private String Descripcion;
    private double Precio;

    // METODOS
    public void setDescripcion () { 
       Scanner entrada = new Scanner(System.in) ;
       System.out.println("Ingrese Descripcion: ");
       Descripcion = entrada.next();
       
    }
    public void setPrecio () { 
       Scanner entrada = new Scanner(System.in) ;
       System.out.println("Ingrese Precio: $ ");
       String line = entrada.nextLine();

       Precio = Double.parseDouble(line);
       
    }
    public String getDescripcion() {
        return Descripcion;
    }
    public double getPrecio() {
        return Precio;
    }
}
