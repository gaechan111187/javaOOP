package encapsule;

public class Pay {
	//멤버 필드
	final double tax_Rate= 0.097;
	private int salary; 
	private String name;
	private int tax;
	//ALT+SHIFT+S
	//멤버 메소드
	public Pay() {
		// TODO Auto-generated constructor stub
	}
	public Pay(int salary, String name){
		this.name = name;
		this.salary = salary;
		this.tax = (int) (tax*tax_Rate);
		
	}

	public double getTax_Rate() {
		return tax_Rate;
	}
	public int getSalary() {
		return salary;
	}
	public String getName() {
		return name;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = (int) (tax*tax_Rate);
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "연봉 "+getSalary()+"만원을 받으시는 "+ getName()+"께서 납부할 세금은 "+getTax()+"만원입니다.";
	}
}
