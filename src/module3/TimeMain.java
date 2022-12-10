package module3;

public class TimeMain {
    public static void main(String[] args) throws Exception {
        TimeOne t1 = new TimeOne();
        try {
            System.out.println("Invalid Time Input");
            t1.setTime(13, 10, 22);
            displayTime("Show Time", t1);
            System.out.println("Valid Time Input");
            t1.setTime(2,45,00);
            displayTime("Show Time", t1);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }

    private static void displayTime(String title, TimeOne time) {
        System.out.printf("%s%n Universal Time:%s%n Standard Time:%s%n", title, time.toUnivarsalString(), time.toString());
    }
}