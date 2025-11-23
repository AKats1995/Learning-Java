public class Circle extends Shape{
    private double radius;
    public Circle (double width, double height) {
        super("Circle");
        this.radius = radius; 
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public double CalculateArea(){  
        return 3.14 * radius * radius;
    }
    public double CalcularePerimeter(){
        return 2 * 3.14 * radius;

    }
        public void displaymessage(){
        System.out.println("the Shape is : " + getname());
        System.out.println("Area is : "+ CalculateArea());
        System.out.println("Perimeter is : "+ CalcularePerimeter());}


}