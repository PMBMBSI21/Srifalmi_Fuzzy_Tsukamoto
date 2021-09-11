/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variabel;

/**
 *
 * @author user
 */
public class Persediaan {
     private static double stok ;
    
    //nilai dari grafik
    
    private static double koordinat1  = 0;
    private static double koordinat2 = 100;
    private static double koordinat3  = 600;
  
    //agar bisa mengambil nilai permintaan
    public static double getstok() {
        return stok;
    }
        //memeberikan nilai pada inputan
    public static void setstok (double stok) {
        Persediaan.stok = stok;
        
    }
    
    //grafik fungsi sedikit
    public static double sedikit() {
        if (stok>=koordinat1 && stok <= koordinat2) return 1;
        else if (stok>koordinat2 && stok<koordinat3) return (koordinat3-stok) /(koordinat3-koordinat2);
        else return 0;
        
    }
    //grafik fungsi banyak
   public static double banyak() {
        if (stok>koordinat2 && stok<koordinat3) {
            return (stok-koordinat2)/(koordinat3-koordinat2);
        }
        else if (stok>=koordinat3){ 
            return 1;
        }
        else return 0;
        
    }
       
}
