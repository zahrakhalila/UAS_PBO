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
public class AdonanRotiManis {
    public static HargaBahan hb = new HargaBahan();       
    public double beratAdonanPerPcs = 50;
    public double[] IndekBahan={0,0,0,0,0,0,0,0};
    public double[] JumlahBahan={0,0,0,0,0,0,0,0};   
    
    // deklarasi array //
    String[][] KomposisiRotiManis = {
        {"A01","Tepung Terigu","1000"},
        {"A02","Gula Pasir","150"},
        {"A03","Butter","150"},
        {"A04","Ragi","20"},
        {"A05","Susu Bubuk","300"},
        {"A06","Susu Cair","250"},
        {"A07","Telur","80"},
        {"A08","Es Batu","400"}            
    };
    
    public double hitungTotalBerat(){
        double berat=0;
        for (int i=0; i < KomposisiRotiManis.length; i++) {
            berat+=Integer.valueOf(KomposisiRotiManis[i][2]);
        }   
        return berat;
    }                

    public double hitungTotalHarga(){      
        double harga=0;
        for (int i=0; i < KomposisiRotiManis.length; i++) {
            harga+=hb.hargaBahan(KomposisiRotiManis[i][0],KomposisiRotiManis[i][2]);
        }   
        return harga;     
    }   
    public double hargaModalAdonanRotiManisPerPcs(){        
        double harga=0;
        harga=beratAdonanPerPcs/hitungTotalBerat()* hitungTotalHarga();
        return harga;                    
    }      
    
    public double[] hitungJumlahBahan(double order){
        double berat=hitungTotalBerat();
        for (int i=0; i < KomposisiRotiManis.length; i++) {
            IndekBahan[i]=Integer.valueOf(KomposisiRotiManis[i][2])/berat*beratAdonanPerPcs;
            JumlahBahan[i]=IndekBahan[i]*order;            
        }         
        return JumlahBahan;
    }        
    
}
