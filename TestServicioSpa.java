
public class TestServicioSpa {
    public static void main(String[] args) {
        // creamos los objetos
        ServicioSpa servicioSpa1 = new ServicioSpa();
        ServicioSpa servicioSpa2 = new ServicioSpa();
        // se intancian los objetos
        
        System.out.println("Primer servicio");
        servicioSpa1.setDescripcion(); 
        servicioSpa1.setPrecio();

        System.out.println("Segundo servicio");
        servicioSpa2.setDescripcion(); 
        servicioSpa2.setPrecio();
        // se muestran los valores
        System.out.println("Primer servicio");
        System.out.println(servicioSpa1.getDescripcion() + " " + servicioSpa1.getPrecio());
        System.out.println("Segundo servicio");
        System.out.println(servicioSpa2.getDescripcion() + " " + servicioSpa2.getPrecio());
    }    
}
