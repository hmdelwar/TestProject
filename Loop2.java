public class Loop2 {
    public static void main(String[] args) {
        //for(int i = 0; i <=8;i++){for(int j = 0; j <i;j++) System.out.print("*");
        //System.out.println();
        //}
        //int [] numbers = new int [7];
        int [] numbers = {3443,556567,76,7,865,4,76,8,45,67,5,884,86,78,45,8,54,8,45,85,6,746,578,745,76,575,6745,3757};
        int max  = numbers[0];
        for(int i =0; i < numbers.length; i++) {
            if (max <=numbers[i]) max = numbers[i];
        }
        //System.out.println(max);

        //for(int i = 0; i < numbers.length; i++) if(numbers[i]%2 ==1) System.out.println(numbers[i]);

        boolean xyz = true;
        int len = numbers.length;
        int i = 0, nos = 0;
        //numbers = swap(numbers, 0, 4);
        System.out.println(len);
        while (xyz){
            if (numbers[i] > numbers[i+1]) {numbers = swap(numbers, i,i+1); nos++;}
            i++;

            if(nos ==0 && i == len-1) xyz = false;
            if(i == len) {System.out.println(i+ " "+nos);i =0; nos =0;}
        }
        printlist(numbers);

    }

    public static int[] swap (int []x, int y, int z){
        int a = x[y];
        x[y] = x[z];
        x[z] = a;
        return(x);
    }
    public static void printlist (int []x){
        for(int i = 0; i < x.length;i++) System.out.print(x[i]+" ");
    }
}
