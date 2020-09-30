package Singleton1;

import javax.sound.midi.Track;

public class TrackNumber {  // singleton class
    public int x = 10;
    // method 1 - this is thread safe
    public static TrackNumber instance = new TrackNumber();
    private TrackNumber() { } // private constructor not accessible outside this sigleton class
    public static TrackNumber getInstance() {
        return instance;
    }



    // method 2 - lazy instantiation - not thread safe
//    public static TrackNumber antherInstance = null;
//    private TrackNumber() {} // private constructor
//    public static TrackNumber getanotherInstance(){
//        if(antherInstance == null) {
//            antherInstance = new TrackNumber();
//        }
//        return antherInstance;
//    }
}
