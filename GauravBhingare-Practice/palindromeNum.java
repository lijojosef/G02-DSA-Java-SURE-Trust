public class palindromeNum {
    public static boolean isPalindrome(int x) {
        String str=Integer.toString(x);
        String palin=new StringBuilder(str).reverse().toString();
        return str.equals(palin);
    }
    public static void main(String[] args){
        int num=121;
        boolean res=isPalindrome(num);
    }
}
