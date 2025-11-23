public class Shape {
    public String name;
 
    
    public  Shape (String name){
        this.name = name;
    } 
    public void setname (String name){
        this.name = name;
    }
    public String getname(){
        return name;        
    }
    public double CalculateArea(){
        return 0;       
    }
    public double CalcularePerimeter(){
        return 0;
    }
    public void displaymessage (){
        System.out.println("the name is : " + name);
        System.out.println("The emb is : " + CalculateArea());
        System.out.println("The perimeter is : " + CalcularePerimeter());
    }

}