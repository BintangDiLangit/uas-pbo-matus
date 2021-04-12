/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas_ppbo;

/**
 *
 * @author nurul aini
 */
public class BangunDatar {

    float luas() {
        System.out.println("Menghitung luas bangun datar");
        return 0;
    }

    float keliling() {
        System.out.println("Menghitung keliling bangun datar");
        return 0;
    }
}

class Persegi extends BangunDatar {

    int sisi;

    public Persegi(int sisi) {
        this.sisi = sisi;
    }

    @Override
    public float luas() {
        return this.sisi * this.sisi;
    }

    @Override
    public float keliling() {
        return this.sisi * 4;
    }
}

class Segitiga extends BangunDatar {

    int alas;
    int tinggi;

    public Segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public float luas() {
        return this.alas * this.tinggi;
    }
}

class Lingkaran extends BangunDatar {

    int r;

    public Lingkaran(int r) {
        this.r = r;
    }

    @Override
    public float luas() {
        return (float) (Math.PI * r * r);
    }

    @Override
    public float keliling() {
        return (float) (2 * Math.PI * r);
    }

}
