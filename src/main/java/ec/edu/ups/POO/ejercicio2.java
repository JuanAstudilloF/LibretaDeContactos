package ec.edu.ups.POO;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ingresa tu calificacion (0 - 100): ");
        int calificacion = sc.nextInt();

        if (calificacion >= 70 && calificacion <= 100) {
            System.out.println("usted a aprobado");
        } else if (calificacion >= 0 && calificacion < 70) {
            System.out.println("usted a reprobado");
        } else {
            System.out.println("calificacion invalida");
        }

        sc.close();
    }
}
