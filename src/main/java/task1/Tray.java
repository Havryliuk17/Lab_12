package task1;

import lombok.Getter;
import lombok.Setter;

public abstract class Tray {
    @Getter @Setter
    private Tray next;

    public abstract void process(int price) throws IllegalArgumentException;
}