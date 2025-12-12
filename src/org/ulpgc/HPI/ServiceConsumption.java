package org.ulpgc.HPI;

public class ServiceConsumption {

    public double calcularConsumoTotal(Custumer u) {
        double total = 0;
        for (Appliance e : u.getElectrodomesticos()) {
            total += e.getConsumoActualKWh();
        }
        return total;
    }

    public Bill generarFactura(Custumer u, EnergyRate t) {
        double consumo = calcularConsumoTotal(u);
        double totalPagar = consumo * t.getPrecioActualKWh();
        return new Bill(consumo, totalPagar);
    }

}
