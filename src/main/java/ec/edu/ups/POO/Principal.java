package ec.edu.ups.POO;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Persona p1 = new Persona("0101010");
        Persona p2 = new Persona();
        Persona p3 = new Persona();
        Persona p4 = new Persona();
        Persona p5 = new Persona();
        Persona p6 = new Persona();
        Persona p7 = new Persona();
        Persona p8 = new Persona();
        Persona p9 = new Persona();
        Persona p10 = new Persona();

        System.out.println("Ingrese datos de la Persona 1:");
        System.out.print("Cedula: ");
        p1.setCedula(sc.nextLine());
        System.out.print("Nombre: ");
        p1.setNombre(sc.nextLine());
        System.out.print("Apellido: ");
        p1.setApellido(sc.nextLine());
        System.out.print("Direccion: ");
        p1.setDireccion(sc.nextLine());

        System.out.println("\nIngrese datos de la Persona 2:");
        p2.setCedula(sc.nextLine());
        p2.setNombre(sc.nextLine());
        p2.setApellido(sc.nextLine());
        p2.setDireccion(sc.nextLine());

        System.out.println("\nIngrese datos de la Persona 3:");
        p3.setCedula(sc.nextLine());
        p3.setNombre(sc.nextLine());
        p3.setApellido(sc.nextLine());
        p3.setDireccion(sc.nextLine());

        System.out.println("\nIngrese datos de la Persona 4:");
        p4.setCedula(sc.nextLine());
        p4.setNombre(sc.nextLine());
        p4.setApellido(sc.nextLine());
        p4.setDireccion(sc.nextLine());

        System.out.println("\nIngrese datos de la Persona 5:");
        p5.setCedula(sc.nextLine());
        p5.setNombre(sc.nextLine());
        p5.setApellido(sc.nextLine());
        p5.setDireccion(sc.nextLine());

        System.out.println("\nIngrese datos de la Persona 6:");
        p6.setCedula(sc.nextLine());
        p6.setNombre(sc.nextLine());
        p6.setApellido(sc.nextLine());
        p6.setDireccion(sc.nextLine());

        System.out.println("\nIngrese datos de la Persona 7:");
        p7.setCedula(sc.nextLine());
        p7.setNombre(sc.nextLine());
        p7.setApellido(sc.nextLine());
        p7.setDireccion(sc.nextLine());

        System.out.println("\nIngrese datos de la Persona 8:");
        p8.setCedula(sc.nextLine());
        p8.setNombre(sc.nextLine());
        p8.setApellido(sc.nextLine());
        p8.setDireccion(sc.nextLine());

        System.out.println("\nIngrese datos de la Persona 9:");
        p9.setCedula(sc.nextLine());
        p9.setNombre(sc.nextLine());
        p9.setApellido(sc.nextLine());
        p9.setDireccion(sc.nextLine());

        System.out.println("\nIngrese datos de la Persona 10:");
        p10.setCedula(sc.nextLine());
        p10.setNombre(sc.nextLine());
        p10.setApellido(sc.nextLine());
        p10.setDireccion(sc.nextLine());

        System.out.println("\n--- Datos de las Personas ---");
        System.out.println("Persona 1: Cedula: " + p1.getCedula() + ", Nombre: " + p1.getNombre() + " " + p1.getApellido() + ", Direccion: " + p1.getDireccion());
        System.out.println("Persona 2: Cedula: " + p2.getCedula() + ", Nombre: " + p2.getNombre() + " " + p2.getApellido() + ", Direccion: " + p2.getDireccion());
        System.out.println("Persona 3: Cedula: " + p3.getCedula() + ", Nombre: " + p3.getNombre() + " " + p3.getApellido() + ", Direccion: " + p3.getDireccion());
        System.out.println("Persona 4: Cedula: " + p4.getCedula() + ", Nombre: " + p4.getNombre() + " " + p4.getApellido() + ", Direccion: " + p4.getDireccion());
        System.out.println("Persona 5: Cedula: " + p5.getCedula() + ", Nombre: " + p5.getNombre() + " " + p5.getApellido() + ", Direccion: " + p5.getDireccion());
        System.out.println("Persona 6: Cedula: " + p6.getCedula() + ", Nombre: " + p6.getNombre() + " " + p6.getApellido() + ", Direccion: " + p6.getDireccion());
        System.out.println("Persona 7: Cedula: " + p7.getCedula() + ", Nombre: " + p7.getNombre() + " " + p7.getApellido() + ", Direccion: " + p7.getDireccion());
        System.out.println("Persona 8: Cedula: " + p8.getCedula() + ", Nombre: " + p8.getNombre() + " " + p8.getApellido() + ", Direccion: " + p8.getDireccion());
        System.out.println("Persona 9: Cedula: " + p9.getCedula() + ", Nombre: " + p9.getNombre() + " " + p9.getApellido() + ", Direccion: " + p9.getDireccion());
        System.out.println("Persona 10: Cedula: " + p10.getCedula() + ", Nombre: " + p10.getNombre() + " " + p10.getApellido() + ", Direccion: " + p10.getDireccion());

        sc.close();
    }
}






















