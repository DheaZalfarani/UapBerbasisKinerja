import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int saldoR = sc.nextInt();
        int setoranB = sc.nextInt();
        saldoN(saldoR,setoranB);
    }
    static void saldoN(int saldoR, int setoranB){
      int jumlah = saldoR + setoranB - 7000;
      double bonus = 0.05/100*jumlah;
      double jumlah2 = jumlah+bonus;
      System.out.println(jumlah2);
    }
}