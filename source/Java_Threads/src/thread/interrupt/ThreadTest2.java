package thread.interrupt;

public class ThreadTest2 implements Runnable {

	@Override
	public void run() {
		try {
			Thread.currentThread().interrupt();
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			System.out.println("Thread intreputted " + e);
		}
	}

	public static void main(String[] args) {
		Thread thread = new Thread(new ThreadTest2());
		thread.start();
	}
}
