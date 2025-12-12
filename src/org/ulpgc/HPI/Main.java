package org.ulpgc.HPI;

import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       //datos usuario
        System.out.println("Introduce tu nombre:");
        String nombre = sc.nextLine();

        System.out.println("Introduce tu dirección:");
        String direccion = sc.nextLine();

        System.out.println("Introduce tu número de teléfono:");
        String telefono = sc.nextLine();

        System.out.println("¿Eres premium? (si/no)");
        boolean esPremium = sc.nextLine().equalsIgnoreCase("si");

        Custumer usuario = new Custumer(nombre, direccion, telefono, esPremium);


        // electrodomesticos
        System.out.println("¿Cuántos electrodomésticos quieres registrar?");
        int cantidad = leerEntero(sc);

        for (int i = 0; i < cantidad; i++) {

            System.out.println("\nNombre del electrodoméstico " + (i + 1) + ":");
            String nombreElec = sc.nextLine();

            System.out.println("Potencia en W:");
            double potencia = leerDouble(sc);

            System.out.println("Consumo actual en kWh:");
            double consumo = leerDouble(sc);

            Appliance e = new Appliance(nombreElec, potencia);
            e.setConsumoActualKWh(consumo);

            //horario
            System.out.println("¿Quieres asignar horario automático? (si/no)");
            if (sc.nextLine().equalsIgnoreCase("si")) {
                System.out.println("Hora de inicio (HH:mm):");
                LocalTime inicio = LocalTime.parse(sc.nextLine());

                System.out.println("Hora de fin (HH:mm):");
                LocalTime fin = LocalTime.parse(sc.nextLine());

                UseTime horario = new UseTime(inicio, fin, true);
                e.setHorario(horario);
            }

            usuario.agregarElectrodomestico(e);
        }

        // ==========================
        // TARIFA
        // ==========================
        System.out.println("\nIntroduce el precio del kWh (€):");
        double precioKWh = leerDouble(sc);

        EnergyRate tarifa = new EnergyRate(precioKWh, 0, 0);

        // ==========================
        // CONTROL AUTOMÁTICO (usa HorarioUso y Controlador)
        // ==========================
        ApplianceController controlador = new ApplianceController();
        controlador.aplicarHorarios(usuario);

        // ==========================
        // FACTURA
        // ==========================
        ServiceConsumption servicio = new ServiceConsumption();
        Bill factura = servicio.generarFactura(usuario, tarifa);

        // ==========================
        // RESULTADO
        // ==========================
        System.out.println("\n=====================================");
        System.out.println(usuario.getNombre() + ", tu factura es: "
                + factura.getTotalAPagar() + " €");
        System.out.println("Has consumido: "
                + factura.getConsumoTotalKWh() + " kWh");
        System.out.println("=====================================");

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
