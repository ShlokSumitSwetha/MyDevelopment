package thread.creation;

public class ThreadExtends extends Thread{

	public static void main(String[] args) {
		System.out.println("thread creation");
		ThreadExtends t=new ThreadExtends();
		t.start();
	}
	
	@Override
	public void run() {
	System.out.println(" thread is running");
	}
}

