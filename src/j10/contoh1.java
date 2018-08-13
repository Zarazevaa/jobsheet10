/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j10;

/**
 *
 * @author ZEVA
 */
public class contoh1 {
    public static void main(String[] args){
        String[] nama = {"Yudhis", "Lantip", "Tutus", "Marsha", "Puput"};
        
        //menampilkan isi ARRAY 
        for (int i = 0; i < 5; i++){
            System.out.println("Siswa ke-" + (i + 1) + " " + nama[i]);
        }            
    }
    
}
