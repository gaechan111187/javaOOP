package polymorphism;

import java.util.Scanner;

public class MBankService implements Bank{
	MinusAccount maccount = new MinusAccount();
	Scanner Scanner = new Scanner(System.in);

	@Override
	public String open(String ownerName, int limit) {
		// TODO Auto-generated method stub
		return maccount.toString();
	}

	@Override
	public String deposit(int money) {
		// TODO Auto-generated method stub
		return maccount.toString();
	}

	@Override
	public String withdraw(int money1) {
		maccount.limitmoney = maccount.limit + maccount.getRestmoney();
		if (money1>maccount.limitmoney ) {
			return "한도초과입니다.";
		}
		else {
			maccount.minusmoney = maccount.getRestmoney() - money1;
		}
		maccount.setRestmoney(maccount.minusmoney);
		 System.out.println("\n"+toString());
		// TODO Auto-generated method stub
		return maccount.toString();
	}

	@Override
	public String search() {
		// TODO Auto-generated method stub
		return maccount.toString();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return maccount.toString();
	}

}
