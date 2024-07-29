public class MyThread extends Thread implements Runnable{
	
	public void run() {
		//runable method
		//resource
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		MyThread t1 = new MyThread(); //t1 - born state
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();
		
		t1.start(); //Runnable State
		t2.start(); 
		t3.start(); 
		
		//Thread Schedular - part of JVM
	}
}

