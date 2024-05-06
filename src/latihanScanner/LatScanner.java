/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanScanner;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;


/**
 *
 * @author HP
 */
public class LatScanner {
    public static void main(String[]args){
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        Scanner input = new Scanner(System.in);
        String nim,nama;
        int absen,tugas,uts,uas;
        Double rata;
        System.out.print("Maasukan NIM : ");
        nim = input.nextLine();
        System.out.print("Maasukan Nama : ");
        nama = input.nextLine();
        System.out.print("Masukan Nilai Absen : ");
        absen = input.nextInt();
        System.out.print("Masukan Nilai Tugas : ");
        tugas = input.nextInt();
        System.out.print("Masukan UTS :");
        uts = input.nextInt();
        System.out.print("Masukan nilai UAS : ");
        uas = input.nextInt();
        
        rata = 0.1*absen + 0.2*tugas + 0.3*uts + 0.4*uas;
        
        System.out.println("\n PROGRAM MAHASISWA");
        System.out.println("-------------------------------------------");
        System.out.println("NIM         : " + nim);
        System.out.println("NAMA        : " + nama);
        System.out.println("Nilai absen : " + absen);
        System.out.println("Nilai uts   : " + uts);
        System.out.println("Nilai uas   : " + uas);
        System.out.println("-------------------------------------------");
        System.out.println("Rata - Rata : " + rata);
        System.out.println(date + "||" + time);
        
        
        
        
        
        
    }
    
}
