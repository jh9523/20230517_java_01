package kh.lclass.thread;

public class ThreadBbb extends Thread {
	
	@Override
	public void run() {
		for(int i=1; i<101;i++) {
			for(int j =1; j<10; j++) {
				System.out.printf("### %3d*%2d=%3d\n",i, j, i*j);
			}
			System.out.println("=======");
			try {
				sleep(10L);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("***ThreadBbb끝******");
	}	
	
	
}
