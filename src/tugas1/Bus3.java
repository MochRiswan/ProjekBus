/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;
import java.util.Scanner;
/**
 *
 * @author MOKLET-2
 */
public class Bus3 {
    private double penumpang;
    private double maxpenumpang;
    private double counter;
    private double penumpangBaru;
    
    Scanner I = new Scanner(System.in);
    
    //konstruksi kelas Bus3
    public Bus3(double maxpenumpang){
        this.maxpenumpang=maxpenumpang;
        penumpang = 0;
    }
    //Method mutator
    public void addpenumpang(double penumpang){
        double temp;
        temp = this.penumpang+penumpang;
        if (temp > maxpenumpang){
            System.out.println("Penumpang melebihi kuota");
        }else{
            this.penumpang=temp;
            counter++;
        }
    }
    //method untuk mengatur password
    public void getpenumpang(double password){
        System.out.print("Masukkan Password : ");
        password = I.nextDouble();;//input password
        if (password == 24.5){
            System.out.println("Password benar");
        }else{
            System.out.println("Paswsword salah");
        }
    }
    //method untuk menampilkan rata-rata penumpang
    public double getAverage(){
        return penumpang/counter;//rata-rata diperoleh dari jumlah penumpang dibagi jumlah pemberhentian
    }
    //method untuk menamilkan data penumpang
    public void cetakpenumpang(){
        System.out.println("Penumpang bus sekarang adalah "+penumpang);
        System.out.println("Penumpang maksimum seharusnya adalah "+maxpenumpang);
    }
}