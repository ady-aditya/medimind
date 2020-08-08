package com.epmp.medireminder.entity;

import java.util.List;

public class Medicine {

    String name;
    String frequency;
    String doctor;
    List<String> whenToTake;
    String remarks;

    public Medicine(String name, String frequency, String doctor, List<String> whenToTake, String remarks) {
        this.name = name;
        this.frequency = frequency;
        this.doctor = doctor;
        this.whenToTake = whenToTake;
        this.remarks = remarks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public List<String> getWhenToTake() {
        return whenToTake;
    }

    public void setWhenToTake(List<String> whenToTake) {
        this.whenToTake = whenToTake;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
