package ec.edu.ups.POO;
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ingresa tu calificación de (0 - 10): ");
        int nota = sc.nextInt();

        char letra = switch (nota) {
            case 10, 9 -> 'A';
            case 8 -> 'B';
            case 7 -> 'C';
            case 6 -> 'D';
            case 5, 4, 3, 2, 1, 0 -> 'F';
            default -> 'X';
        };

        if (letra == 'X') {
            System.out.println("nota invalida");
        } else {
            System.out.println("tu nota en letra es: " + letra);
        }

        sc.close();
    }
}
