/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inherit;

/**
 *
 * @author uknow
 */
public class kubus extends BangunRuang {

    float sisi;
    float luas(){
        float luas = sisi * sisi;        
        return luas;
    }
    float volume(){
        float volume = sisi * sisi * sisi;
        return volume;
    }
}
