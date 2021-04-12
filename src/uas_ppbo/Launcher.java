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
public class Launcher  {
    
   

    public static void main(String[] args) {
        System.out.println("\nSumekar\n=======");
        sumekar s = new sumekar();
        s.nm_kapal();
        s.tgl();
        s.jam();
        s.no_kasur();
        s.harga();

        System.out.println("\nExpress\n=======");
        Express e = new Express();
        e.nm_kapal();
        e.tgl();
        e.jam();
        e.no_kasur();
        e.harga();

        System.out.println("\nHolalo\n=======");
        Holalo h = new Holalo();
        h.nm_kapal();
        h.tgl();
        h.jam();
        h.no_kasur();
        h.harga();
        
        

    }
     public void getpesan(pemesanan a){
        a.harga();
        
    }
    
}
