package ProductRoom;

public class Accessorie extends Product {
	protected String devicetype;
	protected String supportdevice;

   
        
          @Override
    public void ShowProduct() {
        super.ShowProduct(); //To change body of generated methods, choose Tools | Templates.
        System.out.println(" Devicetype :"+devicetype+"\n Supportdevice"+supportdevice);
    }
       public void addProduct(String bn ,Double p ,String c,String s,String dt,String sd) {
		
                brandname=bn;
                price = p;
                color = c;
                size = s;
                devicetype =dt;
                supportdevice =sd;
                
	}

    @Override
    public void Promotion() {
       // super.Promotion(); //To change body of generated methods, choose Tools | Templates.

       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Double sum ;
        Double sale = 0.04;
        sum = getPrice()-(getPrice() *sale);
        setPrice(sum);
        
    }
}