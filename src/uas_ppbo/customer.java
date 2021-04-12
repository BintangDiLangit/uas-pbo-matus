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
public class customer {
//enkapsulasi

    private int id;
    private String nama; //instace variable
    private String gender;
    private String alamat;
    private String no_hp;

    //Constructor
    public customer(int id, String nama, String gender, String alamat, String no_hp) {
        this.id = id;
        this.nama = nama;
        this.gender = gender;
        this.alamat = alamat;
        this.no_hp = no_hp;
    }

    // deklarasi method
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNo_hp() {
        return no_hp;
    }

    public void setNo_hp(String no_hp) {
        this.no_hp = no_hp;
    }

 
}

class Main {

    public static void main(String[] args) {
//membuat object 
        customer one = new customer(1, "    matus", "       P", "       madura", "   082341788909");//reference variable adalah 
        customer two = new customer(2, "    rudi", "        L", "       malang", "   083829937756");
        customer three = new customer(3, "    dewi", "        P", "       kediri", "   089568887656");

        System.out.println("=============DATA CUSTOMER=============");
        System.out.println("ID || NAMA || GENDER ||  ALAMAT || NO_HP");
        //membuat akses
        System.out.println(one.getId() + one.getNama() + one.getGender() + one.getAlamat() + one.getNo_hp());
        System.out.println(two.getId() + two.getNama() + two.getGender() + two.getAlamat() + two.getNo_hp());
        System.out.println(three.getId() + three.getNama() + three.getGender() + three.getAlamat() + three.getNo_hp());

    }
}
