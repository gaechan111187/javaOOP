package abstraction;

public class SmartPhone extends Product{
	protected String camera, weight;
	public void setSamrtPhoneInfo(String company, String name, String serialNo, String camera, String weight){
		super.setProductInfo(company, name, serialNo);
		this.camera = camera;
		this.weight = weight;
	}

	@Override
	public String display() {
		// TODO Auto-generated method stub
		return  "제조회사: " + super.company+"\n"
		+"제품명 : " + super.name+"\n"
		+"고유번호 : "+ super.serialNo+ "\n"
		+"카메라 : "+this.camera+"\n"
		+"무게"+this.weight;
	}

}
