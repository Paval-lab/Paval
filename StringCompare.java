public class StringCompare {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";

        // Case-sensitive comparison
        if (str1.equals(str2)) {
            System.out.println("Strings are equal.");
        } else {
            System.out.println("Strings are not equal.");
        }

        // Case-insensitive comparison
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Strings are equal (ignoring case).");
        }
    }
}