
public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        
        if (!(obj instanceof Item)) {
            return false;
        }
        
        Item compared = (Item) obj;
        
        return (this.name.equals(compared.name));
    }

    @Override
    public int hashCode() {
        return (55 + Integer.valueOf(this.name.charAt(0)) / 3) * 7;
    }
}
