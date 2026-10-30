
public class Main {
    public static void main(String[] args) {
        String s = "mam";
        String reverse = "";

        // Reverse the string
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse = reverse + s.charAt(i);
        }

        // Compare original and reversed strings
        if (s.equals(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
