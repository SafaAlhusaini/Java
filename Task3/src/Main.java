import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//Task 1
//        int rows=5;
//
//        for (int i= 0; i<= rows; i++)
//        {
//
//            for (int j=1; j<=rows-i; j++)
//            {
//                System.out.print(" ");
//            }
//            for (int s=0;s<=i;s++)
//            {
//                System.out.print("*");
//            }
//            System.out.println("");
//        }


        Scanner read = new Scanner(System.in);

        System.out.println("Calculator");
for( int i = 0 ; i < 10 ; i++) {
    System.out.println("Chose your Operator : * ,/ ,+, -");
    String Operator = read.next();

    System.out.println("Enter number :");
    int num1 = read.nextInt();

    System.out.println("Enter number :");
    int num2 = read.nextInt();

    switch (Operator) {
        case "+":
            System.out.println(" Total = " + num1 + num2);
            break;
        case "-":
            System.out.println(" Total = " + (num1 - num2));
            break;
        case "*":
            System.out.println(" Total = " + num1 * num2);
            break;
        case "/":
            if (num2 == 0) {
                System.out.println("warning cant divided by 0 ");
            } else {
                System.out.println(" Total = " + num1 / num2);
            }
            break;
        case "0":

            break;
        default:
            System.out.println("there is no " + Operator + " like this");
            System.out.println(" write Exit if you want to exit ");
            String exit = read.next();
            if (exit.equals("Exit"))
            {
                System.out.println("See you next time");
            }
            break;

}
    System.exit(0);

            // code block
        }

    }


}
