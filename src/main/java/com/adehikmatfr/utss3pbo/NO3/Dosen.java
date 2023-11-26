/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.adehikmatfr.utss3pbo.NO3;

/**
 *
 * @author Administrator
 */
public abstract class Dosen implements DosenMethod {

    protected String nama;
    protected String pelajaran;
    protected String kodeDosen;

    public Dosen(String nama, String pelajaran, String kodeDosen) {
        this.nama = nama;
        this.pelajaran = pelajaran;
        this.kodeDosen = kodeDosen;
    }

    @Override
    public void detail() {
        System.out.println("===DOSEN===");
        System.out.println("Nama : " + this.nama);
        System.out.println("Pelajaran : " + this.pelajaran);
        System.out.println("Kode Dosen : " + this.kodeDosen);
        System.out.println("===========");
    }

}
