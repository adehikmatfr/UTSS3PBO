/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.adehikmatfr.utss3pbo.NO2;

/**
 *
 * @author Administrator
 */
public class Nilai {

    private double quis;
    private double uts;
    private double uas;

    public Nilai() {
    }

    public void setQuis(double quis) {
        this.quis = quis;
    }

    public void setUts(double uts) {
        this.uts = uts;
    }

    public void setUas(double uas) {
        this.uas = uas;
    }

    public double getNilaiAkhir() {
        return (20 * this.quis / 100) + (30 * this.uts / 100) + (50 * this.uas / 100);
    }

    public String getIndex() {
        double na = this.getNilaiAkhir();
        if (na >= 0 && na <= 45) {
            return "E";
        } else if (na <= 56) {
            return "D";
        } else if (na <= 68) {
            return "C";
        } else if (na <= 80) {
            return "B";
        } else if (na <= 100) {
            return "A";
        } else {
            return "Invalid Nilai";
        }
    }

    public String getKeterangan() {
        String idx = this.getIndex();
        return switch (idx) {
            case "A" ->
                "Sangat Baik";
            case "B" ->
                "Baik";
            case "C" ->
                "Cukup";
            case "D" ->
                "Kurang";
            case "E" ->
                "Sangat Kurang";
            default ->
                "Invalid Index";
        };
    }
}
