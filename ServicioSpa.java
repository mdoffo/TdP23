
public class ServicioSpa {
    
    // ATRIBUTOS
    private String Descripcion;
    private double Precio;

    // METODOS
    public void setDescripcion (String descripcion) {
       Descripcion = descripcion;
    }
    public void setPrecio (double precio) {
        Precio = precio;
    }
    public String getDescripcion() {
        return Descripcion;
    }
    public double getPrecio() {
        return Precio;
    }
}