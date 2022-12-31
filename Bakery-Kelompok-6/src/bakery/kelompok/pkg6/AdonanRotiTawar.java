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
public class AdonanRotiTawar {  
    public static HargaBahan hb = new HargaBahan();
    public double beratAdonanPerPcs = 400;
    public double[] IndekBahan={0,0,0,0,0,0,0,0};
    public double[] JumlahBahan={0,0,0,0,0,0,0,0};

    // deklarasi array //
    String[][] KomposisiRotiTawar = {
            {"A01","Tepung Terigu","1000"},
            {"A02","Gula Pasir","125"},
            {"A03","Butter","100"},
            {"A04","Ragi","20"},
            {"A05","Susu Bubuk","250"},
            {"A06","Susu Cair","200"},
            {"A07","Telur","70"},
            {"A08","Es Batu","300"}            
    };
        
    public double hitungTotalBerat(){
        double berat=0;
        for (int i=0; i < KomposisiRotiTawar.length; i++) {
            berat+=Integer.valueOf(KomposisiRotiTawar[i][2]);
        }   
       return berat;
    }      
    
    public double hitungTotalHarga(){      
        double harga=0;
        for (int i=0; i < KomposisiRotiTawar.length; i++) {
            harga+=hb.hargaBahan(KomposisiRotiTawar[i][0],KomposisiRotiTawar[i][2]);
        }   
        return harga;     
    }

    public double hargaModalAdonanRotiTawarPerPcs(){        
        double harga=0;
        harga=beratAdonanPerPcs/hitungTotalBerat()* hitungTotalHarga();
        return harga;                    
    }
    public double[] hitungJumlahBahan(double order){
        double berat=hitungTotalBerat();
        for (int i=0; i < KomposisiRotiTawar.length; i++) {
            IndekBahan[i]=Integer.valueOf(KomposisiRotiTawar[i][2])/berat*beratAdonanPerPcs;
            JumlahBahan[i]=IndekBahan[i]*order;  
        }         
        return JumlahBahan;
    }       
}
