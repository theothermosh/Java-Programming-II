public class Hideout<T> {
    private T object;

    public Hideout() {
    }
    
    public void putIntoHideout(T toHide) {
        object = toHide;
    }
    
    public T takeFromHideout() {
        T toReturn = object;
        object = null;
        
        return toReturn;
    }
    
    public boolean isInHideout() {
        boolean toReturn = object == null ? false : true;
        
        return toReturn;
    }
}
