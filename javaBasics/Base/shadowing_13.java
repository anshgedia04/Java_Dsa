package Base;
public class shadowing_13 {
    static int x = 210 ;
    public static void main(String[] args) {
        System.out.println(x);
        int x = 20 ;
        System.out.println(x);
        func();
        
    }
    static int func(){
        System.out.println(x);
        return x;
    }
}
