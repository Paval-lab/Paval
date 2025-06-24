public class switchExample {
    public static void main(String[]Args){

        int day = 5;
        switch(day){
            case 1: System.out.println("MONDAY");break;
            case 2: System.out.println("TUESDAY");break;
            case 3: System.out.println("WEDNESDAY");break;
            case 4: System.out.println("THURSDAY");break;
            case 5: System.out.println("FRIDAY");break;

            default: System.out.println("INVALID DAY");
        }
    }
}