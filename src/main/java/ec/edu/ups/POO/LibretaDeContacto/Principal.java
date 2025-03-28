package ec.edu.ups.POO.LibretaDeContacto;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese cuantas personas desea registrar: ");
        int nPersonas = sc.nextInt();
        sc.nextLine();

        Persona[] personas = new Persona[nPersonas];

        for (int i = 0; i < nPersonas; i++) {
            Persona persona = new Persona();

            System.out.println("\n--- Ingrese los datos de la persona " + (i + 1) + " ---");
            System.out.print("Nombre: ");
            persona.setNombre(sc.nextLine());

            System.out.print("Apellido: ");
            persona.setApellido(sc.nextLine());

            System.out.print("Cedula: ");
            persona.setCedula(sc.nextLine());

            System.out.print("Direccion: ");
            persona.setDireccion(sc.nextLine());

            personas[i] = persona;
        }

        System.out.println("\n¿Cuantos familiares desea registrar?");
        int nFamiliares = sc.nextInt();
        sc.nextLine();

        Familiar[] familiares = new Familiar[nFamiliares];

        for (int i = 0; i < nFamiliares; i++) {
            Familiar familiar = new Familiar();

            System.out.println("\n--- Ingrese los datos del familiar " + (i + 1) + " ---");
            System.out.print("Nombre: ");
            familiar.setNombre(sc.nextLine());

            System.out.print("Apellido: ");
            familiar.setApellido(sc.nextLine());

            System.out.print("Cedula: ");
            familiar.setCedula(sc.nextLine());

            System.out.print("Direccion: ");
            familiar.setDireccion(sc.nextLine());

            System.out.print("Parentesco: ");
            familiar.setParentesco(sc.nextLine());

            System.out.print("Tipo de sangre: ");
            familiar.setTipoDeSangre(sc.nextLine());

            System.out.print("Año de nacimiento: ");
            int anioNacimiento = sc.nextInt();
            sc.nextLine();

            System.out.print("Mes de nacimiento: ");
            int mesNacimiento = sc.nextInt() - 1;
            sc.nextLine();

            System.out.print("Dia de nacimiento: ");
            int diaNacimiento = sc.nextInt();
            sc.nextLine();

            GregorianCalendar fechaNacimiento = new GregorianCalendar(anioNacimiento, mesNacimiento, diaNacimiento);
            familiar.setFechaNacimiento(fechaNacimiento);

            familiares[i] = familiar;
        }

        System.out.println("\n--- Lista de Personas ---");
        for (Persona persona : personas) {
            System.out.println(persona);
            System.out.println();
        }

        System.out.println("\n--- Lista de Familiares ---");
        for (Familiar familiar : familiares) {
            System.out.println(familiar);
            System.out.println();
        }
    }
}