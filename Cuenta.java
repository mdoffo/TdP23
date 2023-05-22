public class Cuenta {

    double saldo;

    public Cuenta(double saldoinicial){
        if (saldoinicial > 0){
            saldo = saldoinicial;
        } else {
            saldo = 0;
        }
    }
    public void abonar(double monto){
        if (saldo > 0 && saldo > monto){
            saldo = saldo - monto;
            System.out.println("Monto abonado");
        } else {
            System.out.println("Saldo Insuficiente");
        }
    }
    public double obtenerSaldo(){
        return this.saldo;
    }

}
