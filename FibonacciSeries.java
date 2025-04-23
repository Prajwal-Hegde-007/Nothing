public class FibonacciSeries {
    public static void main(String[] args) {
        int terms = 10;  // Predefined number of terms
        int a = 0, b = 1;
        
        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= terms; i++) {
            System.out.print(a + " ");
            int nextTerm = a + b;
            a = b;
            b = nextTerm;
        }
    }
}
