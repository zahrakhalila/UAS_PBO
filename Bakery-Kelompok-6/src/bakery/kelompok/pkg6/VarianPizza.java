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
public class VarianPizza {
    public static HargaFillingTopping hf = new HargaFillingTopping();  
    public double[] JumlahBahan={0,0,0,0,0,0,0};

    
        // deklarasi array //
    String[][] FillingToppingVarian1 = {
        {"F01","Keju","Topping","30"},
        {"F05","Sosis","Topping","50"},
        {"F06","Smoked Beef","Topping","50"},
        {"F07","Bawang Bombay","Topping","30"}
    };
    
    public double hargaModalPizzaVarian1(){      
        double harga=0;
        for (int i=0; i < FillingToppingVarian1.length; i++) {
            harga+=hf.hargaFillingTopping(FillingToppingVarian1[i][0],FillingToppingVarian1[i][3]);
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
}
