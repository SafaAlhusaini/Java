import java.util.Scanner;


public class Main {
    public static void main(String[] args)
    {


//        int [] array = new int[] {5,6,3,2,1};
//        int array2;
//        for (int i =0; i < array.length ; i++)
//        {
//            for (int j=i ; j < array.length; j++)
//            {
//                if(array[i]> array[j])
//                {
//                    array2 = array[i];
//                    array[i] = array[j];
//                    array[j]=array2;
//
//                }
//            }
//
//        }
//        for ( int a:array ) {
//            System.out.print(a + " " );
//        }


//-----------------------------------------------------------------------------------

        int[] nums = {-3, 4, 1, 1};
        int n = nums.length;
        for (int i = 0; i < n; i++)
        {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                System.out.println(i + 1);
                break;
            }
        }


    }
}