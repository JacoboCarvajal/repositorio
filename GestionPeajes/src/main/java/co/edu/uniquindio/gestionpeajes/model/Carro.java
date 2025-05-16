package co.edu.uniquindio.gestionpeajes.model;

public class Carro extends Vehiculo {
    private boolean electrico;
    private boolean servicioPublico;

    public Carro(String placa, boolean electrico, boolean servicioPublico) {
        super(placa);
        this.electrico = electrico;
        this.servicioPublico = servicioPublico;
    }

    @Override
    public double calcularPeaje() {
        double valor = 10000;
        if (electrico) valor *= 0.8;
        if (servicioPublico) valor *= 1.15;
        return valor;
    }

    @Override
    public String getDescripcion() {
        return "Carro - Placa: " + placa + " - Eléctrico: " + electrico + " - Servicio Público: " + servicioPublico;
    }

}
