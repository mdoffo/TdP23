
public class TestServicioSpa {
    public static void main(String[] args) {
        // creamos los objetos
        ServicioSpa servicioSpa1 = new ServicioSpa();
        ServicioSpa servicioSpa2 = new ServicioSpa();
        // se intancian los objetos
        servicioSpa1.setDescripcion("Facial");
        servicioSpa1.setPrecio(150.20);
        servicioSpa2.setDescripcion("Masaje");
        servicioSpa2.setPrecio(340.00);
        // se muestran los valores
        System.out.println("Primer servicio");
        System.out.println(servicioSpa1.getDescripcion() + " " + servicioSpa1.getPrecio());
        System.out.println("Segundo servicio");
        System.out.println(servicioSpa2.getDescripcion() + " " + servicioSpa2.getPrecio());
    }    
}
