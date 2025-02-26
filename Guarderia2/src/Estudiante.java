import java.util.ArrayList;
import java.util.List;

class Acudiente2 {
    private String nombre;
    private String numeroContacto;

    public Acudiente2 (String nombre, String numeroContacto) {
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

class Boy2 {
    private final String id;
    private final String nombre;
    private int edad;
    private String genero;
    private String documentoIdentidad;
    private String alergias;
    private Acudiente2 acudiente2;

    public Boy2(String id, String nombre, int edad, String genero, String documentoIdentidad, String alergias, Acudiente2 acudiente2) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.documentoIdentidad = documentoIdentidad;
        this.alergias = alergias;
        this.acudiente2 = acudiente2;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public Acudiente2 getAcudiente2() {
        return acudiente2;
    }

    public void setAcudiente2(Acudiente2 acudiente2) {
        this.acudiente2 = acudiente2;
    }

    public void mostrarInfo() {
        System.out.println("ID: " + id + " | Nombre: " + nombre + " | Edad: " + edad + " | Género: " + genero +
                " | Documento: " + documentoIdentidad + " | Alergias: " + alergias +
                " | Acudiente: " + acudiente2.getNombre() + " | Contacto: " + acudiente2.getNumeroContacto());
    }
}

class Guarderia2 {
    private List<Boy2> boys2 = new ArrayList<>();

    public void registrarBoy2(Boy2 boy2) {
        for (Boy2 n : boys2) {
            if (n.getId().equals(boy2.getId())) {
                System.out.println("Error: El ID ya existe.");
                return;
            }
        }
        boys2.add(boy2);
        System.out.println("Niño registrado con éxito: " + boy2.getNombre());
    }

    public Boy2 buscarBoy2(String id) {
        for (Boy2 boy2 : boys2) {
            if (boy2.getId().equals(id)) {
                return boy2;
            }
        }
        return null;
    }

    public void eliminarBoy2(String id) {
        for (Boy2 boy2 : boys2) {
            if (boy2.getId().equals(id)) {
                boys2.remove(boy2);
                System.out.println("Niño eliminado con éxito: " + boy2.getNombre());
                return;
            }
        }
        System.out.println("Error: Niño no encontrado.");
    }

    public void listarBoys2() {
        if (boys2.isEmpty()) {
            System.out.println("No hay niños registrados.");
        } else {
            for (Boy2 boy2 : boys2) {
                boy2.mostrarInfo();
            }
        }
    }

    public void listarMayoresA5() {
        boolean encontrado = false;
        for (Boy2 boy2 : boys2) {
            if (boy2.getEdad() > 5) {
                boy2.mostrarInfo();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No hay niños mayores de 5 años registrados.");
        }
    }
}
