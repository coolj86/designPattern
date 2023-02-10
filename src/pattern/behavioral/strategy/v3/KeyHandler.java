package pattern.behavioral.strategy.v3;

public class KeyHandler implements CarOpenHandler {

	@Override
	public void action() {
		System.out.println("# 자동차 키로 문열기에 성공 했습니다.!!");
	}

}