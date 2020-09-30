package Singleton1;

public class TrackNumberMain {
    public static void main(String[] args) {
        // to prove we can only create one TrackNumber instance
        TrackNumber numA = TrackNumber.getInstance();
        TrackNumber numB = TrackNumber.getInstance();

        numA.x = numA.x * 2;
        System.out.println(numB.x); // numB.x turns to be 20, both numA and numB point to the same object

    }


}
