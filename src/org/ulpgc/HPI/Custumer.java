package org.ulpgc.HPI;

import java.util.ArrayList;
import java.util.List;

public class Custumer {
    private String nombre;
    private String direccion;
    private String telefono;
    private boolean esPremium;
    private List<Appliance> appliances;

    public Custumer(String nombre, String direccion, String telefono, boolean esPremium) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.esPremium = esPremium;
        this.appliances = new ArrayList<>();
    }

    public void agregarElectrodomestico(Appliance e) {
        appliances.add(e);
    }

    public List<Appliance> getElectrodomesticos() {
        return appliances;
    }

    public boolean isEsPremium() {
        return esPremium;
    }
    public String getNombre() {
        return nombre;
    }

}

