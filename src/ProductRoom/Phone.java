package ProductRoom;

public class Phone extends Product {
	private String sim;
	private String type;
        
        Phone(String s ,String t){
            sim = s;
            type = t;
        }


    public void addProduct(String bn, Double p, String c, String s,String sm ,String t) {
          brandname=bn;
                price = p;
                color = c;
                size = s;
                sim= sm ;
                type = t;
    
    }

    @Override
    public void ShowProduct() {
        super.ShowProduct(); //To change body of generated methods, choose Tools | Templates.
        System.out.print(" Sim :"+sim+
                            "\n Type :"+type);
    }

   public void Promotion() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Double sum ;
        Double sale = 0.01;
        sum = getPrice()-(getPrice() *sale);
        
        setPrice(sum);
        
    }
        
}