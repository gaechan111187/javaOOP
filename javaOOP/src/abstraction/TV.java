package abstraction;

public class TV extends Product {
	protected String size;
	protected String screen;
	
	public void setTVInfo(String company, String name, String serailNo, String size, String screen){
		super.setProductInfo(company, name, serailNo);
		this.size = size;
		this.screen = screen;
	}

	@Override
	public String display() {
		// TODO Auto-generated method stub
		return  "제조회사: " + super.company+"\n"
		+"제품명 : " + super.name+"\n"
		+"고유번호 : "+ super.serialNo+ "\n"
		+"인치 : "+ this.size+"\n"
		+"화면 : "+this.screen;
	}

}
