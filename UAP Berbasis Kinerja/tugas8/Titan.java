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
public class Titan extends Character {
//constructor titan
    public Titan() {
        setHP(200);
        setAttack(45);
    }
    @Override
    public boolean attack() {
        int randomAcak = (int) (Math.random() * 100) + 1;
        if (randomAcak <= 40) {
            return true;
        } else {
            return false;
        }
    }
    // method override void info
    @Override
    public void info() {
        super.info();
        System.out.println("Role\t= Titan");
        System.out.println("HP \t= " + getHP());
        System.out.println("Attack\t= " + getAttack());
        System.out.println("Defense\t= " + getDefense());
    }
}
