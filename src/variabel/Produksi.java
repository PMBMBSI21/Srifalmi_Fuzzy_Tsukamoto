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
public class Produksi {
    private static double produk ;
    
    //nilai dari grafik
    
    private static double koordinat1  = 0;
    private static double koordinat2 = 2000;
    private static double koordinat3  = 7000;
  
    //agar bisa mengambil nilai permintaan
    public static double getproduk() {
        return produk;
        }
        //memeberikan nilai pada inputan
    public static void setproduk (double produk) {
        Produksi.produk = produk;
        
         }
    
    //grafik fungsi berkurang
    public static double berkurang() {
        if (produk>=koordinat1 && produk <= koordinat2) return 1;
        else if (produk>koordinat2 && produk<koordinat3) return (koordinat3-produk) /(koordinat3-koordinat2);
        else return 0;
        
         }
    //grafik fungsi bertambah
     public static double bertambah() {
        if (produk>koordinat2 && produk<koordinat3) {
            return (produk-koordinat2)/(koordinat3-koordinat2);
        }
        else if (produk>=koordinat3){ 
            return 1;
        }
        else return 0;
        }
        //menghitung jumlah hasil produksi
        public static double Berkurang (double in) {
            return (koordinat3-(in*(koordinat3-koordinat2)));
            
        }
        
         public static double Bertambah (double in) {
            return (koordinat2+(in*(koordinat3-koordinat2)));
            
        }
            
        }
    

