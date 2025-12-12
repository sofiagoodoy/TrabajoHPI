package org.ulpgc.HPI;

public class EnergyRate {
    private double precioActualKWh;
    private double precioPunta;
    private double precioValle;

    public EnergyRate(double precioActualKWh, double precioPunta, double precioValle) {
        this.precioActualKWh = precioActualKWh;
        this.precioPunta = precioPunta;
        this.precioValle = precioValle;
    }

    public double getPrecioActualKWh() {
        return precioActualKWh;
    }
}
