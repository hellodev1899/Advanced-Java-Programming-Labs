package module5;

public class FactoryBus {
    protected int capacity;
    protected String name = "Factory Bus 002";

    FactoryBus() {
        System.out.println("Manufactured date: 12/12/12");
    }

    void engineCheck()
    {
        System.out.printf("%s ready to go", name);
    }

    void applyBrake()
    {
        System.out.println("\nBrake applied and working");
    }

    void color(){
        System.out.println("Default color");
    }
}
