package org.ISF.repository;

import java.time.LocalTime;

public class Store {
    private String pickers;
    private LocalTime pickingStartTime;
    private LocalTime pickingEndTime;


    public String getPickers() {
        return pickers;
    }

    public void setPickers(String pickers) {
        this.pickers = pickers;
    }

    public LocalTime getPickingStartTime() {
        return pickingStartTime;
    }

    public void setPickingStartTime(LocalTime pickingStartTime) {
        this.pickingStartTime = pickingStartTime;
    }

    public LocalTime getPickingEndTime() {
        return pickingEndTime;
    }

    public void setPickingEndTime(LocalTime pickingEndTime) {
        this.pickingEndTime = pickingEndTime;
    }
}
