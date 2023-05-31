import java.time.*;

public class DiaFestival {

    private boolean completa;
    private LocalDate fecha;
    private LocalDate fechaLimiteAnulacionEntrada;
    private LocalDate fechaVtoVtaAnticipada;
    private LocalTime horaPresentacion;

    public void setFecha(LocalDate fecha){
        this.fecha = fecha;
    }
    public void setFechaLimiteAnulacionEntrada(LocalDate fechaLimiteAnulacionEntrada){
        this.fechaLimiteAnulacionEntrada = fechaLimiteAnulacionEntrada;
    }
    public void setFechaVtoVtaAnticipadas(LocalDate fechaVtoVtaAnticipada){
        this.fechaVtoVtaAnticipada = fechaVtoVtaAnticipada;
    }
    public void setHoraPresentacion(LocalTime horaPresentacion){
        this.horaPresentacion = horaPresentacion;
    }

    public LocalDate getFecha(){
        return this.fecha;
    }
    public LocalDate fechaLimiteAnulacionEntrada(){
        return this.fechaLimiteAnulacionEntrada;
    }
    public LocalDate getFechaVtoVtaAnticipada(){
        return this.fechaVtoVtaAnticipada;
    }
    public LocalTime getHoraPresentacin(){
        return this.horaPresentacion;
    }
    
}
