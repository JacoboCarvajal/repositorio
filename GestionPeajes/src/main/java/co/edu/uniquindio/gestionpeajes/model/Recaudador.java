package co.edu.uniquindio.gestionpeajes.model;

public class Recaudador extends Persona {
    private double sueldoMensual;
    private Peaje peaje;

    public Recaudador(String nombre, String apellidos, String documento, String fechaNacimiento, double sueldoMensual) {
        super(nombre, apellidos, documento, fechaNacimiento);
        this.sueldoMensual = sueldoMensual;
    }
}
