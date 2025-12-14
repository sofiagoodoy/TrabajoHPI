package org.ulpgc.HPI;

import java.time.LocalTime;


public class ApplianceController {

    public void addSchedule(Customer u) {
        LocalTime now = LocalTime.now();

        for (Appliance e : u.getAppliances()) {
            UseTime h = e.getSchedule();

            if (h != null && h.isAutoOn()) {
                if (now.isAfter(h.getStartTime()) && now.isBefore(h.getEndTime())) {
                    e.on();
                } else {
                    e.off();
                }
            }
        }
    }

    public void on(Appliance e) {
        e.on();
    }

    public void off(Appliance e) {
        e.off();
    }
}

