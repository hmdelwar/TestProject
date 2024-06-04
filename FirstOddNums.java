import java.util.Scanner;
interface FuncInterface
{
    // An abstract function
    void abstractFun(int x);

    // A non-abstract (or default) function
    default void normalFun()
    {
        System.out.println("Hello");
    }
}

public class FirstOddNums {



    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] nums = {2,6,9,8,2,2,3,6,2,2,7,47,8,4,7,2,9,6,0,2,6,2,2,8,5,0,21,3,37,25,326,4,65};

        int[] nums2 = {2,6,9,8,2,2,3,6,2,2,7,47,8,4,7,2,9,6,0,2,6,2,2,8,5,0,21,3,4743};
        biggerArray(nums, nums2);

        //int x = 3478875;
        String y = "hello";
        System.out.println(y.substring(0,3));




        /*
        System.out.print ("How many n number of odd numbers would you like? ---> ");
        int n = s.nextInt();

        for(int i = 0; i < n; i++) System.out.println((i*2)+1); //for loop

        int i = 0; //do while loop
        do{
            System.out.println((i*2)+1);
            i++;
        } while(n !=i);


        int[] nums = {2,6,9,8,2,3,6,2};
        int counter =0;
        for( int i = 0; i < nums.length; i++) if (2== nums[i]) counter++;
        System.out.println(counter);


         */
        System.out.println(arraySum(nums));


        for(int i = 0; i< nums.length-1; i++){
            if( nums[i] == nums[i+1] && nums[i] == 2)System.out.println("The indexes are " + i + " and "+(i+1));
        }


        System.out.println(retmaxVal(1, 2));
        System.out.println(retmaxVal(3, 2));
        sqr(5);

        FuncInterface fobj = (int x)->{System.out.println(x*x);
            System.out.println(x+x);};
        fobj.abstractFun(5);
        fobj = (int x)->{System.out.println(9+9);
            System.out.println(2+2);};
        fobj.abstractFun(5);

    }
    public static void sqr (int a){
        System.out.println(a*a);
    }
    public static void maxVal (int a, int b){
        if(a > b) System.out.println(a);
        else System.out.println(b);
    }
    public static int retmaxVal (int a, int b){
        if(a > b) return a;
        else return b;
    }
    public static int arraySum (int [] x){
        int sum = 0;
        for(int i = 0; i< x.length; i++) sum+=x[i];
        return sum;
    }

    public static void bigegerArray (int [] x, int [] y){
        System.out.print("the bigger array is: {");
        if(x.length> y.length) for(int i=0; i <x.length; i++)System.out.print(x[i]+", ");
        else for(int i=0; i <y.length; i++) System.out.print(y[i]+", ");
        System.out.println("}");
    }
    public static void biggerArray (int [] x, int [] y){
        if(x.length> y.length) System.out.println("the first array is bigger");
        else System.out.println("The second array is bigger");
    }

}
