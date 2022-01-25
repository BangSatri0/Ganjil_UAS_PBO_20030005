/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymor;

/**
 *
 * @author uknow
 */
public class Kubus extends BangunRuang {
    int sisi;
    public Kubus(){
        this.sisi=sisi;
    }
    public float luas(){
        return this.sisi*this.sisi;
    }
    public float volume(){
        return this.sisi*this.sisi*this.sisi;
    }
    public void poly(){
        System.out.println("Apakah ini polymorphism?");
    }
}
