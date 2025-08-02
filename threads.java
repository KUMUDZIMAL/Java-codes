class myThread1 extends Thread {
    public void run() {
        int i = 0;
        while (i < 40) {
            System.out.println("I AM CODING");
            System.out.println("I AM HAPPY");
            i++;
        }
    }
}

class myThread2 extends Thread {
    public void run() {
        int i = 0;
        while (i < 40) {
            System.out.println("I am washing utensils");
            System.out.println("I AM SAD");
            i++;
        }
    }

}

public class threads {

    public static void main(String[] args) {
        myThread1 t1 = new myThread1();
        myThread2 t2 = new myThread2();
        t1.start();
        t2.start();

    }

}