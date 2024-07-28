public class StringPalindrome {
    public static boolean checkPalindrome(String s1){
        int start=0;
        int end=s1.length()-1;
        while(start<end){
            if(s1.charAt(start)!=s1.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args){
        String s1="Sumant";
        System.out.println(checkPalindrome(s1));
    }
}
