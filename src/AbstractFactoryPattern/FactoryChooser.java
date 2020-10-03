package AbstractFactoryPattern;

public class FactoryChooser {
    public static ShapeFactoryInterface getFactoryType(boolean rounded){
        if(rounded){
            return new RoundedShapeFactory();
        }else{
            return new UnroundedShapeFactory();
        }
    }
}
