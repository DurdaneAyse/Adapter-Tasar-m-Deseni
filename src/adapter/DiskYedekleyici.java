package adapter;


import adapter.IYedekleyici;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AYŞE
 */
public class DiskYedekleyici implements IYedekleyici{

    @Override
    public void Kaydet(String kaynakKlasorKonumu, String hedefKlasorKonumu) {
    //kaynaktan kopyalayıp hedefe yapıştıran kod parçaları bulunacaktır.
      System.out.println(kaynakKlasorKonumu+" konumundaki dosyalar diskte "+hedefKlasorKonumu+" içine yüklenmiştir.");

    }
    
}
