package thread.interrupt;

public class ThreadTest3 implements Runnable {
	
	public static void main(String[] args) {
		new Thread(new ThreadTest3()).start();
		System.out.println("Inside main after start()");
	}

	@Override
	public void run() {
		System.out.println("Thread before interrupt status="+Thread.currentThread().isInterrupted());
		Thread.currentThread().interrupt();
		System.out.println("Thread after interrupt status="+Thread.currentThread().isInterrupted());
	}

}
