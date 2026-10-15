/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan2Praktikum;

/**
 *
 * @author rizky
 */
public class KonversiSuhu {
    double C = 10;
    double F = 15;
    double R = 5;

    public void tampilkanHasilKonversi() {
        double cKef = (9.0/5.0*C)+32;
        double fKec = 5.0/9.0* (F- 32);
        System.out.println("Celcius ke Fahrenheit (C = 10) : " + cKef);
        System.out.println("Fahrenheit ke Celcius (F = 15) : " + fKec);

        double cKer = 4.0/5.0 *C;
        double rKec = 5.0 /4.0* R;
        System.out.println("Celcius ke Reamur (C = 10) : " + cKer);
        System.out.println("Reamur ke Celcius (R = 5) : " + rKec);

        double fKer = 4.0/9.0*(F-32);
        double rKef = (9.0 /4.0 *R)+ 32;
        System.out.println("Fahrenheit ke Reamur (F = 15) : " + fKer);
        System.out.println("Reamur ke Fahrenheit (R = 5) : " + rKef);
    }
}