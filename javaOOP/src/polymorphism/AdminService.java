package polymorphism;

public class AdminService implements Admin{
	private Account[] accountList;
	private int count;
	
	public AdminService() {
		this(0);
	}
	
	public AdminService(int count) {
		accountList = new Account[count];
		
	}
	

	public Account[] getAccountList() {
		return accountList;
	}


	public int getCount() {
		return count;
	}


	public void setAccountList(Account[] accountList) {
		this.accountList = accountList;
	}


	public void setCount(int count) {
		this.count = count;
	}


	@Override
	public Account searchAccountByAccountNo(int accountNo) {
		Account searchAccount = null;
		for (int i = 0; i < this.getCount(); i++) {
			if(accountList[i].getAccountNo()==(accountNo)){
				searchAccount = accountList[i];
			}
		}
		return searchAccount;
	}
	@Override
	public Account[] searchAccountsByName(String name) {
		int tempCount = 0;//searchCountByName(name);
		for (int i = 0; i < count; i++) {    //for (int i = 0; i < tempList.length; i++) {
			if (accountList[i].getOwnerName().equals(name)) {
				tempCount++;
			}
		}
		Account[] tempList = new Account[tempCount];
		tempCount = 0;
		for (int i = 0; i < count; i++) {
			if (accountList[i].getOwnerName().equals(name)) {
				tempList[tempCount++]=accountList[i];
			}
		}
	return tempList;
	}
	private int searchCountByName(String name) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String closeAccount(int accountNo) {
		String result = "요청하신 해지건이 완료되었습니다.";
		for (int i = 0; i < count; i++) {
			if (accountNo == accountList[i].getAccountNo()) {
				System.out.println("카운트 : " + count + " i값 : " + i);
				accountList[i] = accountList[count-1];
			}	
		}
		accountList[count-1] = null ;
		count--;
		return result;
	}

	@Override
	public String openAccount(int accountNo, String name, int restMoney) {
		Account account = new Account();
		String msg="";
		account.setAccountNo(accountNo);
		account.setOwnerName(name);
		account.setRestmoney(restMoney);
		
		accountList[count] = account;
		count++;
		msg = account.toString();
		return msg;
		
		
	}

	@Override
	public int countAll(int count) {
		// TODO Auto-generated method stub
		return 0;
	}

}
