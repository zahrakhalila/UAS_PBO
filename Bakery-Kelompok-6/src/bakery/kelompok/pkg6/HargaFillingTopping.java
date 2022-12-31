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
public class HargaFillingTopping {
         String[][] HargaFillingTopping = {
            {"F01","Keju","250","31000"},
            {"F02","Coklat","500","29000"},
            {"F03","Krim Vanilla","500","30000"},
            {"F04","Selai Red Bean","500","25000"},
            {"F05","Sosis","1000","80000"},
            {"F06","Smoked Beef","1000","90000"},
            {"F07","Bawang Bombay","500","40000"}
        };    
    public double hargaFillingTopping(String kodeBahan,String berat){
        double harga=0;     
        for (int i=0; i < HargaFillingTopping .length; i++) {
            if (kodeBahan==HargaFillingTopping [i][0]){
               harga=Double.valueOf(berat)/Double.valueOf(HargaFillingTopping [i][2])*Double.valueOf(HargaFillingTopping [i][3]);           
            }
        }   
        return harga;
    }          
                
}
