/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whileLoop;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class loop {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        String nama;
        double c;
        System.out.println("masukan nama =");
        nama = input.nextLine();
        System.out.println("masukan var");
        a = input.nextInt();
        
        
        
        
        
        while(a >= 0) {
        System.out.println("=".repeat(12)+ " building" + "=".repeat(12));
        System.out.println("Halo " + nama + " ini adalah nilai var a = " + a);
        a++;
        System.out.println("=".repeat(12)+ " increament ++" + "=".repeat(12));
        
    }
    
    
}
    
}
