/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import java.util.ArrayList;
/**
 *
 * @author Dhea Zalfarani
 */
public class RentArchive {
    static ArrayList <CarRent> rentData = new ArrayList<CarRent>();
    public void Rent(CarRider rider, Car car, int rentDur){
        if(car.isStatus()==true){
        System.out.println("Mobil berhasil disewa");
        car.setStatus(false);
        rentData.add(new CarRent(rider, car, rentDur));
        }else{
        System.out.println("Maaf, mobil sudah disewa");
        }
    }
    public void info(){
    System.out.println("=====================================");
    System.out.println(" DATA RENTAL MOBIL ");
    System.out.println("====================================");
    int no = 1 ;
    for(int i= 0 ; i<rentData.size(); ++i){
    System.out.println("Nama peminjam : " + rentData.get(i).getRider().getName());
    System.out.println("Tipe Mobil : " +  rentData.get(i).getCar().getCarType());
    System.out.println("Nopol Mobil : " + rentData.get(i).getCar().getPolNum());
    System.out.println("Lama Peminjaman : " + rentData.get(i).getRentDur());
    System.out.println("");
    }
    }
}
