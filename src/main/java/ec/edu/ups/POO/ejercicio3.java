package ec.edu.ups.POO;
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ingresa tu calificación de (0 - 10): ");
        int nota = sc.nextInt();

        char letra;

        switch (nota) {
            case 10:
            case 9:
                letra = 'A';
                break;
            case 8:
                letra = 'B';
                break;
            case 7:
                letra = 'C';
                break;
            case 6:
                letra = 'D';
                break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                letra = 'F';
                break;
            default:
                letra = 'X';
                break;
        }

        if (letra == 'X') {
            System.out.println("nota invalida");
        } else {
            System.out.println("tu nota en letra es: " + letra);
        }

        sc.close();
    }
}
