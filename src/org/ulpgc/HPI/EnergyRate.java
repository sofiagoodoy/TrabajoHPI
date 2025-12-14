package org.ulpgc.HPI;


public class EnergyRate {
    private double priceActualKWh;
    private double precioPunta;
    private double precioValle;

    public EnergyRate(double priceActualKWh, double precioPunta, double precioValle) {
        this.priceActualKWh = priceActualKWh;
        this.precioPunta = precioPunta;
        this.precioValle = precioValle;
    }

    public double getPriceActualKWh() {
        return priceActualKWh;
    }
}
