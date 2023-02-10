package pattern.behavioral.strategy.v3;

public class VoiceHandler implements CarOpenHandler {

	@Override
	public void action() {
		System.out.println("# 음성인식으로 문열기에 성공 했습니다.!!");
	}

}