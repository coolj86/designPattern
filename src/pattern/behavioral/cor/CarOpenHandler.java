package pattern.behavioral.cor;

public abstract class CarOpenHandler {
    protected CarOpenHandler next;

    public CarOpenHandler(){}

    // 생성자에서 next 를 지정해도 되고 setNext() 를 별도로 만들어도 가능 함.
//    public CarOpenHandler(CarOpenHandler handler) {
//        next = handler;
//    }
    
    public CarOpenHandler setNext(CarOpenHandler handler) {
    	next = handler;
    	return handler;
    }

    // 서브 클래스에서 구현해야할 추상 메서드
    public abstract boolean open(OpenMethod method);

}
