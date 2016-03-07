package ProductRoom;

public class Cable extends Accessorie {
	private double length;
	private String port;

    public Cable(Double lg ,String pt) {
    }
        
            @Override
    public void ShowProduct() {
        super.ShowProduct(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Length"+length+
                            "\n Port :"+port);
    }
       public void addProduct(String bn ,Double p ,String c,String s,String dt ,String st ,Double lg ,String pt) {
		
                brandname=bn;
                price = p;
                color = c;
                size = s;
                length=lg;
                port = pt;
                devicetype=dt;
                supportdevice=st;
                
	}

    @Override
    public void Promotion() {
       // super.Promotion(); //To change body of generated methods, choose Tools | Templates.

       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Double sum ;
        Double sale = 0.06;
        sum = getPrice()-(getPrice() *sale);
        setPrice(sum);
        
    }
}