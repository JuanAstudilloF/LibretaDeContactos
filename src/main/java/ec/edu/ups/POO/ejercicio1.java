package ec.edu.ups.POO;
import java.util.Scanner;

public class ejercicio1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ingresa el primer numero: ");
        int a = sc.nextInt();
        System.out.print("ingresa el segundo numero: ");
        int b = sc.nextInt();

        System.out.println("suma: " + (a + b));
        System.out.println("resta: " + (a - b));
        System.out.println("multiplicacion: " + (a * b));
        System.out.println(b != 0 ? "division: " + (a / b) : "no se puede dividir entre 0");

        sc.close();
    }
}

