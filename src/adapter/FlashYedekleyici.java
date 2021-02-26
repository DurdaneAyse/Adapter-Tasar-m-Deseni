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
public class FlashYedekleyici implements IYedekleyici{

    @Override
    public void Kaydet(String kaynakKlasorKonumu, String hedefKlasorKonumu) {
          System.out.println(kaynakKlasorKonumu+" konumundaki dosyalar flash diskte "+hedefKlasorKonumu+" içine yüklenmiştir.");

    }
    
}
