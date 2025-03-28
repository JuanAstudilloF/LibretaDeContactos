package ec.edu.ups.POO;

public class Persona {

    private String nombre;
    private String apellido;
    private String cedula;
    private String direccion;


    public Persona() {
    }

    public Persona(String nombre, String apellido, String cedula, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.direccion = direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString(){
        return "Cedula" + cedula + "\nNombre: " + nombre + "\nApellido: " + apellido + "\nDireccion: " + direccion;

    }

}