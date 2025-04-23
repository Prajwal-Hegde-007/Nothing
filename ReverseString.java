public class ReverseString {
    public static void main(String[] args) {
        String input = "Hello";  // Predefined string to reverse
        
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("Reversed string: " + reversed);
    }
}
