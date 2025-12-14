package org.ulpgc.HPI;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String address;
    private String phone;
    private boolean premium;
    private List<Appliance> appliances;

    public Customer(String name, String address, String phone, boolean premium) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.premium = premium;
        this.appliances = new ArrayList<>();
    }

    public void addAppliance(Appliance e) {
        appliances.add(e);
    }

    public List<Appliance> getAppliances() {
        return appliances;
    }

    public boolean isPremium() {
        return premium;
    }
    public String getName() {
        return name;
    }
    public String getPhone() {return phone;}
    public String getAddress() {return address;}

}

