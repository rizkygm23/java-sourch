/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aCRUD;
import java.awt.desktop.PrintFilesEvent;
import java.io.*;
import java.util.*;

/**
 *
 * @author HP
 */
public class crud1 {
    public static void main(String[] args) throws IOException {
        Scanner userOption = new Scanner(System.in);
        String PilihanUser;      
        boolean isLanjutkan = true;
        clearScreen();
        
        while(isLanjutkan){
           
            System.out.println(" MENU UTAMA PERPUSTAKAAN\n");
            System.out.println("1.\tLihat Seluruh Buku");
            System.out.println("1.\tCari data buku");
            System.out.println("1.\tTambah Data Buku");
            System.out.println("1.\tHapus data buku");
            System.out.println("\n\n Pilihan Anda : ");
            PilihanUser = userOption.next();
                switch (PilihanUser) {
                    case "1":
                        System.out.println("===========");
                        System.out.println("LIST BUKU");
                        System.out.println("===========");
                        TampilkanData();
                        break;
                    case "2":
                        System.out.println("===========");
                        System.out.println("CARI BUKU");
                        System.out.println("===========");
                        break;
                    case "3":
                        System.out.println("===========");
                        System.out.println("TAMBAH BUKU");
                        System.out.println("===========");
                        break;
                    case "4":
                        System.out.println("===========");
                        System.out.println("HAPUS BUKU");
                        System.out.println("===========");
                        break;

                    default: 
                    System.err.println("Pilihan tidak valid");
            }
            
            
            
            isLanjutkan = getYes("Apakah mau melanjutkan ? (y/n)");
        }
        
        
        
    }
private static void TampilkanData()throws IOException {
    FileReader fileInput;
    BufferedReader bufferInput;
    FileWriter  fileTulis;
    
    try {
        
        fileInput = new FileReader("data.txt");
        bufferInput = new BufferedReader(fileInput);
    } catch ( Exception e){
        System.err.println("Ga kebaca");
        return;
    }
    String data = bufferInput.readLine();
    int nomorData = 0;
    
    System.out.printf("|\t\t%2s|\t\t%-20s|\t\t%-20s|\t\t%-20s|\t\t%-20s \n","No", "nama" , "Tahun" , "Penerbit" , "Judul buku" );
    System.out.println("_----------------------------------------------------------------------------------------------------------------------------------------");
while (data != null) {
    nomorData++;
    StringTokenizer stringToken = new StringTokenizer(data, ",");
    stringToken.nextToken();
    System.out.printf("|\t\t%2d", nomorData);
    System.out.printf("|\t\t%-20s", stringToken.nextToken());
    System.out.printf("|\t\t%-20s", stringToken.nextToken());
    System.out.printf("|\t\t%-20s", stringToken.nextToken());
    System.out.printf("|\t\t%-20s \n", stringToken.nextToken());
    data = bufferInput.readLine();
}
    System.out.println("_----------------------------------------------------------------------------------------------------------------------------------------");

    
    
    
    
    
    
    
    boolean isTambah = getYes("Apakah mau ada perintah lagi ? ?");
    
   
}
private static boolean getYes(String message) {
    System.out.println(message);
    Scanner userOption = new Scanner(System.in);
    String YesNo;
    YesNo= userOption.next();
    
    while(!YesNo.equalsIgnoreCase("y")&&!YesNo.equalsIgnoreCase("n")) {
        System.out.println(message);
        YesNo= userOption.next();
    }
    
    return YesNo.equalsIgnoreCase("y");
    
}
private static void clearScreen() {
    try {
        if (System.getProperty("os.name").contains("Windows")) {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } else {
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    } catch (Exception ex) {
        System.err.println("Tidak dapat membersihkan layar: " + ex.getMessage());
    }
}
        

    }

 
