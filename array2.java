import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=input.nextInt();
        array(size);

    }

    public static void array(int num){
        Scanner input=new Scanner(System.in);
      int [] marks=new int[num];
        for(int i=0;i<num;i++){
            System.out.println("enter the value");
            int val=input.nextInt();
            marks[i]=val;
        }
        for(int i=0;i<num;i++){
            System.out.println("Value is " +marks[i]);
        }
        System.out.println("enter the target value which you want to find");
        int target=input.nextInt();
        find(num,target,marks);
    }


    public static void find(int num, int target, int marks[]){
        boolean found=false;
        for(int i=0;i<num;i++){
            if(marks[i]==target){
                found=true;
                System.out.println("The value is present at index of : " +i);
                break;
            }
        }
        if(!found){
            System.out.println("The target value is not present");
        }
    }
}
