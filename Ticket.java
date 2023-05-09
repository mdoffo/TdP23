import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Ticket
 */
public class Ticket {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in) ;
       System.out.println("Ingrese nro de Ticket: ");
       int nroTicket = entrada.nextInt();

       BigDecimal numero = new BigDecimal(nroTicket * 0.1).setScale(2, RoundingMode.HALF_DOWN) ; //paso a decimal el numero para separar el codigo de verificacion
       BigDecimal uno = new BigDecimal(1); //creo BigDecimal 1 para poder hacer las operaciones necesarias
       BigDecimal codVerificacionDec = numero.remainder(uno); //Saco el primer decimal como nro de verificación
       BigDecimal parteEntera = numero.subtract(codVerificacionDec); //Separo la parte entera de la decimal
       BigDecimal diez = new BigDecimal(10); //Vuelvo a hacer bigdecimal a un entero para poder operer
       BigDecimal codVerificacion = codVerificacionDec.multiply(diez); //paso el decimal a la parte entera
       BigDecimal siete = new BigDecimal(7); //Entero a bigdecimal
       BigDecimal resultado = parteEntera.remainder(siete); //Cálculo del modulo entre parteEntera y 7 para poder comparar
       if (resultado.compareTo(codVerificacion) == 0) {
           System.out.println("True");
       }
       else {
           System.out.println("False");
       }
       System.out.println("Nro de Ticket: "+ parteEntera);
       System.out.println("Codigo de Verificacion: "+ codVerificacion);
       System.out.println("Resultado: "+ resultado);

    }
}

