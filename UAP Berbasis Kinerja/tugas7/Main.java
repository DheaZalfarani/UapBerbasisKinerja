/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas7;

/**
 *
 * @author Dhea Zalfarani
 */
public class Main {

    public static void main(String[] args) {

            PegawaiTetap pegawai1 = new PegawaiTetap("Dhea Zalfarani Syah Munir Putri", "3574034210030005", 9000000);
            PegawaiTetap pegawai2 = new PegawaiTetap("Aditya Bayu Pratama", "350728490327424092342", 2000000);
            PegawaiTetap pegawai3 = new PegawaiTetap("Clara Claire","350256985455759870005", 6000000);
            System.out.println(pegawai1.toString());
            System.out.println(pegawai2.toString());
            System.out.println(pegawai3.toString());

            PegawaiHarian pegawaiharian1 = new PegawaiHarian("Aldo", "3253456982364125711112", 7400, 40);
            PegawaiHarian pegawaiharian2 = new PegawaiHarian("Sabrina", "3545698214632579564133", 9000, 45);
            PegawaiHarian pegawaiharian3 = new PegawaiHarian("Wlidan", "3501452456245638871114", 5000, 30);
            System.out.println(pegawaiharian1.toString());
            System.out.println(pegawaiharian2.toString());
            System.out.println(pegawaiharian3.toString());

            Sales sales1 = new
                    Sales("Melinda", "3554654532654543546515", 50, 50000);
            Sales sales2 = new
                    Sales("Zaki", "3456999875213520169855", 45, 60000);
            Sales sales3 = new
                    Sales("Fina", "3754154542156545146546", 90, 50000);
            System.out.println(sales1.toString());
            System.out.println(sales2.toString());
            System.out.println(sales3.toString());
        }
    }

