public class String1 {
    public static void main(String[] args) {
        char ch[] = {'a', 'b', 'c', 'd', 'e'};
        String str1 = "abcd";
        String str2 = new String("xyz");
 
        System.out.println("Character Array:");
        for (char c : ch) {
            System.out.print(c + " ");
        }
        System.out.println();
 
        System.out.println("String 1: " + str1);
 
        System.out.println("String 2: " + str2);
    }
}
