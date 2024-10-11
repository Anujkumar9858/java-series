interface i1{
    int x = 6;
    void f1();
    static void f2(){
        System.out.println(x);
    }
}
class Interf{
    public static void main(String [] args){
        i1.f2();
    }
}