package ec.edu.ups.POO.LibretaDeContacto;

public class Persona {

    private String nombre;
    private String apellido;
    private String cedula;
    private String direccion;


    public Persona() {
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