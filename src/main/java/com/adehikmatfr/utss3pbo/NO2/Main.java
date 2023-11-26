/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.adehikmatfr.utss3pbo.NO2;

/**
 *
 * @author Administrator
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Nilai n = new Nilai();
        n.setQuis(95);
        n.setUts(70);
        n.setUas(89);
        System.out.println("Nilai Akhir " + n.getNilaiAkhir());
        System.out.println("Index " + n.getIndex());
        System.out.println("Keterangan " + n.getKeterangan());
    }

}
