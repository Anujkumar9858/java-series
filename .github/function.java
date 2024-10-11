class Demo{
    static int x;
    void f1(){
        x=5;
    }
    void f2(){
        System.out.println("hii");
        System.out.println(x);
    }
}
class function{
    public static void main(String [] args){
        Demo d1 = new Demo();
        d1.f1();
        d1.f2();
    }
}
