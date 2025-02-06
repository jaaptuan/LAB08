package Lab08;

public class TestInterface1 {
    public static void main(String[] args) {
        ComparableCircle circle1 = new ComparableCircle(5) ;
        ComparableCircle circle2 = new ComparableCircle(15) ;

        int flag = circle1.compareTo(circle2) ;
        switch (flag) {
            case 1 :
                System.out.println("The max circle's radius is " + circle1.getRadius()) ;
                break ;
        
            case -1 :
                System.out.println("The max circle's radius is " + circle2.getRadius()) ;
                break ;
            case 0 :
                System.out.println("Both circle are have the same radius.");
        }
    }
}
