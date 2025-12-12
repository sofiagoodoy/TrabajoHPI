package org.ulpgc.HPI;

import java.time.LocalTime;

public class ApplianceController {

    public void aplicarHorarios(Custumer u) {
        LocalTime ahora = LocalTime.now();

        for (Appliance e : u.getElectrodomesticos()) {
            UseTime h = e.getHorario();

            if (h != null && h.isAutoEncendido()) {
                if (ahora.isAfter(h.getInicio()) && ahora.isBefore(h.getFin())) {
                    e.encender();
                } else {
                    e.apagar();
                }
            }
        }
    }

    public void encender(Appliance e) {
        e.encender();
    }

    public void apagar(Appliance e) {
        e.apagar();
    }
}

