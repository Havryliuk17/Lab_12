package task1;

public class Tray1 extends Tray {
    @Override
    public void process(int price) throws IllegalArgumentException {
        System.out.println(price + " * 1");
        Tray next = getNext();
        if(next != null){
            getNext().process(0);
        }
    }
}