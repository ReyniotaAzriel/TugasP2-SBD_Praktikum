/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan2Praktikum;

/**
 *
 * @author rizky
 */
public class Main {
    public static void main(String[] args) {
        Increment no1 = new Increment();
        no1.hitungIncrement();
        System.out.println("");
        PersegiPanjang no2 = new PersegiPanjang();
        no2.hitungLuas();
        System.out.println("");
        PersamaanKuadrat no3 = new PersamaanKuadrat();
        no3.hitungKuadrat();
        System.out.println("");
        OperasiMatematika no4 = new OperasiMatematika();
        no4.hitungOp();
        System.out.println("");
        Segitiga no5 = new Segitiga();
        Segitiga no6 = new Segitiga();
        no5.hitungLuas();
        System.out.println("");
        no6.hitungSisiKeliling();
        System.out.println("");
        KonversiString no7 = new KonversiString();
        no7.ubahString();
        System.out.println("");
        KecepatanCahaya no8 = new KecepatanCahaya();
        no8.hitungWaktu();
        System.out.println("");
        KonversiSuhu no9 = new KonversiSuhu();
        no9.tampilkanHasilKonversi();
        
        
        
    }
}
