import java.util.*;
class Palindrome {
    public static boolean isPalindrome(String s){
        s=s.toLowerCase();
        String rev = "";
        for(int i=0;i<s.length();i++)
        {
            rev = s.charAt(i)+rev;
        }
        return s.equals(rev);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s =sc.nextLine();

        if(isPalindrome(s)){
            System.out.println("yes");
        }
        else
            System.out.println("no");
    }
}
