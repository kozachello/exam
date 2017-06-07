
package portfolio.exam_2;

class Newthread implements Runnable {
	Thread t;

	Newthread() {
		t = new Thread(this, "demostration thread");
		System.out.println("child thead is created: " + t);
		t.start();
	}

	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("child thread: " + i);
				Thread.sleep(800); // tiden er mindre.. garanterer at main slutter sidst (undgå bug)
			}
		} catch (InterruptedException e) {
			System.out.println("child thread iterrupted!");
		}
		System.out.println("child thread is finished");
	}
}

class Threadrunnable {
	public static void main(String args[]) {
		new Newthread();
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("main thread: " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("main thread iterrupted!");
		}
		System.out.println("main thread is finished!");
	}
}
		
  