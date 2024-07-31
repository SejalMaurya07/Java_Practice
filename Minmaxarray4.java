import java.util.Scanner;

class Minmaxarray4 {
    public static void main(String args[]){
        System.out.println("Welcome to find Minimax and Maximum of the array");
        int arr[]=ArrayUtility.arrayfil();
        System.out.println("The maximum number in the array is :" +max(arr));
        System.out.println("The minimum number in the array is :"+min(arr));


    }

    public static int max(int arr[]){
        int max=arr[1];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[2]){
                max=arr[i];
            }
        }
       return max;
    }

    public static int min(int arr[]){
        int min =arr[1];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<arr[1]){
                min=arr[i];
            }
        }
        return min;
    }


}

