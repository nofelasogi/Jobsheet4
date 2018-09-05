/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manusia;

import java.util.Scanner;

/**
 *
 * @author 
 */
public class Main 
{
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukan Tinggi badan Anda : ");
        double tinggi = masukan.nextDouble();
        System.out.print("Masukan Jenis kelamin L/P: ");
        String jk = masukan.next();
        switch (jk) {
            case "L":
                Laki_Laki lk = new Laki_Laki(tinggi);
                  lk.tampilHtgBBI();
                break;
            case "P":
              Perempuan p = new Perempuan(tinggi);
                p.tampilHtgBBI();
        }

    }

}
