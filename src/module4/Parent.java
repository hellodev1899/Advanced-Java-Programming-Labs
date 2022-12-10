package module4;

public class Parent {
    int p;

    public Parent() {
        System.out.println("Parent Constructor");
    }

    public Parent(int p) {
        System.out.println("Print Parameterized constructor:" + p);
    }

    public int getP() {
        return p;
    }

    public void setP(int p) {
        System.out.println("setting p in parent");
        this.p = p;
    }

    public void printValue()
    {
        System.out.println("Parent Method");
    }
}
