import java.util.Scanner;

public class array1 {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size=input.nextInt();
        array(size);
    }

    public static void array(int num){
        Scanner input=new Scanner(System.in);
        int arr[]=new int[num];
        for(int i=0;i<num;i++){
            System.out.println("Enter the value of the arraylist");
            int val=input.nextInt();
            arr[i]=val;
        }

        for(int i=0;i<num;i++){
            System.out.println(arr[i]);
        }
    }
}
