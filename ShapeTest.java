public class ShapeTest {
    public static void main(String[] args) {
        Rectangle R1= new Rectangle(3,4);
        Rectangle R2= new Rectangle(3.3,4.5);
        Circle C1= new Circle(5,3);
        Circle C2= new Circle(5.5,3.3);

        Shape[] shapes= {R1,R2,C1,C2};

        for (Shape s  : shapes ) {
            System.out.println("---------------------");
            s.displaymessage();
        }
    }
}
