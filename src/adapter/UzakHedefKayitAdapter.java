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
public class UzakHedefKayitAdapter implements IYedekleyici {
private UzakHedefeKayit uzakKayit; 
    @Override
    public void Kaydet(String kaynakKlasorKonumu, String hedefKlasorKonumu) {
    
    
    uzakKayit=new UzakHedefeKayit();
    uzakKayit.UzakHedefeKaydet(kaynakKlasorKonumu, hedefKlasorKonumu);
    }
    
}
