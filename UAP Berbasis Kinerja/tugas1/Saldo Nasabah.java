import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kata = sc.nextLine();
        int nilaiPindah = sc.nextInt();
        sandiSurat(kata,nilaiPindah);
    }
    public static void sandiSurat(String kata, int nilaiPindah){
        String isiSurat = "";
        char tempatKosong;
        int a = 0; 
        while(a < kata.length()){    
        tempatKosong = kata.charAt(a);
        if(tempatKosong >= 'a' && tempatKosong <= 'z'){
            tempatKosong = (char)(tempatKosong+nilaiPindah);
                if(tempatKosong > 'z'){
                    tempatKosong = (char)(tempatKosong - 'z' + 'a' - 1);
                }
            isiSurat = isiSurat + tempatKosong;
        }else if(tempatKosong >= 'A' && tempatKosong <= 'Z'){
            tempatKosong = (char)(tempatKosong + nilaiPindah);   
            if(tempatKosong > 'Z'){
                tempatKosong = (char)(tempatKosong - 'Z' + 'A' - 1);
            }
            isiSurat = isiSurat + tempatKosong;
        }else{
            isiSurat = isiSurat + tempatKosong;
        }++a;
        }System.out.println(isiSurat);
    }
}