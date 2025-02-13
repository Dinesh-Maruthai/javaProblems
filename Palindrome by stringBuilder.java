import java.util.*;
class Palindrome {
    public static boolean isPrime(String s){
        s=s.toLowerCase();

        String rev=new StringBuilder(s).reverse().toString();
        return s.equals(rev);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s =sc.nextLine();

        if(isPrime(s)){
            System.out.println("yes");
        }
        else
            System.out.println("no");
    }
}
