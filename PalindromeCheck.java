public class PalindromeCheck {
    public static void main(String[] args) {
        String input = "madam";  // Predefined string to check
        
        String reversed = new StringBuilder(input).reverse().toString();
        
        if (input.equals(reversed)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}
