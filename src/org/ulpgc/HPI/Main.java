package org.ulpgc.HPI;

import java.time.LocalTime;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       //datos usuario
        System.out.println("Introduce your name:");
        String name = sc.nextLine();

        System.out.println("Introduce your address:");
        String address = sc.nextLine();

        System.out.println("Introduce your phone number:");
        String phone = sc.nextLine();

        System.out.println("Are you premium? (yes/no)");
        boolean isPremium = sc.nextLine().equalsIgnoreCase("yes");

        Customer user = new Customer(name, address, phone, isPremium);


        // electrodomesticos
        System.out.println("How many appliances do you want to register?");
        int amount = leerEntero(sc);

        for (int i = 0; i < amount; i++) {

            System.out.println("\nName of the appliance " + (i + 1) + ":");
            String nameAp = sc.nextLine();

            System.out.println("Power in W:");
            double power = leerDouble(sc);

            System.out.println("Actual consumption in kWh:");
            double consumption = leerDouble(sc);

            Appliance e = new Appliance(nameAp, power);
            e.setActualKWh(consumption);

            //horario
            System.out.println("\n" + "Do you want to assign automatic scheduling? (yes/no)");
            if (sc.nextLine().equalsIgnoreCase("yes")) {
                System.out.println("Start time (HH:mm):");
                LocalTime start = LocalTime.parse(sc.nextLine());

                System.out.println("End time (HH:mm):");
                LocalTime end = LocalTime.parse(sc.nextLine());

                UseTime schedule = new UseTime(start, end, true);
                e.setSchedule(schedule);
            }

            user.addAppliance(e);
        }

        // ==========================
        // TARIFA
        // ==========================
        System.out.println("\nIntroduce the price of the kWh (€):");
        double price = leerDouble(sc);

        EnergyRate rate = new EnergyRate(price, 0, 0);

        // ==========================
        // CONTROL AUTOMÁTICO (usa HorarioUso y Controlador)
        // ==========================
        ApplianceController controller = new ApplianceController();
        controller.addSchedule(user);

        // ==========================
        // FACTURA
        // ==========================
        ServiceConsumption service = new ServiceConsumption();
        Bill bill = service.generateBill(user, rate);

        // ==========================
        // RESULTADO
        // ==========================
        System.out.println("\n");
        System.out.println(user.getName() + ", your bill is: "
                + bill.getTotalPay() + " €");
        System.out.println("You has consumption: "
                + bill.getTotalKWh() + " kWh");
        System.out.println("You will receive a message with the total amount of the bill to: " +
                user.getPhone());
        if (user.isPremium()) {
            System.out.println("As a premium user if you want a technician for any of your appliances we will sent them to your address: +" +
                    user.getAddress());
        }



        sc.close();
    }

    // ----------- MÉTODOS DE LECTURA SEGURA -----------

    public static double leerDouble(Scanner sc) {
        while (true) {
            try {
                String s = sc.nextLine().trim().replace(",", ".");
                return Double.parseDouble(s);
            } catch (Exception e) {
                System.out.println("Valor inválido. Introduce un número:");
            }
        }
    }

    public static int leerEntero(Scanner sc) {
        while (true) {
            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (Exception e) {
                System.out.println("Introduce un número entero válido:");
            }
        }
    }
}
