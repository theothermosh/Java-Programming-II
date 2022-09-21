
public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }

        if (object == this) {
            return true;
        }

        LicensePlate compared = (LicensePlate) object;

        return this.liNumber.equals(compared.liNumber) && this.country.equals(compared.country);
    }

    @Override
    public int hashCode() {
        return 55 + (Integer.valueOf(this.liNumber.charAt(0)) / 7);
    }
}
