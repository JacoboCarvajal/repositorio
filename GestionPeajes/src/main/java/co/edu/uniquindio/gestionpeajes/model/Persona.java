package co.edu.uniquindio.gestionpeajes.model;

public abstract class Persona {
    protected String nombre;
    protected String apellidos;
    protected String documento;
    protected String fechaNacimiento;

    public Persona(String nombre, String apellidos, String documento, String fechaNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.documento = documento;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombreCompleto() {
        return (nombre + " " + apellidos).trim().toLowerCase().replaceAll("\\s+", " ");
    }
}
