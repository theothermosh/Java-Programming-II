
public class Human implements Comparable<Human> {

    private int wage;
    private String name;

    public Human(String name, int wage) {
        this.name = name;
        this.wage = wage;
    }

    public String getName() {
        return name;
    }

    public int getWage() {
        return wage;
    }

    @Override
    public int compareTo(Human arg0) {
        return arg0.getWage() - this.getWage();
    }

    @Override
    public String toString() {
        return name + " " + wage;
    }
}
