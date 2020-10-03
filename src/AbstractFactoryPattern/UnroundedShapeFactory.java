package AbstractFactoryPattern;

public class UnroundedShapeFactory implements ShapeFactoryInterface {
   
    @Override
    public Shape getAShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
