package org.ulpgc.HPI;

public class ServiceConsumption {

    public double calculateTotal(Customer u) {
        double total = 0;
        for (Appliance e : u.getAppliances()) {
            total += e.getActualKWh();
        }
        return total;
    }

    public Bill generateBill(Customer u, EnergyRate t) {
        double consumption = calculateTotal(u);
        double totalToPay = consumption * t.getPriceActualKWh();
        return new Bill(consumption, totalToPay);
    }

}
