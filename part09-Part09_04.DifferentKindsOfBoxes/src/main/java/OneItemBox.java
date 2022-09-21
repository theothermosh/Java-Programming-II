
import java.util.ArrayList;

public class OneItemBox extends Box {
    private ArrayList<Item> items = new ArrayList<>();
    
    public OneItemBox() {
    }

    @Override
    public void add(Item item) {
        if (this.items.isEmpty()) {
            this.items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return this.items.contains(item);
    }
}
