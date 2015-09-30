package inheritance;

import java.util.Scanner;

/**
 * @file_name : Phone.java
 * @author : chanhok61@daum.net
 * @date : 2015. 9. 30.
 * @story : 상속예제
 */
public class PhoneMain {
	//프로젝트>패키지>클래스>메소드>구문
	/**
	 * 
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);// 인스턴스(scanner) => 참조변수
		
		Phone androidPhone = new AndroidPhone();
		System.out.println("구매할 사이즈 선택");
		String size = scanner.next();
		System.out.println("안드로이드폰으로 통화할 사람");
		String name2 = scanner.next();
		System.out.println("보낼 메시지 입력");
		String msg2 =scanner.next();
		((AndroidPhone) androidPhone).setData(msg2, name2, size);
		System.out.println(((AndroidPhone) androidPhone).getData());
		System.out.println("===========================");
		Phone iphone = new Iphone();
		System.out.println("아이폰으로 통화할 사람");
		String name = scanner.next();
		System.out.println("보낼 메시지 입력");
		String msg =scanner.next();
		((Iphone) iphone).setData(msg, name);
		System.out.println(((AndroidPhone) iphone).getData());
		System.out.println("========================");
		Phone nokia = new CelPhone();
		nokia.setCompayny("노키아");
		System.out.println(nokia.getCompayny()+"를 사용");
		System.out.println("휴대폰으로 통화할 사람");
		nokia.setCall(scanner.next());
		System.out.println(nokia.getCall());
		System.out.println("========================");
		
		Phone phone = new Phone(); // 타입 인스턴스(객체) = new 생성자
		
		phone.setCompayny("삼성 집전화기");
		System.out.println(phone.getCompayny()+"를 사용합니다.");
		System.out.println("통화할 사람");
		phone.setCall(scanner.next());
		System.out.println(phone.getCall());
	}
}
class AndroidPhone extends Iphone {
	public static String BRAND = "안드로이드폰"; //오버라이딩
	private String data;
	private String size;
	
	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public void setData(String data, String name, String size){
		super.setCompayny(BRAND);
		super.setPortable(TRUE);
		super.setCall(name);
		this.setSize(size);
		this.data=
				super.getCompayny()+"\t"
		       +super.isPortable()+"\t"
		       +super.getCall()+"\t"
		       +"대화면 "+this.getSize()+"로 볼수 있음\t"
		       +data+"카톡메시지 전달";
	}
	public String getData(){
		return data;
	}
}
class Iphone extends CelPhone{
	private String data; // 인스턴스 변수
	public static String BRAND = "아이폰"; // static은 고정된 이란 의미로
	// static 이 붙은 변수는 클래스변수라고 한다.
	public static boolean TRUE = true;
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public void setData(String data, String name) { //오버로딩
		super.setCompayny(BRAND); //애플은 여러브랜드를 만들지 않고 무조건 아이폰이라고 한다.
		super.setPortable(TRUE);  // 애플은 집전화기는 안만들고 무조건 휴대폰만 만든다.
		super.setCall(name);
		this.data = 
				super.getCompayny()+"\t"
			   +super.isPortable()+"\t"
			   +super.getCall()+"\t"+data+" : 메시지전달";
	}

	
}


class Phone {
	private String compayny, call; // company는 인스턴스(의) 변수 =>힙 영역
	final static double TAX_RATE = 0.095; // 스태틱 변수 =>전역변수(글로벌 변수)(클래스밖에서도 사용가능, 패키지안에서 사용가능)=>스태틱영역

	public String getCompayny() {
		return compayny;
	}

	public String getCall() {
		return call;
	}

	public void setCompayny(String compayny) {
		this.compayny = compayny; //company는 지역{메소드(의)} 변수 => 스택영역
	}

	public void setCall(String call) {
		this.call = call + "에게 전화를 검";
	}
}
class CelPhone extends Phone{
	private boolean portable; // 이동성.. 가지고 다닐수 있느냐 없느냐?
	private String move;
	
	public boolean isPortable() {
		return portable;
	}
	public String getMove() {
		return move;
	}
	public void setPortable(boolean portable) {
		if (portable) {
			this.setMove("폰을 가지고 다닐 수 있음");
		}
		else {
			this.setMove("폰을 가지고 다닐 수 없음");
		}
		this.portable = portable;
	}
	public void setMove(String move) {
		this.move = move;
	}
	
	
}