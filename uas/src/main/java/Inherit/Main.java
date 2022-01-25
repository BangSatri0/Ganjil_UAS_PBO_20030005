/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inherit;
import java.util.Scanner;
/**
 *
 * @author uknow
 */
public class Main {
    public static void main(String[] args){
        //membuat objek bangun ruang
        BangunRuang bangunruang = new BangunRuang();
        
        //membuat scanner baru
        Scanner keyboard = new Scanner(System.in);
        
        //membuat objek kubus dan input nilai sisi
        kubus Kubus = new kubus();
        System.out.println("Masukkan nilai sisi: ");
        Kubus.sisi=keyboard.nextFloat();
        
        //memanggil method luas dan volume
        bangunruang.luas();
        bangunruang.volume();
        
        Kubus.luas();
        Kubus.volume();
        
        System.out.println("dik : sisi = " + Kubus.sisi);
        System.out.println("dit : ");
        System.out.println("luas bujursangkar");
        System.out.println("volume kubus");
        System.out.println("penyelesaian :");
        System.out.println("luas bujursangkar = sisi x sisi");
        System.out.println("= " + Kubus.sisi + " x " + Kubus.sisi);
        System.out.println("= " + Kubus.luas() + " cm");
        System.out.println("volume kubus = sisi x sisi x sisi");
        System.out.println("= " + Kubus.sisi + " x " + Kubus.sisi + " x " + Kubus.sisi);
        System.out.println("= " + Kubus.volume() + " cm");
    }
}
