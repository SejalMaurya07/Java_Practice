public class array5 {
    public static void main(String[] args) {
        int arr[]=ArrayUtility.arrayfil();
//        System.out.println(increasesorted(arr));
//        System.out.println(decreaseorder(arr));

        boolean inc=increasesorted(arr);
        boolean dec=decreaseorder(arr);

        if(inc||dec){
            System.out.println("Your array is sorted");
        }
        else {
            System.out.println("Your array is not sorted");
        }

    }

    public static boolean increasesorted(int arr[]){
       int i=0;
       while(i<arr.length-1){
           if(arr[i]>arr[i+1]){
               return false;
           }
          i++;
       }
       return true;
    }

    public static boolean decreaseorder(int arr[]){
        int j=0;
        while(j < arr.length-1){
            if(arr[j]<arr[j+1]){
                return false;
            }
            j++;
        }
        return true;
    }
}
