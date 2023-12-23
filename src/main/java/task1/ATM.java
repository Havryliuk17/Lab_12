package task1;

public class ATM {
    public static void main(String[] args) throws IllegalAccessException {
        Tray tray1 = new Tray1();
        Tray tray20 = new Tray20();
        Tray tray50 = new Tray50();

        tray50.setNext(tray20);
        tray50.process(50);
    }
}