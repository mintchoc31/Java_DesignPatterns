package singleton;

// 싱글톤 패턴으로 만들어 보기
public class CoffeeMaker {

	// 2. 자신의 참조 값을 저장할 수 있는 static 변수를 선언한다.
	private static CoffeeMaker instance;
	
	// 1. 외부에서 생성자를 바로 호출할 수 없게 설계한다.
	private CoffeeMaker() {}
	
	// 3. 객체를 메모리에 올릴 코드를 작성하고 
	// 외부에서 접근 할 수 있는 메서드를 만들어 준다. (정적 메서드를 만들어줘야 한다.)
					// CoffeeMaker.getInstance 로 호출 가능
	public static synchronized CoffeeMaker getInstance() { // 동기화를 하려면 synchronized -> 메서드를 락한다.
		if(instance == null) {
			instance = new CoffeeMaker();
		}
		return instance;
	}
	
	public void makeCoffee() {
		System.out.println("커피가 만들어졌습니다.");
	}
}
