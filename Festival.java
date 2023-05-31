import java.time.*;

/**
 * Festival
 */
public class Festival {

    private int anoEdicion;
    private double descuentoVtaAnticipada;
    private DiaFestival[] diaFestival;
    private LocalDate fechaInicio;
    private String nombre;
    private double porcentajeDevolucionPorAnulacion;
    private boolean vigente;

    public void setAnoEdicion(int anoEdicion){
        this.anoEdicion = anoEdicion;
    }
    public void setDescuentoVtaAnticipada(double descuentoVtaAnticipada){
        this.descuentoVtaAnticipada = descuentoVtaAnticipada;
    }
    // VER QUE PASA CON diaFestival
    public void setFechaInicio(LocalDate fechaInicio){
        this.fechaInicio = fechaInicio;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setPorcentajeDevolucionPorAnulacion(double porcentajeDevolucionPorAnulacion){
        this.porcentajeDevolucionPorAnulacion = porcentajeDevolucionPorAnulacion;
    }
    public void setVigente(boolean vigente){
        this.vigente = vigente;
    }
    public int getAnoEdicion(){
        return this.anoEdicion;
    }
    public double getDescuentoVtaAnticipada(){
        return this.descuentoVtaAnticipada;
    }
    // VER COMO SE HACE CON DiaFestival
    public LocalDate getFechaInicio(){
        return this.fechaInicio;
    }
    public String getNombre(){
        return this.nombre;
    }
    public double getPorcentajeDevolucionPorAnulacion(){
        return this.porcentajeDevolucionPorAnulacion;
    }
    public boolean getVigente(){
        return this.vigente;
    }

}
