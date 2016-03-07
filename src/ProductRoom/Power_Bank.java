package ProductRoom;

public class Power_Bank extends Accessorie {
	private String energy;

    public Power_Bank(String e) {
    energy =e;
    }

 


    @Override
    public void ShowProduct() {
        super.ShowProduct(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Energy :"+energy);
    }
    public void addProduct(String bn, Double p, String c, String s,String dt ,String st ,String e) {
          brandname=bn;
                price = p;
                color = c;
                size = s;
                energy =e;
                devicetype=dt;
                supportdevice=st;
    
    }
           public void Promotion() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Double sum ;
        Double sale = 0.04;
        sum = getPrice()-(getPrice() *sale);
        
        setPrice(sum);
        
    }
}