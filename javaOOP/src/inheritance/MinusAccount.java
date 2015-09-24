package inheritance;


public class MinusAccount extends Account{
	private int limit;
	
	public static final String BANK_NAME = "러시앤캐시"; //오버라이딩
	int limitmoney;
	int minusmoney= 0;
	public void loan(){
	}
	
	@Override
	
	public void withdraw(int money1) {
		limitmoney = this.limit + this.getRestmoney();
		if (money1>limitmoney ) {
			System.out.println("한도초과입니다.");return;
		}
		
		else {
			minusmoney = this.getRestmoney() - money1;
		}
		this.setRestmoney(minusmoney);
		 System.out.println("\n"+toString());
		// TODO Auto-generated method stub
	}
	@Override
	public void deposit(int money) {
		// TODO Auto-generated method stub
		super.deposit(money);
	}
	@Override
	public String toString() {
			return "["+BANK_NAME+"]\n"
					+"계좌번호 :"+getAccountNo()+"\n"
					+"계좌명 :"+getOwnerName()+"\n"
					+"비번: ******\n"
					+"잔액:"+getRestmoney()+"\n";
		// TODO Auto-generated method stub
	}
	public int getLimit() {
		return limit;
	}
	public static String getBankName() {
		return BANK_NAME;
	}
	public int getMinusmoney() {
		return minusmoney;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public void setMinusmoney(int minusmoney) {
		this.minusmoney = minusmoney;
	}
	public int getLimitmoney() {
		return limitmoney;
	}
	public void setLimitmoney(int limitmoney) {
		this.limitmoney = this.limit+this.getRestmoney();
	}
}
