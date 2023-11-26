/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.adehikmatfr.utss3pbo.NO1;

/**
 *
 * @author Administrator
 */
public class Mahasiswa {

    protected int nim;
    protected String nama;
    protected String notlp;
    protected String noPaspor;
    protected String kebangsaan;

    public Mahasiswa(int nim, String nama, String notlp, String noPaspor, String kebangsaan) {
        this.nim = nim;
        this.nama = nama;
        this.notlp = notlp;
        this.noPaspor = noPaspor;
        this.kebangsaan = kebangsaan;
    }

    public void printData() {
        System.out.println("Nama: " + this.nama);
        System.out.println("Nim: " + this.nim);
        System.out.println("Notlp: " + this.notlp);
        System.out.println("NoPaspor: " + this.noPaspor);
        System.out.println("Kebangsaan: " + this.kebangsaan);
    }
}
