/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;
public class UjiBus3 {

    
    public static void main(String[] args) {
        
        Bus3 Bus = new Bus3(50);//objek
        
        Bus.cetakpenumpang();
        System.out.println("------------------------");
        
        Bus.getpenumpang(0);//input passwword
        //penambahan penumpang
        Bus.addpenumpang(15);//tambah 2 penumpang
        Bus.cetakpenumpang();
        System.out.println("------------------------");
        
        Bus.getpenumpang(0);//input passwword
        //penambahan penumpang
        Bus.addpenumpang(9);//tambah 1 penumpang
        Bus.cetakpenumpang();
        System.out.println("------------------------");
        
        Bus.getpenumpang(0);//input passwword
        //penambahan penumpang
        Bus.addpenumpang(11);//tambah 2 penumpang
        Bus.cetakpenumpang();
        System.out.println("------------------------");
        
        Bus.getpenumpang(0);//input passwword
        //penambahan penumpang
        Bus.addpenumpang(5);//tambah 1 penumpang
        Bus.cetakpenumpang();
        System.out.println("------------------------");
        
        System.out.println("Rata-rata penumpang : "+Bus.getAverage());
    }
    
}