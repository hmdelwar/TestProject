//Hossain Delwar
//Java Exam :D


import java.util.Scanner;
public class Exam1 {
    public static void main(String[] args) {
        int [] x = {3,4,5,5,7,8,22460,453,3,25,4,3,3,3,4,6,7,8,654,678,765,43,456,7,654,5,6}, y = {1,2,3,6,5,6,8,8,9,6,4,3,4,567,87,543,456,7876,543,4567,65,434,567,6543,456,54,3456};
        arrayComparison(x,y);
        numCompare();
        divisibility();

    }

    //Question 1
    public static void arrayComparison (int []x, int []y){
        int sum1 = 0, sum2 = 0;
        for(int i = 0; i<x.length; i++)sum1+=x[i];
        for(int i = 0; i<y.length; i++)sum2+=y[i];
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.print("The sum of the two arrays are ");
        if(sum1 == sum2) System.out.println("equal");
        else System.out.println("not equal");
    }

    //Question 2
    public static void numCompare (){
        Scanner s = new Scanner(System.in);
        System.out.print("Welcome to compare two numbers\nBoth integers must be within 50 and 100\nEnter your first number: ");
        int x = s.nextInt();
        System.out.print("Enter your second number: ");
        int y = s.nextInt();
        if ((x >=50 && x <=100) && (y >=50 && y <= 100)){
            if(x > y) System.out.println("The first number is larger");
            else if (x < y) System.out.println("The second number is larger");
            else System.out.println("The two numbers are equal");
        }
        else System.out.println("Faulty inputs entered");
    }

    //question 3
    public static void divisibility (){
        Scanner s = new Scanner(System.in);
        System.out.print("Welcome to find numbers divisible by 3\nPlease enter a starting point and ending point\n\nSTARTING MUST BE LESS THAN ENDING\n\nEnter your starting point: ");
        int x = s.nextInt();
        System.out.print("Enter your ending point: ");
        int y = s.nextInt();
        if(x >= y) System.out.println("wrong numbers");
        else{
            int count=0; // added after exam
            for(x=x; x <=y; x++) {
                if(x%3 == 0&&count <= 5) {System.out.println(x);count++;} // "count++;" added after exam
                //if () break; // added after exam
            }
        }
    }

    //question 4: What is method overloading?
    //Method overloading is when multiple methods are made with the same name but the parameters are different.
    //This is done to combat the multiple possible way data and variables are shared from one code to another method.

    //Example: System.out.println()
    //Although it is just a print function for printing to console, it is a method which takes in a variable to print
    //on the console. It is made to take in string variables; however, with method overloading, we are also able to pass
    //integer, doubles, chars and boolean variables as well.
}
