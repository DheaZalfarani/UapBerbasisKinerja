import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int menu = sc.nextInt();
    if(menu == 1){
        double sisi = sc.nextDouble();
        System.out.println(persegi(sisi));
    }else if(menu == 2){
        double alas = sc.nextDouble();
        double tinggi = sc.nextDouble();
        System.out.println(segitiga(alas, tinggi));
    }else if(menu == 3){
        double jariJ  = sc.nextDouble();
        if(jariJ%7 == 0){
            System.out.println(lingkaran(jariJ));
        }else{
            System.out.println(lingkaran2(jariJ));
        }
    }else System.out.println("Input yang anda masukan tidak sesuai");
    }
    static int persegi(double sisi){
        int luasP = (int)(sisi*sisi);
        return luasP;
    }
    static int segitiga(double alas, double tinggi){
        int luasS = (int)((alas*tinggi)/2);
        return luasS;
    }
    static double lingkaran(double jariJ){
        double luasL = 22/7*jariJ*jariJ;
        return luasL;
    }
    static double lingkaran2(double jariJ){
        double luasL = 3.14*jariJ*jariJ;
        int luasLC = (int) luasL;
        return luasLC;
    }
}