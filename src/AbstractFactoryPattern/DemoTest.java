package AbstractFactoryPattern;

/**
 * There are 4 types of shape(interface) to be able to draw
 * Drill down path:
 *  1. round or unrounded, - interface ShapeFactoryInterface
 *  2. square or rectangle -
 */

public class DemoTest {
    public static void main(String[] args) {
        // Rectangle
        Shape rec = new FactoryChooser().getFactoryType(false).getAShape("Rectangle");
        rec.draw();
        Shape roundedSquare = new FactoryChooser().getFactoryType(true).getAShape("Square");
        roundedSquare.draw();
    }
}
