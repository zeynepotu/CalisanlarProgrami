
package com.mycompany.calisanlarprogrami;

public class Yazilimci extends Calisan {

    private String diller;
    
    public Yazilimci(String ad, String soyad, int id,String diller) {
        super(ad, soyad, id);
        this.diller=diller;
    }
    public void formatAt(String isletim_sistemi){
        System.out.println(getAd()+""+isletim_sistemi+"ni yukluyor....");
        
    }

    @Override
    public void bilgileri_goster() {
        super.bilgileri_goster();
        System.out.println("Yazilimcinin bildigi diller:"+diller);
        
    }

    
   
   
    
    
    
    
    
    
}
