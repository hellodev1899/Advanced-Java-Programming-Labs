package module1;

public class StudentMain {
    public static void main(String[] args) {
        Student stu1 = new Student(1, "Abhishek", "982035321", 75.00);
        Student stu2 = new Student(2, "Sushil", "2349872123", 80.50);

        System.out.printf(stu1.toString());
        System.out.printf(stu2.toString());

        Student higher = (stu1.getPercentage() > stu2.getPercentage()) ? stu1 : stu2;
        System.out.printf("\nStudent with higher percentage: %s with %.2f", higher.getName(), higher.getPercentage());
        ;
    }
//      alt+insert to add constructors and other with ease
//      alt+ctrl+l to format the code
//      psvm to generate public static void main
//      sout to generate system.out.printf
}