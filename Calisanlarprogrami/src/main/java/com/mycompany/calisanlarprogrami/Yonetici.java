
package com.mycompany.calisanlarprogrami;


public class Yonetici extends Calisan{
    private String sorumlukisi_sayisi;

    public Yonetici(String ad, String soyad, int id,String sorumlukisi_sayisi){
        super(ad, soyad, id);
        this.sorumlukisi_sayisi = sorumlukisi_sayisi;
    }

    @Override
    public void bilgileri_goster() {
        super.bilgileri_goster();
        System.out.println("Sorumlu kisi sayisi:"+sorumlukisi_sayisi);
        
    }
    
    public void zamYap(int zammiktari){
        System.out.println(getAd()+"adli calisana"+zammiktari+"tutarinda zam yapilmistir...");
    }
    
}