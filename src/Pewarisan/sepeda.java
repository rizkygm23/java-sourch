/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pewarisan;

/**
 *
 * @author HP
 */
    class sepeda {
    int kecepatan = 0;
    int gir = 0;
//    method
    void ubahGir(int pertambahanGir){
        gir = gir + pertambahanGir;
        System.out.println("GIR =" +gir);
    }
    void tambahKecepatan(int pertambahanKecepatan){
        kecepatan = kecepatan + pertambahanKecepatan;
        System.out.println("Kecepatan =" +kecepatan);
    }
 
    
}
