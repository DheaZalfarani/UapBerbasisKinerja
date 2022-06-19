/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo08_dheazalfarani_exceeptionhandling;

/**
 *
 * @author Dhea Zalfarani
 */
public class Warrior extends Character {
    public Warrior() {
        setHP(80);
        setAttack(25);
        setDefense(30);
    }
    //method booelean attack
    @Override
    public boolean attack() {
        int rand = (int) (Math.random() * 100) + 1;
        if (rand <= 60) {
            return true;
        } else {
            return false;
        }
    }
    //method void info
    @Override
    public void info() {
        super.info();
        System.out.println("Role\t= Warrior");
        System.out.println("HP\t= " + getHP());
        System.out.println("Attack\t= " + getAttack());
        System.out.println("Defense\t= " + getDefense());
    }
}