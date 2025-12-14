package org.ulpgc.HPI;


public class Bill {
    private double totalKWh;
    private double totalPay;

    public Bill(double totalKWh, double totalPay) {
        this.totalKWh = totalKWh;
        this.totalPay = totalPay;
    }

    public void printBill() {
        System.out.println("----- BILL -----");
        System.out.println("Total consumption: " + totalKWh + " kWh");
        System.out.println("Total to pay: " + totalPay + " €");
    }
    public double getTotalKWh() {
        return totalKWh;
    }

    public double getTotalPay() {
        return totalPay;
    }

}
