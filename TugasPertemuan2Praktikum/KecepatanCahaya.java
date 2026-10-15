/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan2Praktikum;

/**
 *
 * @author rizky
 */
public class KecepatanCahaya {
    double jarakBulan = 384400;
    double jarakMatahari = 152100000;
    double kecepatanCahaya = 300000;

    public void hitungWaktu() {
        double waktuBulan = jarakBulan / kecepatanCahaya;
        double waktuMatahari = jarakMatahari / kecepatanCahaya;

        System.out.println("Waktu tempuh ke Bulan : " + waktuBulan + " detik");
        System.out.println("Waktu tempuh ke Matahari : " + waktuMatahari + " detik");
    }
}