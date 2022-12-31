/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bakery.kelompok.pkg6;

/**
 *
 * @author User
 */
public class HargaBahan {
         String[][] HargaBahan = {
            {"A01","Tepung Terigu","1000","40000"},
            {"A02","Gula Pasir","1000","25000"},
            {"A03","Butter","500","23000"},
            {"A04","Ragi","11","5000"},
            {"A05","Susu Bubuk","1000","39000"},
            {"A06","Susu Cair","1000","24000"},
            {"A07","Telur","1000","23000"},
            {"A08","Es Batu","1000","2000"}            
        };   
         
    public double hargaBahan(String kodeBahan,String berat){
        double harga=0;     
        for (int i=0; i < HargaBahan.length; i++) {
            if (kodeBahan==HargaBahan[i][0]){
               harga=Double.valueOf(berat)/Double.valueOf(HargaBahan[i][2])*Double.valueOf(HargaBahan[i][3]);           
            }
        }   
        return harga;
    }          
         
}
