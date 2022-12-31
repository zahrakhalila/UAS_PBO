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
public class AdonanPizza {
    public static HargaBahan hb = new HargaBahan();   
    public double beratAdonanPerPcs = 190;   
    public double[] IndekBahan={0,0,0,0,0,0,0,0};
    public double[] JumlahBahan={0,0,0,0,0,0,0,0};

    // deklarasi array //
    String[][] KomposisiPizza = {
        {"A01","Tepung Terigu","1000"},
        {"A02","Gula Pasir","100"},
        {"A03","Butter","100"},
        {"A04","Ragi","20"},
        {"A05","Susu Bubuk","200"},
        {"A06","Susu Cair","180"},
        {"A07","Telur","50"},
        {"A08","Es Batu","300"}            
    };
    
    
    public double hitungTotalBerat(){
        double berat=0;
        for (int i=0; i < KomposisiPizza.length; i++) {
            berat+=Integer.valueOf(KomposisiPizza[i][2]);
        }      
        //** Hitung harga : E11
        return berat;
    }           

    public double hitungTotalHarga(){      
        double harga=0;
        for (int i=0; i < KomposisiPizza.length; i++) {
            harga+=hb.hargaBahan(KomposisiPizza[i][0],KomposisiPizza[i][2]);
        }   
        //** Hitung harga : J11        
        return harga;     
    }      
    
    public double hargaModalAdonanPizzaPerPcs(){        
        double harga=0;
        harga=beratAdonanPerPcs/hitungTotalBerat()* hitungTotalHarga();
        //** Hitung harga : J17
        return harga;                    
    }     
    
    public double[] hitungJumlahBahan(double order){
        double berat=hitungTotalBerat();
        for (int i=0; i < KomposisiPizza.length; i++) {
            IndekBahan[i]=Integer.valueOf(KomposisiPizza[i][2])/berat*beratAdonanPerPcs;
            JumlahBahan[i]=IndekBahan[i]*order;           
            //**Hitung berat : N4 .. N11
        }         
        return JumlahBahan;
    }           
    
}
