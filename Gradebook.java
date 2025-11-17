import java.util.Scanner;
public class Gradebook {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give my the grade of your 1st lesson");
        double grade1 = scanner.nextDouble();
        System.out.println("Give my the grade of your 2nd lesson");
        double grade2 = scanner.nextDouble();
        System.out.println("Give my the grade of your 3rd lesson");
        double grade3 = scanner.nextDouble();
        System.out.println("Give my the grade of your 4th lesson");
        double grade4 = scanner.nextDouble();
        System.out.println("Give my the grade of your 5th lesson");
        double grade5 = scanner.nextDouble();
        double total = 0;
        int count = 0;
        int underbase = 0;
        double [] grade = {grade1,grade2,grade3,grade4,grade5};
        double max = grade[0];
        double min = grade[0];

        for ( int i =0; i< grade.length; i++ ){
            if (grade[i] < 10){
                underbase = i +1;}
            if (grade[i]> max) {
                max = grade[i];}
            if (grade[i]< min) {
                min = grade[i] ;}
            total += grade[i] ;
            count = i + 1 ;
        }
        double avg =  total / count;

        System.out.println("You average mark is : "+avg);
        System.out.println("You min mark is : "+ min);
        System.out.println("You Max mark is : "+ max);
        System.out.println("You marks under base are : "+ underbase);


    }

}
