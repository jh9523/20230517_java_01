package kh.lclass.thread;

public class ThreadAaa implements Runnable {

	@Override
	public void run() {
		for(int i=1; i<101;i++) {
			for(int j =1; j<10; j++) {
				System.out.printf("%3d*%2d=%3d\n",i, j, i*j);
			}
			System.out.println("=======");
		}
		
		System.out.println("**ThreadAaa끝******");
	}	
	

}
