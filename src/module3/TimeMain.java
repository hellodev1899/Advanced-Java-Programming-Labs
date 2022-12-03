package module3;

public class TimeMain {
    public static void main(String[] args) {
        TimeOne t1 = new TimeOne();
        t1.setTime(13, 10, 22);
        displayTime("Show Time", t1);
    }

    private static void displayTime(String title, TimeOne time) {
        System.out.printf("%s%n Universal Time:%s%n Standard Time:%s%n", title, time.toUnivarsalString(), time.toString());
    }
}