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
public class Pegawai {
    private String nama;
    private String noKTP;
    public Pegawai(String nama, String noKTP) {
        this.nama = nama;
        this.noKTP = noKTP;
    }
    public String getNama() {
        return nama;
    }
    public String getNoKTP() {
        return noKTP;
    }
    public double gaji(){
        return 0 ;
    }
    @Override
    public String toString() {
        return "No KTP : " +
                this.noKTP;
    }
}

