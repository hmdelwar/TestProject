public class may22 {
    public static void main(String[] args) {
        int num1 = 0, num2 = 10;
        int num3 = (num1>num2) ? num1: num2;
        System.out.println(num3);
        String str = "Hello guys, how are you today? I hope everything is well";
        String y = ""+str.charAt(str.length()-2)+str.charAt(str.length()-1);
        countChar("Hello guys, how are you today? I hope everything is well", 'o');
    }

    public static void countChar (String str, char c){
        int x = 0;
        for(int i = 0; i < str.length(); i++) if (str.charAt(i) == c) x++;
        System.out.println("The following string: "+ str+ " has "+c+ " in it "+x+ " times.");
    }
}
