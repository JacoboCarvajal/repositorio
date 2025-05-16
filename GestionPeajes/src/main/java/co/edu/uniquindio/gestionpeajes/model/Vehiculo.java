package co.edu.uniquindio.gestionpeajes.model;

import java.util.List;

public abstract class Vehiculo implements IDesctriptible {
    protected String placa;
    protected int numPeajesPagados;
    //Agregar: Atributo conductor -> surge de la relacion de clases
    private Conductor conductor;
    private List<Peaje> listPeajes;

    public Vehiculo(String placa) {
        this.placa = placa;
        this.numPeajesPagados = 0;
    }

    public abstract double calcularPeaje();
    public abstract String getDescripcion();

    public String getPlaca() {
        return placa;
    }

    public int getNumPeajesPagados() {
        return numPeajesPagados;
    }

    public void registrarPago() {
        numPeajesPagados++;
    }

    public double getcalcularPeaje() {
        return calcularPeaje();

    }
}
