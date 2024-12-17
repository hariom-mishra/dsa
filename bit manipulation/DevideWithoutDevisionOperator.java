public class DevideWithoutDevisionOperator {

    public static int divide(int dividend, int divisor) {
        // Handle division by zero
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }

        // Handle negative numbers
        boolean isNegative = (dividend < 0) ^ (divisor < 0);
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        // Perform subtraction-based division
        int quotient = 0;
        while (dividend >= divisor) {
            dividend -= divisor;
            quotient++;
        }

        // Return the quotient with the correct sign
        return isNegative ? -quotient : quotient;
    }

    public static void main(String[] args) {
        int dividend = 25;
        int devisor = 5;
        System.out.println(divide(dividend, devisor));
    }
}
