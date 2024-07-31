public class arrayleetcode {

    public static void main(String args[]){
        int nums[]={1,2,3,4,5};
        int target=8;
        int newarray[]=twoSum(nums,target);
        display.display1(newarray);
    }

    public static int[] twoSum(int[] nums, int target) {
        int newarray[]=new int[2];
        int k=0;
        for(int i=0;i<nums.length;i++){
           for(int j=i+1;j<nums.length;j++){
               if(nums[i]+nums[j]==target){
                   newarray[k]=i;
                   newarray[k+1]=j;

               }

            }
        }
        return newarray;
    }



}
