package pattern.behavioral.strategy.v3;

public class App {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        CarSystem cs = new CarSystem();
        // 안전 장치 동작을 위한 모드는 센서 시스템쪽에서 해당 조건이 되면 전달한다고 가정한다.
        
        Class<?> classz = null;
        String defaultClassName = "pattern.behavioral.strategy.v3.";
        String classname = "";
        
        classname = defaultClassName + "KeyHandler";
		classz = Class.forName(classname);
        cs.open((CarOpenHandler)classz.newInstance());

        classname = defaultClassName + "VoiceHandler";
		classz = Class.forName(classname);
		cs.open((CarOpenHandler)classz.newInstance());

		classname = defaultClassName + "AppHandler";
		classz = Class.forName(classname);
		cs.open((CarOpenHandler)classz.newInstance());
    }
}
