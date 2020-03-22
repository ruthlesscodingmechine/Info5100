package threadsum.hellow;

public class ReverseHello {
    public static void createThread(int num){
        if(num == 51) return;
        createThread(num + 1);
        Thread t = new Thread(() -> {
            System.out.println("Hello from thread" + num);
        });
        try{
            t.sleep(100);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        t.start();


    }
    public static void main(String[] args) {
        createThread(1);
    }
}
