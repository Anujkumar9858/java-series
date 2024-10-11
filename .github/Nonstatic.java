class Demo{
    void f1(){
        System.out.println("Area 1");
    }
}
/**
 * Nonstatic
 */
public class Nonstatic {
    public static void main(String[] args){
        System.out.println("Area 2");
        Demo d1 = new Demo();
        d1.f1();
    }

    
}