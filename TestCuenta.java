import java.util.Scanner;

public class TestCuenta {

    public static double escanDouble(){
        Scanner entrada = new Scanner(System.in);
        String linea = entrada.nextLine();
        double monto = Double.parseDouble(linea);
        return monto;
    }

    public static void main(String[] args) {
        System.out.println("Ingrese saldo incial: $");
        // llamo el m'etodo est'atico creado antes para escanear el monto y lo igualo para tomarlo desde una variable local
        double monto = escanDouble();

        // Creo el objeto cuenta con el saldo inicial
        Cuenta nuevaCuenta = new Cuenta(monto);
        System.out.println("Indique monto a pagar: $");
        monto = escanDouble();
        //paso el monto a ser abonado
        nuevaCuenta.abonar(monto);
        monto = nuevaCuenta.obtenerSaldo();
        System.out.println("Su saldo actual es: $ "+ monto);

    }
}
