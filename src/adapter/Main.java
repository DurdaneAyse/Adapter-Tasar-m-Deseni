/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author AYŞE
 */
public class Main {

    
    public static void main(String[] args) {
        String kaynak="C:\\YedeklenecekKlasör";
        IYedekleyici yedekleme;
        yedekleme=new DiskYedekleyici();
        yedekleme.Kaydet(kaynak, "D:\\HedefDiskKonumu");
        yedekleme=new FlashYedekleyici();
        yedekleme.Kaydet(kaynak, "U:\\FlashDiskKonumu");
        
        
        yedekleme=new UzakHedefKayitAdapter();
        yedekleme.Kaydet(kaynak,"www.abc.com\\hedefwebkonumu");
        
    }
    
}
