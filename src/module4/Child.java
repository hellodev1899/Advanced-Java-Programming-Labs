package module4;

public class Child extends Parent {
    int c;

    public Child() {
        System.out.println("Child Constructor");
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        System.out.println("Setting C in Child");
        this.c = c;
    }
}
