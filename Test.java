public class Test {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = s1;
        s1 = s1.concat(" world");
        System.out.println(s2);
    }
}

