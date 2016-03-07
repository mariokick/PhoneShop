package ProductRoom;

public class Tablet extends Product {
	protected String nonsim;
        Tablet(String ns){
            nonsim =ns;
        }

 
    public void addProduct(String bn ,Double p ,String c,String s,String non) {
		
                brandname=bn;
                price = p;
                color = c;
                size = s;
                nonsim =non;
                
                
	}
    @Override
    public void ShowProduct() {
        super.ShowProduct(); //To change body of generated methods, choose Tools | Templates.
        System.out.println(" Non-Sim :"+nonsim);
    }
          public void Promotion() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Double sum ;
        Double sale = 0.02;
        sum = getPrice()-(getPrice() *sale);
        
        setPrice(sum);
        
    }
}