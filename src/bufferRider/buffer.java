/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bufferRider;
import java.io.*;


/**
 *
 * @author HP
 */
public class buffer {
    public static void main(String[]args) throws Exception {
        InputStreamReader keyreader = new  InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(keyreader);
        String kata1, kata2;
        System.out.print("Maasukan kata pertama =");
        kata1 = input.readLine();
        System.out.print("masukan kata ke dua = ");
        kata2 = input.readLine();
        System.out.println("\nHasil input String" + kata1 + "+" + kata2);
                
        
        
    }
    
}
