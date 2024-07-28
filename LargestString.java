// public class LargestString {
//     public static String findLatestString(String str1, String str2) {
        
//         if (str1.length()>str2.length()) {
//             return str1;
//         } else {
//             return str2;
//         }
//     }
//     public static void main(String[] args) {
//         String str1 = "apple";
//         String str2 = "banana";

//         String largest = findLatestString(str1, str2);
//         System.out.println(largest);
//     }
// }

import java.util.*;

public class LargestString {
    
    static Comparator<String> customComparator = new Comparator<String>() {
         
        public int compare(String str1, String str2) {
            int minLength = Math.min(str1.length(), str2.length());
            for (int i = 0; i < minLength; i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    return str2.charAt(i) - str1.charAt(i);  
                }
            }
            return str2.length() - str1.length();  
        }
    };

    public static String findLargestString(String str1, String str2) {
        return customComparator.compare(str1, str2) < 0 ? str1 : str2;
    }

    public static void main(String[] args) {
        String str1 = "apple";
        String str2 = "banana";

        String largest = findLargestString(str1, str2);
        System.out.println("Largest string: " + largest);
    }
}

