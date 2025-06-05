public class Variables {
    static int staticVar = 10;        
    int instanceVar = 20;             

    public void method() {
        int localVar = 30;            
        System.out.println(localVar);
    }

    public static void main(String[] args) {
        Variables obj = new Variables();
        obj.method();
        System.out.println(obj.instanceVar);
        System.out.println(staticVar);
    }
}