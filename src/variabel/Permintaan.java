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
public class Permintaan {
       // variable permintaan
    private static double minta ;
    
    //nilai dari grafik
    
    private static double koordinat1  = 0;
    private static double koordinat2 = 1000;
    private static double koordinat3  = 5000;
  
    //agar bisa mengambil nilai permintaan
    public static double getminta() {
        return minta;
    }
        //memeberikan nilai pada inputan
    public static void setminta (double minta) {
        Permintaan.minta = minta;
        
    }
    
    //grafik fungsi turun
    public static double turun() {
        if (minta>=koordinat1 && minta <= koordinat2) return 1;
        else if (minta>koordinat2 && minta<koordinat3) return (koordinat3-minta) /(koordinat3-koordinat2);
        else return 0;
        
    }
    //grafik fungsi naik
    public static double naik() {
        if (minta>koordinat2 && minta<koordinat3) {
            return (minta-koordinat2)/(koordinat3-koordinat2);
        }
        else if (minta>=koordinat3){ 
            return 1;
        }
        else return 0;
        
    }
       
}



