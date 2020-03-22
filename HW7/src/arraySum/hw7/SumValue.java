package arraySum.hw7;

import java.util.Random;

public class SumValue {

    static void generateRandomArray(int[] arr) {
        int size = arr.length;
        Random random = new Random();
        for(int i=0;i< size;i++){
            arr[i]= random.nextInt(10);
        }
    }
    public long sum(int[] arr){
        int length = arr.length;
        int s1 = length / 4;
        int s2 = length / 2;
        int s3 = length - s1;
        Thread t1 = new MyThread(0,s1,arr);
        Thread t2 = new MyThread(s1,s2,arr);
        Thread t3 = new MyThread(s2,s3,arr);
        Thread t4 = new MyThread(s3,length,arr);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        try{
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return  ((MyThread) t1).getSum() +  ((MyThread) t2).getSum() + ((MyThread) t3).getSum() + ((MyThread) t4).getSum();
    }
    public class MyThread extends Thread {
        int s1;
        int s2;
        int[] arr;
        int sum = 0;
        public MyThread(int start, int end, int[] arr){
            s1 = start;
            s2= end;
            this.arr=arr;
        }
        @Override
        public void run(){
            for(int i = s1;i < s2; i++){
                this.sum += arr[i];
            }
            System.out.println(sum);
        }
        public int getSum(){
            return this.sum;
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[4000000];
        generateRandomArray(arr);
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res  += arr[i];
        }
        SumValue sv = new SumValue();
        long sum = sv.sum(arr);

        System.out.println("true result:" + res);
        System.out.println("sum: " + sum);
        System.out.println(res == sum);
    }
}
