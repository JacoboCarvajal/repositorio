package co.edu.uniquindio.gestionpeajes.model;

public class Camion extends Vehiculo {
    private int ejes;
    private double capacidadCarga; // en toneladas

    public Camion(String placa, int ejes, double capacidadCarga) {
        super(placa);
        this.ejes = ejes;
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public double calcularPeaje() {
        double base = 7000 * ejes;
        if (capacidadCarga > 10) base *= 1.10;
        return base;
    }

    @Override
    public String getDescripcion() {
        return "Camión - Placa: " + placa + " - Ejes: " + ejes + " - Carga: " + capacidadCarga + " toneladas";
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }
}
