/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j10;
import java.util.Scanner;
        
/**
 *
 * @author ZEVA
 */
public class contoh2 {
    public static void main(String[] args) {

        Scanner baca = new Scanner(System.in);
        String[] nama = new String[5];
       
        //LOOPING FOR UNTUK INPUT ELEMEN NAMA
        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan nama siswa ke-" + (i + 1) + ": " );
            nama[i] = baca.nextLine();
        }
               System.out.println(""
                       + ""
                       + ""
                       + "");
        
        //LOOPING FOR MENAMPILKAN ELEMEN NAMA
        for (int i = 0; i < 5; i++){
            System.out.println("Siswa ke-" + (i + 1) + " " + nama[i]);
        }            
        }
    }

