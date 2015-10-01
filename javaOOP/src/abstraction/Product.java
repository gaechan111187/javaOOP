package abstraction;

public abstract class Product {
	protected String company;
	protected String name;
	protected String serialNo;
	
	public void setProductInfo(String company, String name, String serialNo ){
		this.company = company;
		this.name= name;
		this.serialNo = serialNo;
	}
	public abstract String display();
}
