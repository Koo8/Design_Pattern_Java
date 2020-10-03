package AbstractFactoryPattern;

/*This can be an abstract class, therefore AbstractFactoryPattern is named */

public interface ShapeFactoryInterface {
    Shape getAShape(String shapeType);
}
