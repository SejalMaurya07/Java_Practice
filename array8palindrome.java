public class array8palindrome {
    public static void main(String args[]) {
        System.out.println("Welcome here ! You can check that your array is palindrome or not .");
        int arr[] = display.fillarray();
        display.display1(arr);

        System.out.println();
        boolean ispalindrom = checkpalindrom(arr);
        if (ispalindrom) {
            System.out.println("Your array is palindrone ! ");
        } else {
            System.out.println("Your array is not a palindrome ! ");
        }
    }

    public static boolean checkpalindrom(int arr[]) {
        int i = 0;
        while (i < arr.length / 2) {
            if (arr[i] != arr[arr.length - i - 1]) {
                return false;
            }
            i++;
        }
        return true;
    }


//        int newarray[] =reverse(arr);
//        System.out.println();
//        display.display1(newarray);
//        System.out.println();
//        int num=checki(arr,newarray);
//        if(num==arr.length){
//            System.out.println("Your array is palindrone !");
//        }
//        else{
//            System.out.println("Your array is not a palindrome!");
//        }

//    public static int[] reverse(int arr[]){
//        int newarray[]=new int[arr.length];
//        for(int i=0;i<arr.length;i++){
//            newarray[i]=arr[arr.length-i-1];
//        }
//        return newarray;
//    }
//
//    public static int checki(int array[],int newarray[]){
//        int i=0;
//        while(i<array.length){
//            if (array[i]==newarray[i]){
//                i++;
//            }
//            else{
//                break;
//            }
//        }
//        return i;
//    }
}

