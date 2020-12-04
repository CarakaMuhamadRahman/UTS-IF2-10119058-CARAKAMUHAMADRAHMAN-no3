/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if2.pkg10119058.carakamuhamadrahman.no3;

/**
 *
 * @author
 * NAMA     : Caraka Muhamad Rahman
 * KELAS    : PBOIF2
 * NIM      : 10119058
 * Deskripsi Program : Program ini berisi program untuk menampilkan Nama-nama
 *                     musisi beserta genre nya.
 */
public class UTSIF210119058CARAKAMUHAMADRAHMANNo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       RnB rnb = new RnB();
       rnb.setArtistName("Jimmy Hendrik");
       System.out.println("" + rnb.getArtistName() + " adalah musisi Blues");
       
       Folk folk = new Folk();
       folk.setArtistName("Bob Dylan");
       System.out.println("" + folk.getArtistName() + " adalah musisi Folk");
       
       Rockabilly rockabilly = new Rockabilly();
       rockabilly.setArtistName("Elvis Presley");
       System.out.println("" + rockabilly.getArtistName() + " adalah musisi Rockabilly");
    }
    
}
