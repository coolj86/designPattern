package pattern.behavioral.command;

public class App {
    public static void main(String[] args) {
        Invoker controller1 = new Invoker();
        controller1.setCommand(new OnCommand(new HeaterReceiver()),new OffCommand(new HeaterReceiver()));

        Invoker controller2 = new Invoker();
        controller2.setCommand(new OnCommand(new WiperReceiver()),new OffCommand(new WiperReceiver()));

        AppInvoker controller3 = new AppInvoker();
        controller3.setCommand(new OnCommand(new WiperReceiver()),new OffCommand(new WiperReceiver()));
        
        controller1.on();
        controller2.off();
        controller3.off();
    }
}