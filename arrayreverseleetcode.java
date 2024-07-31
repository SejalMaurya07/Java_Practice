public class arrayreverseleetcode {
    public static int reverse(int x) {
        int sum=0;
        if(x>0){
            while(x>0){
                System.out.println(sum);
                int rem=x%10;

                sum=sum*10+rem;
                x=x/10;
                System.out.println(rem);
                System.out.println(x);
                System.out.println(sum);
            }
            return sum;
        }
        else{
            int num=x*2;
            x=x-num;
            while(x>0){
                int rem=x%10;
                sum=sum*10+rem;
                x=x/10;
            }

        }

        return -sum;
    }

    public static void main(String args[]){
        int x=1534236469;
        System.out.println( reverse(x));

    }
}