
import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable {
    private List<Movable> movables;

    public Herd() {
        movables = new ArrayList<>();
    }

    @Override
    public String toString() {
        String herdString = "";
        for (Movable movable : movables) {
            herdString += movable;
            herdString += "\n";
        }
        
        return herdString;
    }
    
    public void addToHerd(Movable movable) {
        movables.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable movable : movables) {
            movable.move(dx, dy);
        }
    }
}
