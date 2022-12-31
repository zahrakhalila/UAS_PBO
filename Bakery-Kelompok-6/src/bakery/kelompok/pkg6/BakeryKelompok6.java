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
public class BakeryKelompok6 {
    public static AdonanRotiTawar art = new AdonanRotiTawar();
    public static AdonanRotiManis arm = new AdonanRotiManis();
    public static AdonanPizza ap = new AdonanPizza();

    public static VarianPizza vp = new VarianPizza();
    public static VarianRotiManis vrm = new VarianRotiManis();
    public static VarianRotiTawar vrt = new VarianRotiTawar();
    public static HargaFillingTopping hft = new HargaFillingTopping();   
    
    static double margin=0.5;  

    static int order_roti_manis_varian1=50;  
    static int order_roti_manis_varian2=100;  
    static int order_roti_manis_varian3=70;  

    static int order_roti_tawar_varian1=20;  
    static int order_roti_tawar_varian2=15;  
    
    static int order_pizza_varian1=10;  
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here  
        /*
        System.out.println("Total Berat Adonan Roti Manis "+String.valueOf(arm.hitungTotalBerat()));
        System.out.println("Total Harga Adonan Roti Manis "+String.valueOf(arm.hitungTotalHarga()));
        System.out.println("Total Berat Adonan Roti Tawar "+String.valueOf(art.hitungTotalBerat()));
        System.out.println("Total Harga Adonan Roti Tawar "+String.valueOf(art.hitungTotalHarga()));
        System.out.println("Total Berat Adonan Pizza "+String.valueOf(ap.hitungTotalBerat()));
        System.out.println("Total Harga Adonan Pizza "+String.valueOf(ap.hitungTotalHarga()));
        
        System.out.println("Total Harga Modal Adonan Roti Manis Per Pcs (Rp) "+String.valueOf(arm.hargaModalAdonanRotiManisPerPcs()));
        System.out.println("Total Harga Modal Adonan Roti Tawar Per Pcs (Rp) "+String.valueOf(art.hargaModalAdonanRotiTawarPerPcs()));
        System.out.println("Total Harga Modal Adonan Pizza Per Pcs (Rp) "+String.valueOf(ap.hargaModalAdonanPizzaPerPcs()));   

        System.out.println("Total Harga Modal Filling/Topping Roti Manis Varian 1 Per Pcs (Rp) "+String.valueOf(vrm.hargaModalRotiManisVarian1()));
        System.out.println("Total Harga Modal Filling/Topping Roti Manis Varian 2 Per Pcs (Rp) "+String.valueOf(vrm.hargaModalRotiManisVarian2()));
        System.out.println("Total Harga Modal Filling/Topping Roti Manis Varian 3 Per Pcs (Rp) "+String.valueOf(vrm.hargaModalRotiManisVarian3()));
        System.out.println("Total Harga Modal Filling/Topping Roti Tawar Varian 1 Per Pcs (Rp) "+String.valueOf(vrt.hargaModalRotiTawarVarian1()));
        System.out.println("Total Harga Modal Filling/Topping Roti Tawar Varian 2 Per Pcs (Rp) "+String.valueOf(vrt.hargaModalRotiTawarVarian2()));
        System.out.println("Total Harga Modal Filling/Topping Pizza Varian 1 Per Pcs (Rp) "+String.valueOf(vp.hargaModalPizzaVarian1()));
        */

        //** Hitung harga o40 .. o50
        double hargaJualRotiManisVarian1=(arm.hargaModalAdonanRotiManisPerPcs()+vrm.hargaModalRotiManisVarian1())*(1+margin);
        double hargaJualRotiManisVarian2=(arm.hargaModalAdonanRotiManisPerPcs()+vrm.hargaModalRotiManisVarian2())*(1+margin);
        double hargaJualRotiManisVarian3=(arm.hargaModalAdonanRotiManisPerPcs()+vrm.hargaModalRotiManisVarian3())*(1+margin);
        double hargaJualRotiTawarVarian1=(art.hargaModalAdonanRotiTawarPerPcs()+vrt.hargaModalRotiTawarVarian1())*(1+margin);
        double hargaJualRotiTawarVarian2=(art.hargaModalAdonanRotiTawarPerPcs()+vrt.hargaModalRotiTawarVarian2())*(1+margin);
        double hargaJualPizzaVarian1=    (ap.hargaModalAdonanPizzaPerPcs()+vp.hargaModalPizzaVarian1())*(1+margin);
        
        System.out.println("=============================================");
        System.out.println("Harga Jual Per Pcs");
        System.out.println("Roti Manis Varian 1 Rp.  "+String.format("%,.0f",hargaJualRotiManisVarian1));
        System.out.println("Roti Manis Varian 2 Rp.  "+String.format("%,.0f",hargaJualRotiManisVarian2));
        System.out.println("Roti Manis Varian 3 Rp.  "+String.format("%,.0f",hargaJualRotiManisVarian3));
        System.out.println("Roti Tawar Varian 1 Rp. " +String.format("%,.0f",hargaJualRotiTawarVarian1));
        System.out.println("Roti Tawar Varian 2 Rp. " +String.format("%,.0f",hargaJualRotiTawarVarian2));
        System.out.println("Pizza Varian 1      Rp. " +String.format("%,.0f",hargaJualPizzaVarian1));
               
        int order_roti_manis=order_roti_manis_varian1+order_roti_manis_varian2+order_roti_manis_varian3;
        int order_roti_tawar=order_roti_tawar_varian1+order_roti_tawar_varian2;
        
        arm.hitungJumlahBahan(order_roti_manis);     
        art.hitungJumlahBahan(order_roti_tawar);
        ap.hitungJumlahBahan(order_pizza_varian1);
    
        //** Hitung berat o4 .. o11
        System.out.println("---------------------------------------------");
        System.out.println("Jumlah Berat Bahan Yang Dibutuhkan");  
        for (int i=0; i < arm.JumlahBahan.length; i++) {
            String bahan=arm.KomposisiRotiManis[i][1]+"                   ";
            String berat="   "+String.format("%,.0f",arm.JumlahBahan[i]+art.JumlahBahan[i]+ap.JumlahBahan[i]);
            System.out.println(bahan.substring(0, 23)+" "+berat.substring(berat.length()-6,berat.length())+" gr");  
        }
                        
        vrm.hitungJumlahBahanVarian1(order_roti_manis_varian1);
        vrm.hitungJumlahBahanVarian2(order_roti_manis_varian2);
        vrm.hitungJumlahBahanVarian3(order_roti_manis_varian3);
        vrt.hitungJumlahBahanVarian1(order_roti_tawar_varian1);
        vrt.hitungJumlahBahanVarian2(order_roti_tawar_varian2);       
        vp.hitungJumlahBahanVarian1(order_pizza_varian1);
        
        //** Hitung berat M44 .. M50        
        System.out.println("");       
        System.out.println("Jumlah Berat Filling/Topping Yang Dibutuhkan");       
        for (int i=0; i < vrm.JumlahBahan.length; i++) {
            String bahan=hft.HargaFillingTopping[i][1]+"                   ";
            String berat="   "+String.format("%,.0f",vrm.JumlahBahan[i]+vrt.JumlahBahan[i]+vp.JumlahBahan[i]);
            System.out.println(bahan.substring(0, 23)+" "+berat.substring(berat.length()-6,berat.length())+" gr");  
        }
        
    }   
}
