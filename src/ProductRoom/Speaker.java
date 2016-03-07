package ProductRoom;

public class Speaker extends Accessorie {
	private int wat;
       Speaker(int w){
           wat=w;
       }

    public int getWat() {
        return wat;
    }

    @Override
    public void ShowProduct() {
        super.ShowProduct(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Wat :"+getWat());
    }
       public void addProduct(String bn ,Double p ,String c,String s,String dt ,String st ,int w) {
		
                brandname=bn;
                price = p;
                color = c;
                size = s;
                devicetype=dt;
                supportdevice=st;
                wat=w;
                
	}

    @Override
    public void Promotion() {
       // super.Promotion(); //To change body of generated methods, choose Tools | Templates.

       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Double sum ;
        Double sale = 0.03;
        sum = getPrice()-(getPrice() *sale);
        setPrice(sum);
        
    }
    
       
}