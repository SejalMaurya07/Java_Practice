import java.util.Scanner;

public class ArrayUtility {


        public static int[] arrayfil() {
            Scanner input = new Scanner(System.in);
            System.out.println("enter the size of the array : ");
            int size = input.nextInt();
            int arr[] = new int[size];
            for (int i = 0; i < size; i++) {
                System.out.print("enter the element : ");
                int val = input.nextInt();
                arr[i] = val;
            }
            return arr;
        }

    }



