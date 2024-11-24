/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematikafahmi;

/**
 *
 * @author myxps
 */
import java.util.Scanner;

// Kelas MatematikaFahmicanggihberaksi untuk menjalankan program dengan interaksi pengguna
public class MatematikaFahmicanggihberaksi {
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);

        MatematikaFahmiCanggih mtk = new MatematikaFahmiCanggih(0, 0, 0);

        mtk.pilihan();

  
        System.out.print("Masukkan Pilihan anda : ");
        mtk.pilihan = input.nextInt();


        System.out.print("Masukkan angka pertama : ");
        mtk.angka1 = input.nextInt();


        System.out.print("Masukkan angka kedua : ");
        mtk.angka2 = input.nextInt();


        mtk.getpilihan();


        input.close();
    }
}