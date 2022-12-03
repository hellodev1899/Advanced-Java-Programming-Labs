package module5;

public class SajhaYatayat extends FactoryBus{
    public SajhaYatayat() {
    }

    SajhaYatayat(int capacity){
        this.capacity = capacity;
    }

    @Override
    void color() {
//        super.color();
        System.out.println("\nGreen Sajha Color");
    }

    void minimumCharge(){
        System.out.println("Minimum Charge is Rs.17");
    }

    void capacity(){
        System.out.printf("capacity is: %d", capacity);
    }
}
