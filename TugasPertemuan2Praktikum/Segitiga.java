/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan2Praktikum;

/**
 *
 * @author rizky
 */
public class Segitiga {
    double alas = 6;
    double tinggi = 8;
    double sisi;

    public void hitungLuas() {
        double luas = 0.5 * alas * tinggi;
        System.out.println("Luas Segitiga : " + luas);
    }

    void hitungSisiKeliling(){
    sisi = (alas*alas) + (tinggi*tinggi);
    int akar =0;
    while (akar * akar< sisi){
        ++akar;
    }
    System.out.println("Sisi Kemiringan : " + akar);
    double keliling = alas + tinggi + akar;
    System.out.println("Keliling : " + keliling);
    }

}