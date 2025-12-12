package org.ulpgc.HPI;

public class Bill {
    private double consumoTotalKWh;
    private double totalAPagar;

    public Bill(double consumoTotalKWh, double totalAPagar) {
        this.consumoTotalKWh = consumoTotalKWh;
        this.totalAPagar = totalAPagar;
    }

    public void imprimirFactura() {
        System.out.println("----- FACTURA -----");
        System.out.println("Consumo total: " + consumoTotalKWh + " kWh");
        System.out.println("Total a pagar: " + totalAPagar + " €");
    }
    public double getConsumoTotalKWh() {
        return consumoTotalKWh;
    }

    public double getTotalAPagar() {
        return totalAPagar;
    }

}
