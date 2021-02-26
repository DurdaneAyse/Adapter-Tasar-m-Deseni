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
public class UzakHedefeKayit {
    public void UzakHedefeKaydet(String kaynakDosya,String hedefKonum)
    {
        BaglantiKur(hedefKonum);
        DosyalariGonder(kaynakDosya);
        baglantiyiKapat();
    }

public void BaglantiKur(String hedef)
{
System.out.println(hedef+" adres ile bağlantı kuruldu");
}
public void DosyalariGonder(String kaynak)
{
    System.out.println(kaynak+" klasörondeki dosyalar hedef konuma göderiliyor...");
}
public void baglantiyiKapat()
{
    System.out.println("Bağlantı sonlandırıldı.");
}
}