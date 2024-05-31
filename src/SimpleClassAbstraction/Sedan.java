package SimpleClassAbstraction;

public class Sedan extends Car{
    @Override
    public void start() {
        System.out.println("Start driving with Sedan");
    }

    @Override
    public void stop() {
        System.out.println("Stop driving with Sedan");
    }

    @Override
    public void drive() {
        System.out.println("Drive with Sedan");
    }
}
