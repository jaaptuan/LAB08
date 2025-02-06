package Lab08.Check2;

public class Square extends GeometricObject implements Colorable{
    private double side ;

    public Square(double side) {
        this.side = side ;
    }

    public double getSide() {
        return side ;
    }

    public void setColor(double side) {
        this.side = side ;
    }

    @Override
    public double getArea() {
        return side * side ;
    }

    @Override
    public double getPerimeter() {
        return 4 * side ;
    }

    
    public void howtoColor() {
        System.out.println("Color all four side.");
    }
    
}
