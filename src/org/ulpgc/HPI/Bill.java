package org.ulpgc.HPI;


public class Bill {
    private double totalKWh;
    private double totalPay;

    public Bill(double totalKWh, double totalPay) {
        this.totalKWh = totalKWh;
        this.totalPay = totalPay;
    }

    public void printBill() {
        System.out.println("----- FACTURA -----");
        System.out.println("Consumo total: " + totalKWh + " kWh");
        System.out.println("Total a pagar: " + totalPay + " €");
    }
    public double getTotalKWh() {
        return totalKWh;
    }

    public double getTotalPay() {
        return totalPay;
    }

}
