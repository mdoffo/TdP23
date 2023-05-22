import java.util.Scanner;

public class TestServicioSpa2 {

    public static void main(String[] args) {

        String descripcion;
        double precio;

        // COMPORTAMIENTO del gestor
        
        System.out.println("Primer servicio");
        Scanner entrada = new Scanner(System.in) ;
        System.out.println("Ingrese Descripcion: ");
        descripcion = entrada.next();
        entrada = new Scanner(System.in) ;
        System.out.println("Ingrese Precio: ");
        String line = entrada.nextLine();
        precio = Double.parseDouble(line);
        //ServicioSpa2 servicioSpaPrimero = new ServicioSpa2(descripcion, precio);
        System.out.println(" Primer Servicio: "+ descripcion + " " + precio);

        System.out.println("Segundo servicio");
        entrada = new Scanner(System.in) ;
        System.out.println("Ingrese Descripcion: ");
        descripcion = entrada.next();
        entrada = new Scanner(System.in) ;
        System.out.println("Ingrese Precio: ");
        line = entrada.nextLine();
        precio = Double.parseDouble(line);
        //ServicioSpa2 servicioSpaSegundo = new ServicioSpa2(descripcion, precio); 
        System.out.println(" Segundo Servicio: "+ descripcion + " " + precio);
        // se muestran los valores
        /*System.out.println("Primer servicio");
        System.out.println(servicioSpaPrimero.getDescripcion() + " " + servicioSpaPrimero.getPrecio());
        System.out.println("Segundo servicio");
        System.out.println(servicioSpaSegundo.getDescripcion() + " " + servicioSpaSegundo.getPrecio()); */
    }    
}
