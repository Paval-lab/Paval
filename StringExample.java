public class StringExample {
    public static void main(String[] args) {
        String name = "Java Programming";

        System.out.println("Original String: " + name);
        System.out.println("Length: " + name.length());
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Character at index 5: " + name.charAt(5));
        System.out.println("Substring (0 to 4): " + name.substring(0, 4));
    }
}