package co.edu.uniquindio.gestionpeajes.model;
import java.util.ArrayList;
import java.util.List;

public class Conductor extends Persona {
    String nombre;
    String apellidos;
    String documento;
    String fechaNacimiento;

    private List<Vehiculo> vehiculos;
    private List<Peaje> listPeajes;

    public Conductor(String nombre, String apellidos, String documento, String fechaNacimiento) {
        super(nombre, apellidos, documento, fechaNacimiento);
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.documento = documento;
        this.fechaNacimiento = fechaNacimiento;
        this.vehiculos = new ArrayList<>();
    }


    public void asignarVehiculo(Vehiculo v) {
        //Hacer validaciones para la agregacion del vehiculo
        vehiculos.add(v);
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    // Devuelve una lista de vehículos de un tipo específico ("Carro", "Moto", "Camion")
    public List<Vehiculo> getVehiculosPorTipo(String tipo) {
        List<Vehiculo> resultado = new ArrayList<>();
        for (Vehiculo v : vehiculos) {
            if (v.getClass().getSimpleName().equalsIgnoreCase(tipo)) {
                resultado.add(v);
            }
        }
        return resultado;
    }

    // Consulta el total de dinero pagado en peajes por cada vehículo que el conductor tiene asignado
    public String consultarTotalPagadoEnPeajes() {
        StringBuilder sb = new StringBuilder();
        double total = 0;

        sb.append("Conductor: ").append(nombre).append(" ").append(apellidos).append("\n");
        for (Vehiculo v : vehiculos) {
            double valor = v.getcalcularPeaje();
            total += valor;
            sb.append("- ").append(v.getDescripcion()).append(" | Total pagado: $").append(valor).append("\n");
        }
        sb.append("Total general pagado: $").append(total).append("\n");
        return sb.toString();
    }

    // Verifica si el conductor tiene al menos un camión con capacidad de carga mayor a 10 toneladas
    public boolean tieneCamionDeAltaCarga() {
        boolean flag = false;
        for (Vehiculo v : vehiculos) {
            if (v instanceof Camion) {
                Camion c = (Camion) v;
                if (c.getCapacidadCarga() > 10) {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public String getNombreCompleto() {
        return nombre.trim() + " " + apellidos.trim();
    }

    public void imprimirTotalPagado() {

    }
}


