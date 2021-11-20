
public class TestThread extends Thread {

	public static void main(String[] args) {

		Thread thread = new Thread(new Runnable() {
			public void run() {
				
			}
		});


		thread.start();
	}

}

class Task implements Runnable {

	@Override
	public void run() {
		// to execute code thread

	}

}