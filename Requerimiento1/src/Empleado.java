///  Abstracción:
/// ¿Qué se solicita finalmente? (problema)
// Un Programa que almacene toda la informacion de un empleado

/// ¿Qué información es relevante dado el problema anterior?
// Su número de identificación, nombre completo, puesto, correo electrónico, número de teléfono y fecha de contratación.

/// ¿Cómo se agrupa la información relevante?
// Se representan con una clase *Empleado* en la cual cada empleado es un objeto

/// ¿Qué funcionalidades se solicitan finalmente?
// Almacenar y gestionar la información de empleados

///  Descomposición:
/// ¿Cómo se distribuyen las funcionalidades?
//1. Crear la clase Empleado con los atributos mencionados.
//2. Implementar métodos para acceder y modificar los datos (getters y setters).
//3. Crear una lista de empleados para gestionar múltiples registros.

import java.security.PrivateKey;

/// ¿Qué debo hacer para probar las funcionalidades?
// Probar la funcionalidad mediante una interfaz de consola.

import java.util.ArrayList;
import java.util.Scanner;



class Empleado {
    private String id;
    private String nombre;
    private String puesto;
    private String correo;
    private String telefono;
    private String fechaContratacion;


    public Empleado(String id, String nombre, String puesto, String correo, String telefono, String fechaContratacion) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.correo = correo;
        this.telefono = telefono;
        this.fechaContratacion = fechaContratacion;
    }

    // Getters y Setters
    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getPuesto() { return puesto; }
    public String getCorreo() { return correo; }
    public String getTelefono() { return telefono; }
    public String getFechaContratacion() { return fechaContratacion; }

    public void setPuesto(String puesto) { this.puesto = puesto; }
    public void setCorreo(String correo) { this.correo = correo; }
    public void setTelefono(String telefono) { this.telefono = telefono; }


    // Metodo para mostrar la información del empleado
    public void mostrarInfo() {
        System.out.println("ID: " + id + " | Nombre: " + nombre + " | Puesto: " + puesto +
                " | Correo: " + correo + " | Teléfono: " + telefono +
                " | Fecha de contratación: " + fechaContratacion);
    }
}



