/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
/**
 *
 * @author Dhea Zalfarani
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    CarRider erlina = new
    CarRider("Chimon",24,"081333333333");
    CarRider bagus = new
    CarRider("Tawan",28,"0812222222222");
    CarRider fikri = new
    CarRider("Nonkul",30,"085555555555");
    CarData data = new CarData();
    data.addCar("SUV", "L 1 U","Lamborghini");
    data.addCar("Van","N 1234 D","Toyota");
    data.addCar("MPV","N 3333 AB","Mitsubishi");
    data.addCar("MPV","W 1 TU","Tesla");
    data.addCar("SUV", "P 5555 S","BMW");
    data.listOfCar();
    RentArchive arsip = new RentArchive();
    arsip.Rent(erlina, CarData.carList.get(0), 3);
    arsip.Rent(bagus, CarData.carList.get(4), 2);
    arsip.Rent(fikri, CarData.carList.get(4), 1);
    arsip.Rent(fikri, CarData.carList.get(3), 1);
    arsip.info();
    }
}
