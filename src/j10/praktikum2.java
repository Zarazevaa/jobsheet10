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
public class praktikum2 {
    public static void main(String[] args) {
        int [] bil = new int[6];
        
        Scanner baca = new Scanner(System.in);
        
        for (int x = 0; x < 6; x++)
        {
            System.out.println("Masukkan bilangan ke- " + (x + 1) + ": ");
             bil[x] = baca.nextInt();
        }
        
        System.out.println("Bilangan ganjil: ");
        for (int i = 0; i < 6; i++)
        {
            if (bil[i] % 2 == 1)
            { 
                System.out.println(bil[i]);   
            }
        }
        
        System.out.println("Bilangan ganjil: ");
        for (int y = 0; y <6; y++)
        {
            if (bil[y] % 2 == 0)
            {
                System.out.println(bil[y]);
            }
        }
    }
}
