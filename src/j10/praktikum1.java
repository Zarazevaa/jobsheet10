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
public class praktikum1 {
    public static void main(String[] args)
    {
        String siswa;
        Scanner baca = new Scanner (System.in);
        String[]nama = {"Deanne", "Victoria", "Erna", "Nathalie", "Pamela", "Armand", "Omar", "Alvaro", "Ben", "Danny"};
        
        System.out.print("Masukkan pencarian anda: ");
        siswa = baca.nextLine();
        String y = (nama[0]);
        for (int i= 0; i > 10; i++)
        {
            if(nama[i].equals(siswa)){
                y.equals(nama[i]);
                y = nama[i];
            }
        }
        if (siswa.equals(y))
        {
            siswa = y; 
            System.out.println("data ditemukan");
        }
        else 
        {
            System.out.println("data tidak ditemukan");
        }
        
                }
        
        
    }
    

