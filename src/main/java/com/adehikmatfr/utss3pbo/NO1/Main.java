/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.adehikmatfr.utss3pbo.NO1;

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
        Mahasiswa m = new Mahasiswa(123, "Ade", "083232653452", "321", "Indonesia");
        System.out.println("Mahasiswa");
        m.printData();
        MahasiswaInter mi = new MahasiswaInter(1234, "Kencaju", "083232653490", "123", "Japan");
        System.out.println("Mahasiswa Intern");
        mi.printData();
    }

}
