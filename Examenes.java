import javax.management.MBeanRegistrationException;

public class Matriz {
    public static void main(String[] args) {
        char[] nombres = {'M', 'J', 'P', 'C', 'A'};
        double[] rtasCorrectas = {1, 2, 3, 4};
        double[][] rtasAlumnos = {{1, 2, 3, 4},{3, 2, 1, 4},{1, 2, 3, 4},{4, 3, 2, 1},{1, 2, 3, 4}};
        boolean[][] notas = new boolean[5][4];

        for (int alumno = 0; alumno < notas.length; alumno++) {
            for (int correcta = 0; correcta < notas[alumno].length; correcta++) {
                if (rtasAlumnos[alumno][correcta] == rtasCorrectas[correcta]){
                    notas[alumno][correcta] = true;
                } else {
                    notas[alumno][correcta] = false;
                }
                
            }
            
        }

        for (int alumno = 0; alumno < notas.length; alumno++) {
            int aprobacion = 0;
            for (int correcta = 0; correcta < notas[alumno].length; correcta++) {
                if (notas[alumno][correcta] == true){ aprobacion++;}
                System.out.print("["+ notas[alumno][correcta] +"] ");
            }
            if ( aprobacion >= 3){ System.out.print(" - Correctas: "+ aprobacion +" -- APROBADO");} else { System.out.print(" - Correctas: "+ aprobacion +" -- DESAPROBADO");}
            System.out.println();
        }


    }
}
