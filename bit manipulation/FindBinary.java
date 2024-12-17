public class FindBinary {
    static String findBinary(int number){
        if (number >= 0) {
            return "Number is not negative";
        }

        int numBits = 32; // Assuming we're dealing with 32-bit integers
        int absValue = Math.abs(number);
        
        // Get the binary representation of the absolute value
        String binaryAbsValue = getBinaryString(absValue, numBits);

        // Invert the bits
        String invertedBits = invertBits(binaryAbsValue);

        // Add one to the inverted bits
        String binaryRepresentation = addOne(invertedBits);

        return binaryRepresentation;
    }

    private static String getBinaryString(int number, int numBits) {
        StringBuilder binaryString = new StringBuilder();
        while (number > 0) {
            binaryString.append(number % 2);
            number = number / 2;
        }
        // Pad with leading zeros to fit the number of bits
        while (binaryString.length() < numBits) {
            binaryString.append("0");
        }
        return binaryString.reverse().toString();
    }

    private static String invertBits(String binary) {
        StringBuilder inverted = new StringBuilder();
        for (char bit : binary.toCharArray()) {
            inverted.append(bit == '0' ? '1' : '0');
        }
        return inverted.toString();
    }

    private static String addOne(String binary) {
        StringBuilder result = new StringBuilder(binary);
        boolean carry = true;
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1' && carry) {
                result.setCharAt(i, '0');
            } else if (binary.charAt(i) == '0' && carry) {
                result.setCharAt(i, '1');
                carry = false;
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        int num = 5;
        System.err.println(findBinary(num));
    }
}
