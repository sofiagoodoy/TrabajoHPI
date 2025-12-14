package org.ulpgc.HPI;

import java.time.LocalTime;


public class UseTime {
    private LocalTime startTime;
    private LocalTime endTime;
    private boolean autoOn;

    public UseTime(LocalTime startTime, LocalTime endTime, boolean autoOn) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.autoOn = autoOn;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public boolean isAutoOn() {
        return autoOn;
    }
}

