package task1;

public class Tray20 extends Tray{

    @Override
    public void process(int price) throws IllegalArgumentException {
        System.out.println(price/ 20 + " * 20");
        Tray next = getNext();
        if (price % 20 > 0 && next == null) {
            throw new IllegalArgumentException();
        }
        else if(next != null){
            getNext().process(price % 20);
        }
    }
}
