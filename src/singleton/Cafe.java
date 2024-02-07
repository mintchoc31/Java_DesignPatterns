package singleton;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cafe {
	
	public static void main(String[] args) {
		// 커피 메이커 인스턴스를 얻어서 커피를 만들게 동작 시키기
		System.out.println("- 세상에서 가장 작은 카페 오픈 -");
		
		// 커피 메이커 인스턴스가 필요
		// CoffeeMaker coffeeMaker = new CoffeeMaker();   : 생성되지 않음
		CoffeeMaker coffeeMaker1 =  CoffeeMaker.getInstance();
		coffeeMaker1.makeCoffee();
		
		CoffeeMaker coffeeMaker2 =  CoffeeMaker.getInstance();
		System.out.println(coffeeMaker1 == coffeeMaker2);
		LogWriter.getInstance().writeLog("커피 결제 완료 : " + dateFormatter(new Date()));
	}
	
	// 시간 포맷 기능
	public static String dateFormatter(Date date) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return dateFormat.format(date);
	}
}
