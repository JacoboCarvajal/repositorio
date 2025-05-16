package co.edu.uniquindio.gestionpeajes.model;
import java.util.ArrayList;
import java.util.List;

public class EstacionPeaje {
    private String nombre;
    private String departamento;
    private double totalRecaudado;
    private List<Vehiculo> registroVehiculos;
    private List<Recaudador> recaudadores;
    //Agregar: Lista de conductores - Relacion entre clases
    private List<Conductor> listConductores;
    private List<Peaje> listPeajes;

    public EstacionPeaje(String nombre, String departamento) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.totalRecaudado = 0;
        this.registroVehiculos = new ArrayList<>();
        this.recaudadores = new ArrayList<>();
    }

    public double cobrarPeaje(Vehiculo v) {
        double valor = v.calcularPeaje();
        totalRecaudado += valor;
        v.registrarPago();
        registroVehiculos.add(v);
        return valor;
    }

    public void imprimirReporte() {
        System.out.println("=== Reporte de Estación: " + nombre + " ===");
        for (Vehiculo v : registroVehiculos) {
            System.out.println(v.getDescripcion() + " - Peaje calculado: $" + v.calcularPeaje());
            System.out.println(v.getDescripcion() + " - Peaje calculado: $" + (double) Math.round(v.calcularPeaje() * 100000) / 100000);
        }
        System.out.println("Total recaudado: $" + totalRecaudado);
    }

    public void agregarRecaudador(Recaudador r) {
        recaudadores.add(r);
    }

    public Recaudador buscarRecaudador(String nombreCompleto) {
        String normalizado = nombreCompleto.trim().toLowerCase().replaceAll("\\s+", " ");
        Recaudador recaudadorEncontrado = null;

        for (Recaudador r : recaudadores) {
            if (r.getNombreCompleto().equals(normalizado)) {
                recaudadorEncontrado = r;
            }
        }
        return recaudadorEncontrado;
    }

    public static List<Conductor> conductoresConCamionDeAltaCarga(List<Conductor> conductores) {
        List<Conductor> resultado = new ArrayList<>();
        for (Conductor c : conductores) {
            if (c.tieneCamionDeAltaCarga()) {
                resultado.add(c);
            }
        }
        return resultado;
    }
}
