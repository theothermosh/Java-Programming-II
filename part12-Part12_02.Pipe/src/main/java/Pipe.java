import java.util.ArrayList;

public class Pipe<T> {
    ArrayList<T> items;

    public Pipe() {
        items = new ArrayList<>();
    }
    
    public void putIntoPipe(T value) {
        items.add(value);
    }
    
    public T takeFromPipe() {
        if (items.isEmpty()) {
            return null;
        }
        return items.remove(0);
    }
    
    public boolean isInPipe() {
        return !items.isEmpty();
    }
}
