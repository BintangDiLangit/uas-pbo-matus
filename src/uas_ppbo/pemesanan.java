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
abstract class pemesanan {

    Boolean nama;
    Boolean tanggal;
    Boolean jam;
    Boolean nomor;
    Boolean harga;

    void nm_kapal() {

    }

    void tgl() {
        System.out.println("tgl : 1, bln: januari, thn: 2020");
        return;
    }

    void jam() {
        System.out.println("jam : 07:00 -18:00");
    }

    void no_kasur() {

        System.out.println("no_kasur : 1 sampai 5");
    }

    void harga() {

    }

}

class cepat extends pemesanan {

    //override
    void jam() {
        System.out.println("jam : 09:00-13:00");
    }
}

class lambat extends pemesanan {
//override

    void jam() {
        System.out.println("jam : 06:00-20:00");
    }
}

class sumekar extends pemesanan {

    void nm_kapal() {
        System.out.println("nama kapal : Sumekar");

    }

    void harga() {
        System.out.println("harga : 90000");

    }

}

class Express extends cepat {

    void nm_kapal() {
        System.out.println("nama kapal : Express");

    }

    void harga() {
        System.out.println("harga : 200000");

    }

}

class Holalo extends lambat {

    void nm_kapal() {
        System.out.println("nama kapal : Holalo");

    }

    void harga() {
        System.out.println("harga : 15000 ");

    }

}
