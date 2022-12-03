package module1;

public class Student {
    private int id;
    private String name;
    private String contact;
    private double percentage;

    public Student()
    {
        System.out.printf("This is default Constructor");
    }

    public Student(int id, String name, String contact, double percentage){
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.percentage = percentage;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", contact=" + contact +
                ", percentage=" + percentage +
                '}';
    }
}