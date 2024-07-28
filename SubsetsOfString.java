public class SubsetsOfString {
    public static void main(String[] args) {
        String input = "abc";
        System.out.println("Subsets of string \"" + input + "\":");
        generateSubsets(input, 0, "");
    }

    public static void generateSubsets(String input, int index, String currentSubset) {
        // Base case: If index reaches the length of input string
        if (index == input.length()) {
            System.out.println(currentSubset);
            return;
        }

        // Recursive case 1: Include the current character at index and recurse
        generateSubsets(input, index + 1, currentSubset + input.charAt(index));

        // Recursive case 2: Exclude the current character at index and recurse
        generateSubsets(input, index + 1, currentSubset);
    }
}
