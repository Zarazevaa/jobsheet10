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
public class contoh3 {
    public static void main(String[] args) {
        
       double total = 0;
       double max;
       double min;
       
          Scanner baca = new Scanner(System.in);
        double[] bilangan = new double[5];
        
        for (int x = 0; x < 5; x++) {
            System.out.print("masukkan angka ke-" + (x + 1) + ": " );
            bilangan[x] = baca.nextDouble();
        }
        
        for (int i = 0; i < bilangan.length; i++) {
            total += bilangan[i];
        }
        
        System.out.println("rata-rata: " + total / bilangan.length);
        
        max = bilangan[0];
        for (int i = 1; i < bilangan.length; i++) {
            if(bilangan[i]>max)
            {
                max = bilangan[i];
            }
            
        }
        
        System.out.println("Nilai terbesar: " + max);
               
        
         min = bilangan[0];
        for (int i = 1; i < bilangan.length; i++) {
            if(bilangan[i]>min)
            {
                min = bilangan[i];
            }
        
        
    }
        System.out.println("Nilai terkecil: " + min);
    }
}

