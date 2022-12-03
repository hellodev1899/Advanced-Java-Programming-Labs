package module5;

public class NepalYatayat extends FactoryBus {
    public NepalYatayat() {
    }

    @Override
    void color() {
//        super.color();
        System.out.println("\nNY Color");
    }

    void capacity(int capacityInput){
        capacity = capacityInput;
        System.out.printf("Bus capacity is: %d", capacityInput);
    }

    void minimumCharge(){
        System.out.println("Minimum Charge is Rs.20");
    }
}
