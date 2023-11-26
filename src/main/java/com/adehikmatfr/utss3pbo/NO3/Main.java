/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.adehikmatfr.utss3pbo.NO3;

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
        DosenBiasa db = new DosenBiasa("Dosen Biasa", "PBO", "001");
        db.detail();
        DosenLuarBiasa dlb = new DosenLuarBiasa("Dosen Luar Biasa", "PBO1", "002");
        dlb.detail();
    }

}
