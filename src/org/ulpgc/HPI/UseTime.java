package org.ulpgc.HPI;

import java.time.LocalTime;

public class UseTime {
    private LocalTime inicio;
    private LocalTime fin;
    private boolean autoEncendido;

    public UseTime(LocalTime inicio, LocalTime fin, boolean autoEncendido) {
        this.inicio = inicio;
        this.fin = fin;
        this.autoEncendido = autoEncendido;
    }

    public LocalTime getInicio() {
        return inicio;
    }

    public LocalTime getFin() {
        return fin;
    }

    public boolean isAutoEncendido() {
        return autoEncendido;
    }
}

