package module5;

public class BusMain {
    public static void main(String[] args) {
        FactoryBus bus1 = new FactoryBus();
        bus1.engineCheck();
        bus1.applyBrake();
        bus1.color();
        System.out.println("----------------------------");
        NepalYatayat ny = new NepalYatayat();
        ny.name = "Nepal Yatayat";
        ny.engineCheck();
        ny.applyBrake();
        ny.minimumCharge();
        ny.capacity(27);
        ny.color();
        System.out.println("----------------------------");
        SajhaYatayat sy = new SajhaYatayat(40);
        sy.name = "Sajha Yatayat";
        sy.engineCheck();
        sy.applyBrake();
        sy.minimumCharge();
        sy.capacity();
        sy.color();
    }
}
