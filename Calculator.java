public class Calculator {public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to use Calculator Y/N ");
        String answer = scanner.nextLine();
        while (answer.equals("Y")) {
        System.out.println("Give me the First number: ");
        int number1 = scanner.nextInt();
        System.out.println("Give me the Second number: ");
        int number2 = scanner.nextInt();
        System.out.println("What do you want to do : +, −, *  or ÷) ");
        scanner.nextLine(); 
        String mark = scanner.nextLine();
        int total;
        switch (mark) {
            case "+":
            total = number1 + number2;
            System.out.println(total);
            break;
            case "-":
            total = number1 - number2;
            System.out.println(total);
            break;
            case "*":
            total = number1 * number2;
            System.out.println(total);
            break;
            case "/":
            if (number2 != 0  ) {
                total = number1 / number2;
                 System.out.println(total);}
            else{
                System.out.println("Dont Give 0");
            }
            break;
        }
        System.out.println("Do you want to continue the use of the Calculator Y/N ");
        answer = scanner.nextLine();

                
       }


            


    }

}

  

}
