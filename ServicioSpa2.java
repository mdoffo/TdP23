public class ServicioSpa2 {
    
    // ATRIBUTOS
    private String Descripcion;
    private double Precio;

    // METODOS
    public void setDescripcion (String descripcion) {
        this.Descripcion = descripcion;
    }
    public void setPrecio (double precio) {
        this.Precio = precio;
    }
    public String getDescripcion() {
        return this.Descripcion;
    }
    public double getPrecio() {
        return this.Precio;
    }

    // CONSTRUCTOR
    public void ServicioSpa2(String descripcion, double precio){
        this.Descripcion = descripcion;
        this.Precio = precio;
    }
}
