package forkjoinframework;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinFrameworkTest1 implements Runnable{

	public static void main(String[] args) {
		
		ForkJoinPool pool=new ForkJoinPool(4);
		System.out.println("executing .....");
		pool.execute(new  ForkJoinFrameworkTest1());
		
	}

	@Override
	public void run() {
		//long startTime=System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			System.out.println("count"+i);
		}
		//long endtime=System.currentTimeMillis();
		//System.out.println("time taken"+(startTime-endtime));
	}

}
