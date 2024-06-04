import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        String x =  "hello";
        System.out.println(x.substring(2));

        int [] y = {2,9,8,6,25,7,5,3,9};
        System.out.println(y[y.length-1]);
        int sum = 0;
        for(int i = 0; i < y.length; i++){
            sum+=y[i];
            if (sum > 50) {
                System.out.println(i);
                break;
            }
        }
        System.out.println(sum);
    }

    public static void prime() {
        Scanner s = new Scanner(System.in);
        System.out.print("How many of the first n number of prime number would you like to see: ");
        int x= s.nextInt();
        int count = 0; int index = 1;
        boolean y = false;
        while(count != x){
            for(int i = 2; i < index -1; i++) if(index % i == 0) y=y||true;

            if(!y){
                System.out.println(index);
                count++;
            }
            index++;
            y = false;
        }
    }

    public static void evenSum (){
        int sum=0;
        for(int i = 1; i <= 50; i++) sum+=(i*2);
        System.out.println(sum);

    }

    public static void leapYears(int start, int end){
        int sum = 0;
        for(int i =start; i<= end;i++) if(i%4 ==0) sum+=1;
        System.out.println(sum);
    }
}
