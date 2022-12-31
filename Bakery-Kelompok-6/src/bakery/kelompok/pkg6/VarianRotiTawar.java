/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bakery.kelompok.pkg6;

import static bakery.kelompok.pkg6.VarianRotiManis.hf;

/**
 *
 * @author User
 */
public class VarianRotiTawar {
    public static HargaFillingTopping hf = new HargaFillingTopping(); 
    public double[] JumlahBahan={0,0,0,0,0,0,0};
    

        // deklarasi array //
    String[][] FillingToppingVarian1 = {
        {"F02","Coklat","Filling","80"}
    };    
 
        // deklarasi array //
    String[][] FillingToppingVarian2 = {
        {"F01","Keju","Filling","80"}
    };      
    
    
    public double hargaModalRotiTawarVarian1(){      
        double harga=0;
        for (int i=0; i < FillingToppingVarian1.length; i++) {
            harga+=hf.hargaFillingTopping(FillingToppingVarian1[i][0],FillingToppingVarian1[i][3]);
        }   
        return harga;     
    }    

    public double hargaModalRotiTawarVarian2(){      
        double harga=0;
        for (int i=0; i < FillingToppingVarian2.length; i++) {
            harga+=hf.hargaFillingTopping(FillingToppingVarian2[i][0],FillingToppingVarian2[i][3]);
        }   
        return harga;     
    }     
    public double[] hitungJumlahBahanVarian1(double order){
        for (int i=0; i < FillingToppingVarian1.length; i++) {
            int j=Integer.valueOf(FillingToppingVarian1[i][0].substring(2, 3))-1;
            JumlahBahan[j]+=Integer.valueOf(FillingToppingVarian1[i][3])*order;
        }         
        return JumlahBahan;
    }      
    public double[] hitungJumlahBahanVarian2(double order){
        for (int i=0; i < FillingToppingVarian2.length; i++) {
            int j=Integer.valueOf(FillingToppingVarian2[i][0].substring(2, 3))-1;
            JumlahBahan[j]+=Integer.valueOf(FillingToppingVarian2[i][3])*order;
        }         
        return JumlahBahan;        
    }
}
