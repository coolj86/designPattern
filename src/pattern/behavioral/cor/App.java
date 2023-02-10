package pattern.behavioral.cor;

public class App {
    public static void main(String[] args) {

    	CarOpenHandler handler = new AppHandler();
    	CarOpenHandler h1 = new VoiceHandler();
    	CarOpenHandler h2 = new VoiceHandler();
        CarOpenHandler h3 = new KeyHandler();
//        CarOpenHandler handler = new KeyHandler(new VoiceHandler(h1));
//        CarOpenHandler handler = new KeyHandler(new VoiceHandler(h1));
    	handler.setNext(h1);
    	handler.setNext(h2).setNext(h3);
    	boolean result = handler.open(OpenMethod.KEY);
//    	result = handler.open(OpenMethod.VOICE);
        if(result == false) {
            System.out.println("## 요청한 방법으로 문을 열 수 없습니다!!!");
        }
    }
}