package pattern.behavioral.strategy.v3;

public class AppHandler implements CarOpenHandler {

	@Override
	public void action() {
		System.out.println("# 스마트폰 앱으로 원격 문열기 성공 했습니다.!!");
	}

 
}