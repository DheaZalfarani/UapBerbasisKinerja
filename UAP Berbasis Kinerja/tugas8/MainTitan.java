/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo08_dheazalfarani_exceeptionhandling;
import java.util.Scanner;
/**
 *
 * @author Dhea Zalfarani
 */
public class MainTitan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int role = 0, count = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("\tSelamat Datang Di Game DEFEND FILKOM \t ");
        System.out.println();
        System.out.print("Silahkan masukkan nama playernya : ");
        String nama = scan.nextLine();
        boolean start = true;
        //looping pilih menu
        while (true) {
            start = true;
            System.out.println("Silahkan pilih karakter yang Anda inginkan : ");
            System.out.print("\t1. Magician" + "\n \t2. Healer" + "\n \t3. Warrior");
            System.out.println();
            try {
            //input karakter
                String roless = scan.nextLine();
                role = Integer.valueOf(roless);
            } //mengidentifikasi error
            catch (Exception e) {
                start = false;
            }
            //identifikasi start dan role yang dipilih
            if (start && role > 0 && role < 4) {
                break;
            } //cek input berupa angka 
            else if (!start) {
                System.out.println("Coba Lagi ya, Masukkan hanya berupa angka saja!!");
            } //cek karakter yg tersedia di pilihan
            else {
                System.out.println("Coba Lagi ya, Pilih karakter yang tersedia aja !!");
            }
        }
        //Instansiasi objek dari titan
        Titan titaan = new Titan();
        Character krakter = null;
        System.out.println("");
        System.out.print("Selamat datang, " + nama);
        System.out.println("");
        switch (role) {
            case 1:
                krakter = new Magician();
                krakter.info();
                break;
            case 2:
                krakter = new Healer();
                ((Healer) krakter).info();
                break;
            case 3:
                krakter = new Warrior();
                ((Warrior) krakter).info();
                break;
            default:
        }
        //perulangan attacknya
        while (titaan.getHP() > 0 && krakter.getHP() > 0) {
            count++;
            System.out.printf("========== TURN %d========= %n", count);
            System.out.println("Enemy's HP\t= " + titaan.getHP());
            System.out.printf("%s's HP \t= %d %n ", nama, krakter.getHP());
            //cek class healer untuk penggunaan method heal
            if (count % 2 == 0 && krakter instanceof Healer) {
               ((Healer) krakter).heal();
            }
            //cek attack
            if (titaan.attack() == true) {
                krakter.receiveDamage(titaan.getAttack());
            }
        }
        //cek gethhp titan & character
        if (titaan.getHP() <= 0) {
            titaan.setHP(0);
        } else if (krakter.getHP() <= 0) {
            krakter.setHP(0);
        }
        String output = titaan.getHP() <= 0 ? nama : "Titan";
        System.out.println("");
        System.out.println("\t" + output + "\tMENANG!!!\n\n");
        System.out.println("==========\tPLAYER\t==========");
        krakter.info();
        System.out.println("\n==========\tMUSUH\t==========");
        titaan.info();
    }
}