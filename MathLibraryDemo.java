public class MathLibraryDemo {
    public static void main(String[] args) {
        double base = 2;
        int exponent = 3;
        double powerResult = Math.pow(base, exponent); // 2^3 = 8.0

        double numberForSqrt = 16;
        double sqrtResult = Math.sqrt(numberForSqrt); // sqrt(16) = 4.0

        double decimalNumber = 5.67;
        long roundedNumber = Math.round(decimalNumber); // 5.67 rounds to 6

        // Generate a random number between 0.0 and 1.0
        double randomNumber = Math.random(); 

        // Generate a random number between 1 and 10
        int randomInt = (int) (Math.random() * 10) + 1;

        // Output results
        System.out.println("Power (2^3): " + powerResult);
        System.out.println("Square Root (√16): " + sqrtResult);
        System.out.println("Rounded Number (5.67 → nearest integer): " + roundedNumber);
        System.out.println("Random Number (0.0 to 1.0): " + randomNumber);
        System.out.println("Random Integer (1 to 10): " + randomInt);
    }
}
