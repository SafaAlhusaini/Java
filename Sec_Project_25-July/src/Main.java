import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //logical operator
//        System.out.println(true && true || false || true && false);
//        System.out.println(!(!(true && false) || false) || true && false || true);

        //--------------------------------//

        // Cond
//        int x = 10;
//        int y = 50;
//        if(x > y)
//        {
//            System.out.println("x is larger than y");
//        }
//        else
//        {
//            System.out.println("y is larger than x");
//        }
        //---------
//        int x = 10;
//        int y = 50;
//        if(x > y)
//        {
//            System.out.println("x is larger than y");
//        }
//        else if(x == y)
//        {
//            System.out.println("equal");
//        }
//        else
//        {
//            System.out.println("error");
//        }
        //---------Task 1
//        Scanner read = new Scanner(System.in);
//
//        System.out.println("Enter first No : ");
//        int x = read.nextInt();
//
//        System.out.println("Enter Sec No : ");
//        int z = read.nextInt();
//
//        System.out.println("Enter Thir No : ");
//        int y = read.nextInt();
//
//        if( x > y && x > z)
//        {
//            System.out.println("X is the grater" );
//        }
//        else if( z > x && z > y)
//        {
//            System.out.println("Z is the grater ");
//        }
//        else{
//            System.out.println("Y is the grater");
//        }

        //---------- Task 2

//        Scanner read = new Scanner(System.in);
//
//        System.out.println("enter the grade 1 :" );
//        double grade1 = read.nextDouble();
//        System.out.println("enter the grade 2 :" );
//        double grade2 = read.nextDouble();
//        System.out.println("enter the grade 3 :" );
//        double grade3 = read.nextDouble();
//        System.out.println("enter the grade 4 :" );
//        double grade4 = read.nextDouble();
//        System.out.println("enter the grade 5 :" );
//        double grade5 = read.nextDouble();

//        double Total_Grade = (grade1 + grade2 + grade3 + grade4 + grade5) /5;
//
//        if(Total_Grade >= 90 && Total_Grade <= 100)
//        {
//            System.out.println("Your grade is A " + Total_Grade);
//        }
//        else if(Total_Grade >= 75 && Total_Grade <= 85)
//        {
//            System.out.println("Your grade is B "+ Total_Grade);
//        }
//        else if(Total_Grade >= 65 && Total_Grade <= 75)
//        {
//            System.out.println("Your grade is C "+ Total_Grade);
//        }
//        else {
//            System.out.println(" retake (- _ -) "+ Total_Grade);
//        }

        //----------------------------------------Task 3

//        Scanner read = new Scanner(System.in);
//
//        System.out.println("chose the opre * , - , + , /" );
//        String op = read.next();
//
//        System.out.println("Enter 1 No :");
//        int No1 = read.nextInt();
//
//        System.out.println("Enter 2 No :");
//        int No2 = read.nextInt();
//
//        if(op.equals("+"))
//        {
//            System.out.println("the result is " + (No1 + No2));
//        }
//        else if(op.equals("*"))
//        {
//            System.out.println("the result is "+ (No1 * No2));
//        }
//        else if(op.equals("-"))
//        {
//            System.out.println("the result is " + (No1 - No2));
//        }
//        else
//        {
//            System.out.println("the result is " + (No1 / No2));
//        }
        //------------------
        Scanner read = new Scanner(System.in);

        System.out.println("chose the 2 operator * , - , + , /" );
        String op = read.next();
        String op2 = read.next();

        System.out.println("Enter 1 No :");
        int No1 = read.nextInt();

        System.out.println("Enter 2 No :");
        int No2 = read.nextInt();

        System.out.println("Enter 3 No :");
        int No3 = read.nextInt();

        if(op.equals("+") && op2.equals("-") || op.equals("+") && op2.equals("*") || op.equals("+") && op2.equals("/"))
        {
            System.out.println("the result is " + (No1 + No2 - No3));
        }
        else if(op.equals("*") && op2.equals("-") || op.equals("+") && op2.equals("*") || op.equals("+") && op2.equals("/"))
        {
            System.out.println("the result is "+ (No1 * No2));
        }
        else if(op.equals("-"))
        {
            System.out.println("the result is " + (No1 - No2));
        }
        else
        {
            System.out.println("the result is " + (No1 / No2));
        }
        //---------------------25-July--------------//
    }
}