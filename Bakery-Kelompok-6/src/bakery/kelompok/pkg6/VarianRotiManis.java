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
public class VarianRotiManis {
    public static HargaFillingTopping hf = new HargaFillingTopping(); 
    public double[] JumlahBahan={0,0,0,0,0,0,0};
    

    String[][] FillingToppingVarian1 = {
        {"F01","Keju","Filling","5"},
        {"F02","Coklat","Filling","5"},
        {"F02","Coklat","Topping","5"}
    };

    String[][] FillingToppingVarian2 = {
        {"F03","Krim Vanila","Topping","5"},
        {"F04","Selai Red Bean","Filling","10"}
    };

    String[][] FillingToppingVarian3 = {
        {"F01","Keju","Filling","10"},
        {"F05","Sosis","Filling","10"}
    };    
    
    
    public double hargaModalRotiManisVarian1(){      
        double harga=0;
        for (int i=0; i < FillingToppingVarian1.length; i++) {
            harga+=hf.hargaFillingTopping(FillingToppingVarian1[i][0],FillingToppingVarian1[i][3]);
        }   
        return harga;     
    }    

    public double hargaModalRotiManisVarian2(){      
        double harga=0;
        for (int i=0; i < FillingToppingVarian2.length; i++) {
            harga+=hf.hargaFillingTopping(FillingToppingVarian2[i][0],FillingToppingVarian2[i][3]);
        }   
        return harga;     
    }        
    public double hargaModalRotiManisVarian3(){      
        double harga=0;
        for (int i=0; i < FillingToppingVarian3.length; i++) {
            harga+=hf.hargaFillingTopping(FillingToppingVarian3[i][0],FillingToppingVarian3[i][3]);
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
    
    public double[] hitungJumlahBahanVarian3(double order){
         for (int i=0; i < FillingToppingVarian3.length; i++) {
            int j=Integer.valueOf(FillingToppingVarian3[i][0].substring(2, 3))-1;
            JumlahBahan[j]+=Integer.valueOf(FillingToppingVarian3[i][3])*order;
        }         
        return JumlahBahan;       
    }
    
}
