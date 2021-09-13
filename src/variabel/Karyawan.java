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
public class Karyawan {
    
    private static double karyawan ;
     
    private static double koordinat1  = 0;
    private static double koordinat2 = 50;
    private static double koordinat3  = 200;
    
     //agar bisa mengambil nilai permintaan
    public static double getkaryawan() {
        return karyawan;
    }
        //memeberikan nilai pada inputan
    public static void setkaryawan (double karyawan) {
        Karyawan.karyawan = karyawan;
        
    }
    
    //grafik fungsi turun
    public static double sedikit() {
        if (karyawan>=koordinat1 && karyawan <= koordinat2) return 1;
        else if (karyawan>koordinat2 && karyawan<koordinat3) return (koordinat3-karyawan) /(koordinat3-koordinat2);
        else return 0;
        
    }
    //grafik fungsi naik
    public static double banyak() {
        if (karyawan>koordinat2 && karyawan<koordinat3) {
            return (karyawan-koordinat2)/(koordinat3-koordinat2);
        }
        else if (karyawan>=koordinat3){ 
            return 1;
        }
        else return 0;
}
}
