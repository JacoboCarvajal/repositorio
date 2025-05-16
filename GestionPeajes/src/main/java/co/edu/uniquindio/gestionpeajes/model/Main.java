package co.edu.uniquindio.gestionpeajes.model;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EstacionPeaje peaje = new EstacionPeaje("Peaje Norte", "Cundinamarca");

        // Conductores
        Conductor c1 = new Conductor("Ana", "Pérez", "123", "1980-01-01");
        Conductor c2 = new Conductor("Luis", "García", "456", "1975-05-05");

        // Vehículos
        Carro carro = new Carro("ABC123", true, true);
        Moto moto = new Moto("MOTO99", 250);
        Camion camion = new Camion("CAM555", 3, 12.5);

        c1.asignarVehiculo(carro);
        c1.asignarVehiculo(moto);
        c2.asignarVehiculo(camion);

        // Recaudador
        Recaudador r1 = new Recaudador("Carlos", "Torres", "999", "1990-12-12", 2000000);
        peaje.agregarRecaudador(r1);

        // Cobros
        peaje.cobrarPeaje(carro);
        peaje.cobrarPeaje(moto);
        peaje.cobrarPeaje(camion);

        // Reporte de peajes
        peaje.imprimirReporte();

        // Total por conductor
        c1.imprimirTotalPagado();
        c2.imprimirTotalPagado();

        // Buscar recaudador
        Recaudador encontrado = peaje.buscarRecaudador("  carlos torres ");
        System.out.println("Recaudador encontrado: " + (encontrado != null));

        // Conductores con camiones de alto tonelaje
        List<Conductor> lista = EstacionPeaje.conductoresConCamionDeAltaCarga(List.of(c1, c2));
        System.out.println("Conductores con camión >10t: " + lista.size());
    }
}
