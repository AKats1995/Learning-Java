
public class Emploeey {
    private String name;
    private double basesalary;
    public Emploeey(String name, double basesalary){
       this.name =name;
       this.basesalary = basesalary;}

       public void setName(String name){
        this.name = name;}
        public String getName(){
            return name;
        }
       
        public void setSalary (double basesalary){
            this.basesalary = basesalary;
        }
        public double getSalary (){
            return basesalary;
        }
        public double calculateSalary (){
            return basesalary;
        }
        public void displaymessage(){
            System.out.println("Name : "+getName());
            System.out.println("Salary : "+ calculateSalary());
            
        }


    }






