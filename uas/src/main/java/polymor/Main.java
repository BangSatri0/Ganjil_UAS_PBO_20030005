/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymor;
import java.util.Scanner;
/**
 *
 * @author uknow
 */
public class Main {
    public static void main(String[]args){
        //membuat scanner baru
        Scanner input = new Scanner(System.in);
        
        //membuat objek kubus dan input nilai sisi
        BangunRuang bangunruang = new BangunRuang();
        Kubus kubus = new Kubus();
        System.out.println("Masukkan nilai sisi: ");
        kubus.sisi=input.nextInt();
        kubus.poly();
        
        //memanggil method luas dan volume
        bangunruang.luas();
        bangunruang.volume();

        //tampilan output
        System.out.println("dik : sisi = " + kubus.sisi);
        System.out.println("dit : ");
        System.out.println("luas bujursangkar");
        System.out.println("volume kubus");
        System.out.println("penyelesaian :");
        System.out.println("luas bujursangkar = sisi x sisi");
        System.out.println("= " + kubus.sisi + " x " + kubus.sisi);
        System.out.println("= " + kubus.luas() + " cm");
        System.out.println("volume kubus = sisi x sisi x sisi");
        System.out.println("= " + kubus.sisi + " x " + kubus.sisi + " x " + kubus.sisi);
        System.out.println("= " + kubus.volume() + " cm");
    }
}
