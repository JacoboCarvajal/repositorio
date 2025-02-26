//Abstraccion:
//Que se solicita finalmente?
//Almacenar la informacion de los estudiantes
/// Que informacion es relevante?
//Los datos del nino: nombre, edad, genero, identificacion, alergias, nombreAcudiente, numAcudiente
/// Como se agrupa la informacion relevante?
//En una clase llamada estudiante en la que cada estudiante es un objeto
/// Que funcionalidades se solicitan finalmente?
//Almacenar la informacion de cada estudiante
///Descompocision:
///Como se distribuyen las funcionalidades?
//1.Crear una clase de estudiantes con los datos solicitados
//2.Implementar getters y setters
//3.Crear una lista de estudiantes para almacenar sus registros
/// ¿Qué debo hacer para probar las funcionalidades?
// Probar la funcionalidad mediante una interfaz de consola.

import java.util.ArrayList;
import java.util.List;

class Acudiente {
    private String nombre;
    private String numeroContacto;

    public Acudiente(String nombre, String numeroContacto) {
        this.nombre = nombre;
        this.numeroContacto = numeroContacto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumeroContacto() {
        return numeroContacto;
    }

    public void setNumeroContacto(String numeroContacto) {
        this.numeroContacto = numeroContacto;
    }
}

class Boy {
    private final String nombre;
    private String edad;
    private String genero;
    private String alergias;
    private final String id;
    private Acudiente acudiente;

    public Boy(String nombre, String edad, String genero, String alergias, String id, Acudiente acudiente) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.alergias = alergias;
        this.id = id;
        this.acudiente = acudiente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getId() {
        return id;
    }

    public Acudiente getAcudiente() {
        return acudiente;
    }

    public void setAcudiente(Acudiente acudiente) {
        this.acudiente = acudiente;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " | Edad: " + edad + " | Género: " + genero +
                " | Alergias: " + alergias + " | ID: " + id +
                " | Acudiente: " + acudiente.getNombre() + " | Contacto: " + acudiente.getNumeroContacto());
    }
}

class Guarderia {
    private List<Boy> boys = new ArrayList<>();

    public void registrarNiño(Boy boy) {
        boys.add(boy);
        System.out.println("Niño registrado con éxito: " + boy.getNombre());
    }

    public Boy buscarNiño(String id) {
        for (Boy boy : boys) {
            if (boy.getId().equals(id)) {
                return boy;
            }
        }
        return null;
    }

    public void listarNiños() {
        if (boys.isEmpty()) {
            System.out.println("No hay niños registrados.");
        } else {
            for (Boy boy : boys) {
                boy.mostrarInfo();
            }
        }
    }
}