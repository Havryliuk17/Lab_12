package task1;

public class Tray50 extends Tray {
    @Override
    public void process(int price) throws IllegalArgumentException {
        System.out.println(price / 50 + " * 50");
        Tray next = getNext();
        if (price % 50 > 0 && next == null) {
            throw new IllegalArgumentException();
        }
        else if (next != null) {
            getNext().process(price % 50);
        }
    }
}
