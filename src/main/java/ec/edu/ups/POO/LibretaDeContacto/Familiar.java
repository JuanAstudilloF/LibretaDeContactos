package ec.edu.ups.POO.LibretaDeContacto;

import java.util.GregorianCalendar;

public class Familiar extends Persona {

    private String parentesco;
    private String tipoDeSangre;
    private GregorianCalendar fechaNacimiento;


    public Familiar() {

    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public void setTipoDeSangre(String tipoDeSangre) {
        this.tipoDeSangre = tipoDeSangre;
    }

    public void setFechaNacimiento(GregorianCalendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return super.toString() + "\nParentesco: " + parentesco + "\nTipo de sangre: " + tipoDeSangre + "\nFecha de nacimiento: " + fechaNacimiento;
    }
}