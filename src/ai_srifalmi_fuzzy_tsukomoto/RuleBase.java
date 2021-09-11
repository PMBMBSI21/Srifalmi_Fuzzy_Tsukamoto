/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai_srifalmi_fuzzy_tsukomoto;

import variabel.Permintaan;
import variabel.Persediaan;
import variabel.Produksi;
import variabel.Karyawan;

/**
 *
 * @author user
 */
public class RuleBase {
    private static double [] x_produksi = new double [6];
    private static double [] y_produksi = new double [6];
    private static double jumlah;
    
    //rule base
    public static void menghitung_x (){
    x_produksi[0]=Math.min(Permintaan.turun(),Persediaan.banyak());
    x_produksi[0]=Math.min(x_produksi[0],Karyawan.sedikit());
    
    x_produksi[1]=Math.min(Permintaan.turun(),Persediaan.banyak());
    x_produksi[1]=Math.min(x_produksi[1],Karyawan.banyak());
    
    x_produksi[2]=Math.min(Permintaan.turun(),Persediaan.sedikit());
    x_produksi[2]=Math.min(x_produksi[2],Karyawan.sedikit());
    
    x_produksi[3]=Math.min(Permintaan.turun(),Persediaan.sedikit());
    x_produksi[3]=Math.min(x_produksi[3],Karyawan.banyak());
    
    x_produksi[4]=Math.min(Permintaan.naik(),Persediaan.banyak());
    x_produksi[4]=Math.min(x_produksi[4],Karyawan.sedikit());
    
    x_produksi[5]=Math.min(Permintaan.naik(),Persediaan.banyak());
    x_produksi[5]=Math.min(x_produksi[5],Karyawan.banyak());
   
    }
            
    public static void menghitung_y (){
    y_produksi[0]=Produksi.Berkurang( x_produksi [0]);
    
    y_produksi[1]=Produksi.Bertambah( x_produksi [1]);
    
    y_produksi[2]=Produksi.Berkurang( x_produksi [2]);
    
    y_produksi[3]=Produksi.Berkurang( x_produksi [3]);
    
    y_produksi[4]=Produksi.Berkurang( x_produksi [4]);
    
    y_produksi[5]=Produksi.Bertambah( x_produksi [5]);
    
                 
    }
    
    //menghitung hasil produksi
    public static double hasilproduksi() {
        double atas =0, bawah=0;
        for(int i=0;i<6;i++){
        System.out.println("y_produksike-"+i+ " : " + y_produksi[i] );
        System.out.println("x_produksike-"+i+ " : " + x_produksi[i] );
        
        atas+=(x_produksi[i]*y_produksi[i]);
        bawah+=x_produksi[i];
        }
        System.out.println(atas/bawah);
        return (atas/bawah);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    
}
