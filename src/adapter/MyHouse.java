package adapter;

public class MyHouse {
	
	// 전기 연결
	public static void homeConnect(IElectronic220v iElectronic220v) {
		iElectronic220v.connect();
		
	}
	public static void main(String[] args) {
		
		HairDryer hairDryer = new HairDryer();
		AirConditioner airConditioner = new AirConditioner();
		
		// 전기 연결 동작 
		homeConnect(airConditioner);
		// homeConnect(hairDryer); --> 연결 불가. 스펙이 다름 --> 어댑터 클래스 필요
		
		// 철물점 가서 어댑터 클래스를 구해오자
		ElectronicAdapter hairDryerAdapter = new ElectronicAdapter(hairDryer);
		homeConnect(hairDryerAdapter);
		
	}

}
