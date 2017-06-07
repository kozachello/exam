
package portfolio.exam_2;

class Mythread implements Runnable {
    String name;
    Thread t;

    Mythread(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("new thread: " + t);
        t.start();
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " interrupted!");
        }
        System.out.println(name + " finished!");
    }
}

class Joinisalive {
    public static void main(String args[]) {
        Mythread ob1 = new Mythread("one");
        Mythread ob2 = new Mythread("two");
        Mythread ob3 = new Mythread("three");
        System.out.println("thread one in action: " + ob1.t.isAlive());
        System.out.println("thread two in action: " + ob2.t.isAlive());
        System.out.println("thread three in action: " + ob3.t.isAlive());
        try {
            System.out.println("waiting for all threads are finished...");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("main thread interrupted!");
        }
        System.out.println("thread one in action: " + ob1.t.isAlive());
        System.out.println("thread two in action: " + ob2.t.isAlive());
        System.out.println("thread three in action: " + ob3.t.isAlive());
        System.out.println("main thread finished!");
    }
}
