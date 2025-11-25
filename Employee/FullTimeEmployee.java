public class FullTimeEmployee extends Emploeey{

    private double bonus;
    
    public FullTimeEmployee(String name,double basesalary, double bonus){
        super(name, basesalary);
        this.bonus = bonus; }
    
    public void setBonus(double bonus){
        this.bonus = bonus;
    }
    public double getBonus (){
        return bonus;
    }
    @Override
    public double calculateSalary (){
    return getSalary() + bonus; }



    public void displaymessage(){
        System.out.println("Name : " + getName());
        System.out.println("Salary : " + calculateSalary());
    }






    



}
