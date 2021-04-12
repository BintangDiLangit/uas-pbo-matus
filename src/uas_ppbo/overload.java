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
public class overload {

    public void admin(String username, int password) {
        System.out.println("username = " + username + ", password = " + password);
    }

    public void admin(String username, String password) {
        System.out.println("username = " + username + ", password = " + password);
    }
}

class MainOverloading {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        overload O = new overload();
        O.admin("matus", 123);
        O.admin("halimah", "321");
    }

}
