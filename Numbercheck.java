import java.util.Scanner;
public class Numbercheck{
    public static void main(String[]Args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        if (num > 0){
            System.out.println("NUMBER IS POSITIVE");
        }
        else if (num < 0){
            System.out.println("NUMBER IS NEGATIVE");
        }
        else{
            System.out.println("NUMBER IS ZERO");
        }
        //sc.close();
    }
}