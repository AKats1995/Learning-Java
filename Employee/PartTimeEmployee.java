public class PartTimeEmployee extends Emploeey {
    private double hours ; 
    private double hourlyWage;
    public PartTimeEmployee (String name, double hours , double hourlyWage){
        super(name, 0);
        this.hours = hours;
        this.hourlyWage =  hourlyWage;}

        public void setHours (double hours){
            this.hours =hours;

        }
        public double getHours (){
            return hours;
        }

        public void setHourlyWage(double hourlyWage){
            this.hourlyWage =  hourlyWage;}
        public double getHourlyWage (){
            return hourlyWage;
        }
        @Override
        public double calculateSalary() {
            return hours*hourlyWage ;
        }

        public void displaymessage(){
        System.out.println("Name : " + getName());
        System.out.println("Salary : " + calculateSalary());
    }

}
