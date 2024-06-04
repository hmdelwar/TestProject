import java.util.Scanner;
public class FirstClass {
    public static void main (String [] args){
            /*Scanner sc = new Scanner(System.in);
            System.out.print("Enter starting number: ");
            int x = sc.nextInt();
            System.out.println("Enter ending number: ");
            int y = sc.nextInt();
            for(int i = x; i <= y; i++){
                if(i%3 == 0) System.out.println(i);
            }

             */

        Scanner a = new Scanner(System.in);
        System.out.print("Welcome to calculator!");
        boolean exit = true; int num1 = 0, num2 = 0;
        while(exit) {
            System.out.println("Please enter your operation from the menu\n1 - Addition       2 - Subtraction\n3 - Multiplication 4 - Division\n5 - Exit");
            int op = a.nextInt();
            if (op >=1 && op <=4){
                System.out.print("\nEnter number a: ");
                num1 = a.nextInt();
                System.out.print("\nEnter number b: ");
                num2 = a.nextInt();
            }
            int result;
            switch (op) {
                case 1:
                    System.out.println(num1+" + "+num2+" = "+ (num1+num2));
                    break;
                case 2:
                    System.out.println(num1+" - "+num2+" = "+ (num1-num2));
                    break;
                case 3:
                    System.out.println(num1+" * "+num2+" = "+ (num1*num2));
                    break;
                case 4:
                    System.out.println(num1+" / "+num2+" = "+ (num1/num2));
                    break;
                case 5:
                    exit = false;
                    System.out.println("goodbye");
                    break;
                default:
                    break;
            }
        }
    }
}
