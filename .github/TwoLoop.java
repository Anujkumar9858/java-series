class Demo1 extends Thread{
    public void run(){
        int i;
        for(i=1; i<=1000; i++){
            System.out.println("I love you punam:"+i);
            System.out.println("I miss you so much baby:"+i);
        }
    }
}
class Demo2 extends Thread{
    public void run(){
        int i;
        for(i=1; i<=1000; i++){
            System.out.println("I love you punam:"+i);
            System.out.println("I miss you so much baby:"+i);
        }
    }

}
public class TwoLoop {
    public static void main(String[] args){
        Demo1 d1 = new Demo1();
        Demo2 d2 = new Demo2();
        d1.start();
        d2.start();
    }
    
}
