public class CD implements Packable {
    private String artist;
    private String name;
    private int pubYear;
    private final double weight = 0.1;

    public CD(String artist, String name, int pubYear) {
        this.artist = artist;
        this.name = name;
        this.pubYear = pubYear;
    }

    @Override
    public double weight() {
        return weight;
    }

    @Override
    public String toString() {
        return artist + ": " + name + " (" + pubYear + ")";
    }
}
