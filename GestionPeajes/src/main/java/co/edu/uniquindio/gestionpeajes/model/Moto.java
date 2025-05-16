package co.edu.uniquindio.gestionpeajes.model;

public class Moto extends Vehiculo{
    private int cilindraje;

    public Moto(String placa, int cilindraje) {
        super(placa);
        this.cilindraje = cilindraje;
    }

    @Override
    public double calcularPeaje() {
        return cilindraje > 200 ? 7000 : 5000;
    }

    @Override
    public String getDescripcion() {
        return "Moto - Placa: " + placa + " - Cilindraje: " + cilindraje + "cc";
    }
}
