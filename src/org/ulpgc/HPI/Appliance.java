package org.ulpgc.HPI;

public class Appliance {
    private String name;
    private double powerW;
    private double actualKWh;
    private boolean state;
    private UseTime schedule;

    public Appliance(String name, double powerW) {
        this.name = name;
        this.powerW = powerW;
        this.actualKWh = 0;
        this.state = false;
        this.schedule = null;
    }

    public void setSchedule(UseTime setSchedule) {
        this.schedule = schedule;
    }

    public String getName() {
        return name;
    }

    public double getPowerW() {
        return powerW;
    }

    public double getActualKWh() {
        return actualKWh;
    }

    public void setActualKWh(double actualKWh) {
        this.actualKWh = actualKWh;
    }

    public boolean isOn() {
        return state;
    }

    public void on() {
        this.state = true;
    }

    public void off() {
        this.state = false;
    }

    public UseTime getSchedule() {
        return schedule;
    }
}

