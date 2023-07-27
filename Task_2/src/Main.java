import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
//--------------------------------------------- Task 1 25 - July
//        System.out.println("Exam Question");
//
//        String[] q = {"1. 2 + 2 =", "2. 2 + 3 =", "3. 2 + 4 = ", "4. 2 + 5 = ", "5. 2 + 6 = "};
//
//        int[] a = {4, 5, 6, 7, 8};
//
//        for (int i = 0; i <= 5; i++)
//        {
//            System.out.println(q[i]);
//            int x = read.nextInt();
//            if(a[i] == x){
//
//                System.out.println("Correct Answer ");
//            }
//            else {
//                System.out.println("wrong answer ");
//
//            }
//
//        }

        //----------------------------------- Task 2

//        System.out.println(" Morning Please log in ");
//
//        String user = "SafaAlhusaini@gmail.com";
//        String Password = "854933Ab";
//
//        System.out.println("write your Email : ");
//        String Email = read.next();
//
//        System.out.println("write your Password : ");
//        String Pass = read.next();
//
//         if (user.equals(Email) && Pass.equals(Password)) {
//             System.out.println(" Welcome To Our Gym System");
//         } else {
//             System.out.println(" There is something wrong ");
//         }
        //-----------------------------------------------------Task 3

        System.out.println(" Morning Please log in ");

        System.out.println("You Name  : ");
        String Name = read.next();

        System.out.println("write your Email : ");
        String Email = read.next();

        System.out.println("write your Password : ");
        String Pass = read.next();

        System.out.println("rewrite your Password : ");
        String Pass2 = read.next();

        System.out.println("Phone number");
        int phone = read.nextInt();

        System.out.println("Your Birth date dd/MM/year");
        String BD = read.next();


         if (Pass.equals(Pass2)) {
             System.out.println(" Welcome To Our Gym System");
         } else {
             System.out.println(" There is something wrong ");
         }
    }
}