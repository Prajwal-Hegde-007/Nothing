public class MultiplicationTable {
    public static void main(String[] args) {
        int num = 5;  // Predefined number for multiplication table
        
        System.out.println("Multiplication table for " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }
}

