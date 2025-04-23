public class SimpleCalculator {
    public static void main(String[] args) {
        double num1 = 10, num2 = 5;  // Predefined numbers
        char operator = '+';  // Predefined operator
        
        double result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }
        
        System.out.println("Result: " + result);
    }
}
