package org.ulpgc.HPI;

public class Appliance {
    private String nombre;
    private double potenciaW;
    private double consumoActualKWh;
    private boolean estado;
    private UseTime horario;

    public Appliance(String nombre, double potenciaW) {
        this.nombre = nombre;
        this.potenciaW = potenciaW;
        this.consumoActualKWh = 0;
        this.estado = false;
        this.horario = null;
    }

    public void setHorario(UseTime horario) {
        this.horario = horario;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPotenciaW() {
        return potenciaW;
    }

    public double getConsumoActualKWh() {
        return consumoActualKWh;
    }

    public void setConsumoActualKWh(double consumoActualKWh) {
        this.consumoActualKWh = consumoActualKWh;
    }

    public boolean isEncendido() {
        return estado;
    }

    public void encender() {
        this.estado = true;
    }

    public void apagar() {
        this.estado = false;
    }

    public UseTime getHorario() {
        return horario;
    }
}

