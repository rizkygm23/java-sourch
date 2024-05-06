/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package switchCase;
import java.util.*;

/**
 *
 * @author HP
 */
public class casesss {
    public static void main(String[]args){
        int id ;
        String matkul ;
        id = 1;
        switch(id){
            case 1:
                matkul = "indo";
                break;
            case 2:
                matkul = "arab";
                break;
            case 3:
                matkul = "jepang";
                break;
            default:
                matkul = "kode salah";
        }
        System.out.println("ini matkul pilihan = " + matkul);
    }
}
