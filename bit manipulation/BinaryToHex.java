public class BinaryToHex {
    public static String binaryToHexadecimal(String binaryString) {
        // Parse the binary string to an integer
        int decimal = Integer.parseInt(binaryString, 2);

        // Convert the integer to a hexadecimal string
        String hexString = Integer.toHexString(decimal);

        // Convert to uppercase for consistency
        return hexString.toUpperCase();
    }

    public static void main(String[] args) {
        System.out.println(binaryToHexadecimal("101"));
    }
}
