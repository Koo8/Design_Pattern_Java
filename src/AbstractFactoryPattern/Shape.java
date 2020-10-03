package AbstractFactoryPattern;

/**
 * There concrete classes implement this interface RoundedRectangle,
 * RoundedSquare and Rectangle -
 * they all need to draw their own shape
 */
public interface Shape {
    void draw();
}
