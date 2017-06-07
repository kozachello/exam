
package portfolio.exam_2;

class Mynewthread implements Runnable {
    String name;
    Thread t;

    Mynewthread(String threadname) {
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

class Multithread {
    public static void main(String args[]) {
        new Mynewthread("first thread");
        new Mynewthread("second thread");
        new Mynewthread("third thread");
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            System.out.println("main thread interrupted!");
        }
        System.out.println("main thread finished!");
    }
}
