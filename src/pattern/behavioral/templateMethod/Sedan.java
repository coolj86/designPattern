package pattern.behavioral.templateMethod;

public class Sedan extends Car{

		public Sedan(String model, String number) {
			super(model,number);
		}
		@Override
		void parkingOff() {
			System.out.println("주차브레이크 해제!!");
		}
		
		void engineStart() {
			System.out.println("엔진 시동!!");
			
		}
}
