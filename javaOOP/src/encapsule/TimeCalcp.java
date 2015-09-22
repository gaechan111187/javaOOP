package encapsule;

import java.util.Scanner;

/**
 * @file_name : TimeCalc.java 
 * @author    : chanhok61@daum.net
 * @date      : 2015. 9. 21.
 * @story     : 입력된 시간(초)를 시간, 분, 초로 환산하기
 */
public class TimeCalcp {
	/**
	 * To.개발자님께
	 * 초단위로 알려주는 시험이 있는데
	 * 이 값을 몇시간 몇분 몇초인지 계속 계산해야 해서요.
	 * 혹시 초값을 입력받으면 자동으로 계산되는 프로그램을 만들어 줄 수 있을까요?
	 * 그러니까 500초면  뭐 몇시간 몇분 몇으로라고 보여주면 좋겠죠.
	 */
	public String calGet(int time) {
		int sec = 0, min=0,hour=0 ;
		sec = time%60 ; //초
		min = (time/60)%60; // 남는 분
		hour = (time/60)/60; //시간
		String result = hour+"시간"+min+"분"+sec+"초 입니다.";
		return result ;
	}
}
