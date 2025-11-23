public class Rectangle extends Shape{
    private double width;
    private double height;
    public Rectangle(double width, double height) {
        super("Rectangle");
        this.height = height;
        this.width = width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getWidth(){
        return width;

    }
    public void setHeight(double height){
        this.height = height;  
    }
    public double getHeight(){
        return height;
    }
    public double CalculateArea(){
        return (height*width);
    }
    public double CalcularePerimeter(){
        return (2*(height+width));
    }
    public void displaymessage(){
        System.out.println("the Shape is : " + getname());
        System.out.println("Area is : "+ CalculateArea());
        System.out.println("Perimeter is : "+ CalcularePerimeter());

    }



}