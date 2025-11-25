public class EmployeeTest {
    public static void main (String arg[]){
        Emploeey e1 = new Emploeey("Aris", 1250);
        FullTimeEmployee e2 = new FullTimeEmployee ("Panos", 850,200);
        PartTimeEmployee e3 = new PartTimeEmployee ("Nikos",120,5);
       Emploeey[] employees = { e1, e2, e3 };

       System.out.println ("1st " + e1.getName()+ " "+e1.calculateSalary());
       System.out.println ("2nd " + e2.getName()+ " "+e2.calculateSalary());
       System.out.println ("3rd " + e3.getName()+ " "+e3.calculateSalary());
    }
}

