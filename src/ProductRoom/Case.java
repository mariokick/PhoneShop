package ProductRoom;

public class Case extends Accessorie {
	private String typecase;

    public Case(String tc) {
    typecase =tc;
    }
       @Override
    public void ShowProduct() {
        super.ShowProduct(); //To change body of generated methods, choose Tools | Templates.
        System.out.println(" TypeCase :"+typecase);
    }
       public void addProduct(String bn ,Double p ,String c,String s,String dt ,String st ,String tc) {
		
                brandname=bn;
                price = p;
                color = c;
                size = s;
                typecase =tc;
                devicetype=dt;
                supportdevice=st;
                
	}

    @Override
    public void Promotion() {
       // super.Promotion(); //To change body of generated methods, choose Tools | Templates.

       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Double sum ;
        Double sale = 0.05;
        sum = getPrice()-(getPrice() *sale);
        setPrice(sum);
        
    }
        
}