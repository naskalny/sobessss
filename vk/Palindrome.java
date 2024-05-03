package vk;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindromeStr("A man, a plan, a canal: Panama"));
    }

    public static boolean isPalindrome(int x) {
        String strX = String.valueOf(x);
        String reversedX = new StringBuilder(strX).reverse().toString();
        if (strX.equals(reversedX)){
            return true;
        }
        return false;
    }

    public static boolean isPalindromeStr(String s) {
        String str = s.toLowerCase();
        str = str.replaceAll("\\s",""); // remove all space in string
        str = str.replaceAll("[^a-z0-9]",""); // remove all non-alphanumerical
        int i=0,j=str.length()-1;
        while(i<j){
            char ch = str.charAt(i);
            char ch1 = str.charAt(j);
            if(ch==ch1){
                i++;
                j--;
            }
            else return false;
        }
        return true;
    }
}
