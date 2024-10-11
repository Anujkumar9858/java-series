class Process1 extends Thread{
    public void run(){
        int i;
        for(i=1; i<=20; i++){
            System.out.println("process1"+i);
        }
    }    
}
class Process2 extends Thread{
    public void run(){
        int i;
        for(i=1; i<=20; i++){
            System.out.println("process2"+i);
        }
    }    
}
/**
 * Thread
 */
public class ThreadDemo{
    public static void main(String[] args) {
        Process1 p1 = new Process1();
        Process2 p2 = new Process2();
            p1.start();
            p2.start();
            
    }

    
}
