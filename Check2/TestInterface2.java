package Lab08.Check2;

public class TestInterface2 {
    public static void main(String[] args) {
        GeometricObject[] object = {new Square(2) , new Square(3) , new Square(4.5) 
                                    , new Square(5) , new  Square(6)} ;
        
        for(int i = 0 ; i < object.length ; i++) {
            System.out.println("Area os oject is : " + object[i].getArea()) ;
    
            if (object[i] instanceof Colorable) {
            ((Colorable)object[i]).howtoColor();
            }
        }
    }
}


