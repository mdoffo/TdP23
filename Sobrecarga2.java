public class Sobrecarga2 {
    public static void main(String[] args) {
        int month = 6, day = 24, year = 2015;
        displayDate(month);
        displayDate(month, day);
        displayDate(month, day, year); 
    }
    public static void displayDate(int month) {
        displayDate(month, 1, 2014);
    }
    public static void displayDate(int month, int day) {
        displayDate(month, day, 2014);
    }
    public static void displayDate(int month, int day, int year) {
        System.out.println("Hoy es: " + day + " del mes " + month + " del año " + year);        
    }
} 
