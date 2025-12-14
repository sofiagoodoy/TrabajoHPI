package org.ulpgc.HPI;


public class EnergyRate {
    private double actualPriceKWh;
    private double pointPrice;
    private double valleyPrice;

    public EnergyRate(double priceActualKWh, double precioPunta, double precioValle) {
        this.actualPriceKWh = priceActualKWh;
        this.pointPrice = precioPunta;
        this.valleyPrice = precioValle;
    }

    public double getActualPriceKWh() {
        return actualPriceKWh;
    }
}
