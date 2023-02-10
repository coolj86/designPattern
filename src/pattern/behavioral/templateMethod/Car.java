package pattern.behavioral.templateMethod;

public abstract class Car {
	String model;
	String number;
	
	public Car(String model, String number) {
		this.model = model;
		this.number = number;
	}
	
	void start() {
		System.out.println("start!!");
		engineStart();
		parkingOff();
	}
	
	abstract void engineStart();
	abstract void parkingOff();

}
