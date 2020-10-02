package Singleton1;

/**
 * https://www.geeksforgeeks.org/java-singleton-design-pattern-practices-examples/?ref=lbp
 */

public class TrackNumber {  // singleton class
    public int x = 10;
    // method 1 eager initiation- this is thread safe
    public static TrackNumber instance = new TrackNumber();

    private TrackNumber() {
    } // private constructor not accessible outside this sigleton class

    public static TrackNumber getInstance() {
        return instance;
    }

    // method 2 - lazy instantiation with double check locking mechanism
    public static TrackNumber antherInstance = null;

    public static TrackNumber getanotherInstance() {
        if (antherInstance == null) {
            synchronized (TrackNumber.class) {
                if (antherInstance == null)
                    antherInstance = new TrackNumber();
            }
        }
        return antherInstance;
    }

    // oo method 3 - inner class initiation - most widely used singleton creation - still lazy instantiation without synchronized() keyword
    // still private constructor
    //private TrackNumber (){}

    // create private inner class with a static variable INSTANCE
    private static class InnerClassForInstance {
        private static final TrackNumber INSTANCE = new TrackNumber();  // final keyword
    }

    public TrackNumber getTheInstance() {                                        
        return InnerClassForInstance.INSTANCE; // since both class and variable are static
    }
    
}
