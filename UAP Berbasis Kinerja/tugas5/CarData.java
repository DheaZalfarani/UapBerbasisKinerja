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
public class CarData {
static ArrayList <Car> carList = new ArrayList<Car>();
    public void addCar(String carType, String polNum, String merk){
        carList.add(new Car(carType, polNum, merk, true) );
    }
 
    public void listOfCar(){
        System.out.println("=====================================");
        System.out.println(" DAFTAR MOBIL ");
        System.out.println("====================================");
        for(Car urutan : carList){
        System.out.println("TIPE MOBIL : " + urutan.getCarType());
        System.out.println("NO. POLISI : " + urutan.getPolNum());
        System.out.println("MERK MOBIL : " + urutan.getMerk());
        System.out.println("");
        }
    System.out.println("");
    }
}
