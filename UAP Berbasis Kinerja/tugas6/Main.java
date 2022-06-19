/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas06;

/**
 *
 * @author Dhea Zalfarani
 */
public class Main {
    static Manusia manusia[] ;
    static MahasiswaFilkom mahasiswa[];
    static Pekerja pekerja[];
    static Manager manager[];
    public static void main(String[] args) {
    //Class Manusia
    manusia = new Manusia[1];
    System.out.println(" Class Manusia ");
    System.out.println("=================================================");
    Manusia man1 = new Manusia("Aku", "3923842934", true, true);
    System.out.println(man1.toString());


    //Class MahasiswaFilkom
    mahasiswa = new MahasiswaFilkom[1];
    System.out.println("Class Mahasiswa");
    System.out.println("=================================================");
    mahasiswa[0] = new MahasiswaFilkom("205150601111018", 3.7, "I Putu Yoga","351923848239",false,true);
    System.out.println(mahasiswa[0].toString());

    //Class Pekerja
    pekerja = new Pekerja[1];
    System.out.println(" Class Pekerja ");
    System.out.println("=================================================");
    pekerja[0] = new Pekerja(9, 28, "351717969","Iqbal Biondy","351717969",true,true);
    
    System.out.println(pekerja[0].toString());

    //Class Manager
    manager = new Manager[1];
    System.out.println(" Class Manager ");
    System.out.println("=================================================");
    manager[0] = new Manager(1000, 6, 30, "351707384392","Lyra Hertini","351707384392",false,true);
    
    System.out.println(manager[0].toString());
    
    //Jumlah
    System.out.println(" Total Keseluruhan yang Terdaftar ");
    System.out.println("=================================================");
    System.out.println("Jumlah Manusia : " + manusia.length);
    System.out.println("Jumlah Mahasiswa : " + mahasiswa.length);
    System.out.println("Jumlah Pekerja : " + pekerja.length);
    System.out.println("Jumlah Manager : " + manager.length);
    }
}