/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProductRoom;

/**
 *
 * @author Godonlyknows
 */
public class TestClass {
    public static void main(String[] args) {
        Phone Iphone4S = new Phone("AIS","SmartPhone");                                   //promotion = 0.01
            System.out.println(" Iphone4S");
            Iphone4S.addProduct("Apple",16500.00,"Gold","3.5 inch","Micro Sim","Smartphone");
            Iphone4S.Promotion();
            Iphone4S.ShowProduct();
        Phone Iphone5S = new Phone("DTAC","SmartPhone");
            System.out.println("Iphone5S");
            Iphone5S.addProduct("Apple",18500.00,"Rose Gold","4 inch","Micro Sim","Smartphone");
            Iphone5S.Promotion();
            Iphone5S.ShowProduct();
        Phone      Iphone6S         = new Phone("HAPPY","SmartPhone");
         Iphone6S.addProduct("Apple",26900.00,"White","4.7 inch","Micro Sim","Smartphone");
          System.out.println("\n Iphone6S");
          Iphone6S.Promotion();
         Iphone6S.ShowProduct();
        Tablet      IPadAir1         = new Tablet("Non-sim");                                       //promotion = 0.02
        IPadAir1.addProduct("Apple",15900.00,"White","7.9 inch","Non-Sim");
        IPadAir1.Promotion();
        IPadAir1.ShowProduct();
        Tablet      IPadAir2         = new Tablet("Non-Sim");
        IPadAir2.addProduct("Apple",16900.00,"White","9.7 inch","Non-Sim");
        IPadAir2.Promotion();
        IPadAir2.ShowProduct();
        Tablet      IPadAir3          = new Tablet("true");
        IPadAir3.addProduct("Apple",21900.00,"White","12.9 inch","Non-Sim");
          IPadAir3.Promotion();
        IPadAir3.ShowProduct();
        //Accessorie
        Speaker     SonyS1          = new Speaker(300);                                             //promotion = 0.03
        SonyS1.addProduct("Sony",1900.00,"Black","S","Speaker","Phone",300);
        SonyS1.Promotion();
        SonyS1.ShowProduct();
        Speaker     SonyS2            = new Speaker(400);
        SonyS2.addProduct("Sony",2900.00,"Black","M","Speaker","Phone",400);
        SonyS2.Promotion();
        SonyS2.ShowProduct();
        Speaker     SonyS3            = new Speaker(500);
        SonyS3.addProduct("Sony",3900.00,"White","L","Speaker","Phone",500);
        SonyS3.Promotion();
        SonyS3.ShowProduct();
        Power_Bank  Sumsung11300mAh     = new Power_Bank("11300mAh");                                        //promotion = 0.04
        Sumsung11300mAh.addProduct("Sumsung",1190.00,"Green","L","Power Bank","Phone","11300mAh");
        Sumsung11300mAh.Promotion();
        Sumsung11300mAh.ShowProduct();
        Power_Bank  Sumsung1000mAh       = new Power_Bank("1000mAh");
        Sumsung1000mAh.addProduct("Sumsung",590.00,"Red","M","Power Bank","Phone","1000mAh");
         Sumsung1000mAh.Promotion();
        Sumsung1000mAh.ShowProduct();
        Power_Bank  Sumsung500mAh      = new Power_Bank("500mAh");
        Sumsung500mAh.addProduct("Sumsung",290.00,"White","S","Power Bank","Phone","500mAh");
         Sumsung500mAh.Promotion();
        Sumsung500mAh.ShowProduct();
        Case        CaseIphone4S        = new Case("Plastic");//promotion = 0.05
        CaseIphone4S.addProduct("Apple",390.00,"Black","L","Case","Ipohne4S","Plastic");
        CaseIphone4S.Promotion();
        CaseIphone4S.ShowProduct();
        Case        CaseIphone5S        = new Case("Plastic");
        CaseIphone5S.addProduct("Apple",590.00,"Rose","M","Case","Ipohne5S","Plastic");
           CaseIphone5S.Promotion();
        CaseIphone5S.ShowProduct();
        Case        CaseIphone6S        = new Case("Plastic");
        CaseIphone6S.addProduct("Apple",790.00,"Gold","XXL","Case","Ipohne6S","Plastic");
           CaseIphone6S.Promotion();
        CaseIphone6S.ShowProduct();
        Cable       LigthingCable       = new Cable(3.5,"USB");//promotion = 0.06
        LigthingCable.addProduct("Apple",390.00,"White","3.5m","Cable","Phone",7.5,"USB 3.0");
        LigthingCable.Promotion();
        LigthingCable.ShowProduct();
        Cable       SunCable            = new Cable(4.5,"USB");
        SunCable.addProduct("Apple",590.00,"Orange","4.5m","Cable","Phone",6.5,"USB 2.0");
         SunCable.Promotion();
        SunCable.ShowProduct();
        Cable       MoonCable           = new Cable(6.0,"USB");
        MoonCable.addProduct("Apple",790.00,"Green","6.0m","Cable","Phone",2.5,"USB");
         MoonCable.Promotion();
        MoonCable.ShowProduct();
     //   Iphone4S.addProduct("Apple", 90.00,"Red","L");
       // IPadAir1.addProduct("Apple",80.00,"Green","L");
     
         // I.addProduct("apple1",80.00,"Green","L");
            // I.ShowProduct();
      //  System.out.println(Iphone4S.getBrandname()+Iphone4S.getSim());
        
     
        
    }
    
}
