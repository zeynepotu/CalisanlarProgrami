
package com.mycompany.calisanlarprogrami;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
        System.out.println("Hosgeldiniz...........");
        String islemler="1. Yazilimci islemleri\n"
                +"2.Yonetici islemleri\n"
                +"Cikis icin q ya basin....";
        System.out.println("**************************");
        System.out.println(islemler);
        System.out.println("**************************");
        
        while(true){
            System.out.println("islemi seciniz:");
                String islem=scanner.nextLine();
            if (islem.equals("q")){
                System.out.println("Programdan cikiliyor.........");
                break;
            }
            else if (islem.equals("1")){
                Yazilimci yazilimci=new Yazilimci("zeynep","otu",567,"python");
                System.out.println("Yazilimci islemleri........");
                
                String yazilimci_islemleri="1.FORMAT AT\n"
                        +"2.BILGILERI GOSTER\n"
                        + "cikis icin q ya basin..........";
                System.out.println("***************************");
                System.out.println(yazilimci_islemleri);
                System.out.println("***************************");
                while(true){
                System.out.println("islemi seciniz:");
                String y_islem=scanner.nextLine();
                
                if (y_islem.equals("q")){
                    System.out.println("yazilimci islemlerinden cikiliyor....");
                    break;
                }
                else if (y_islem.equals("1")){
                    System.out.println("isletim sistemini giriniz:");
                    String isletim_sistemi=scanner.nextLine();
                    yazilimci.formatAt(isletim_sistemi); 
    
                }
                else if (y_islem.equals("2")){
                    yazilimci.bilgileri_goster();
                    
                }
                else{
                    System.out.println("gecersiz islem");
                }
              
                }
                }
            else if (islem.equals("2")){
                
                Yonetici yonetici = new Yonetici("serhat","say",125,"10");
                String yonetici_islemler="1.zam yap\n"+
                        "2.bilgileri goster\n"+
                        "cikis icin q ya basin";
                                System.out.println("****************************");
                System.out.println(yonetici_islemler);
                System.out.println("****************************");
                while(true){
                
                System.out.println("yonetici islemi seciniz:");
                String y_islemler=scanner.nextLine();
                
             
                if (y_islemler.equals("q")){
                    System.out.println("yonetici islemlerinden cikiliyor....");
                    break;
                }
                else if(y_islemler.equals("1")){
                    System.out.println("zam miktarini giriniz:");
                    int zammiktari=scanner.nextInt();
                    scanner.nextLine();
                    yonetici.zamYap(zammiktari);
                }
                else if(y_islemler.equals("2")){
                    yonetici.bilgileri_goster();
                }
                else{
                    System.out.println("gecersiz islem");
                }
                }
                
                
                
            }
            else {
                System.out.println("gecersiz islem");
            }
        }
        
                 
    }
    
}
