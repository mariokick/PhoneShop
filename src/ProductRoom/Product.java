package ProductRoom;

public class Product implements Product_in{
	protected String brandname ;
	protected double price;
	protected String color;
	protected String size;

	public void addProduct(String bn ,Double p ,String c,String s) {
		
                brandname=bn;
                price = p;
                color = c;
                size = s;
                
	}
        
    @Override
    public void ShowProduct() {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("\n Brandname :"+getBrandname()+
                           "\n Price :"+getPrice()+
                           "\n Color :"+getColor()+
                           "\n Size :"+getSize()
                            )
                                ;
        
    }
  @Override
    public void Promotion() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Double sum ;
        Double sale = 0.03;
        sum = getPrice()-(getPrice() *sale);
        
        setPrice(sum);
        
    }
    
    public String getBrandname() {
        return brandname;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public String getSize() {
        return size;
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSize(String size) {
        this.size = size;
    }

    
    
    
}