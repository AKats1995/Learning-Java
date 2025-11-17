import java.util.Scanner;
public class temperatureConverter {
       public static void main (String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want Cel of Farh");
        String metro = scanner.nextLine();
        System.out.println("What is the temperature");
        double temperature = scanner.nextDouble();
        double Fahrenheit;
        double Celsius;
         if (metro.equals("Cel")){
            Fahrenheit = (temperature *9/5)+32;
            System.out.println("The temperature in Fahrenheit is : "+Fahrenheit);
        }
        else {
            Celsius = (temperature - 32) * 5/9;
            System.out.println("The temperature in Fahrenheit is : "+Celsius);
        }
        

    }

    
}
