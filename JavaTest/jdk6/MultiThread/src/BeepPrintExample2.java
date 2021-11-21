
public class BeepPrintExample2 {

	public static void main(String[] args) {
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		thread.start();
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}

	}
	// runnable 익명 객체 이용
	/* 
	 * Thread thread = new Thread(new Runnable(){
	 * @Override
	 * public void run() {
	 * 	Toolkit toolkit = Toolkit.getDefaultToolkit();
	 * 	for(int i=0; i<5; i++)
	 * {
	 * 	toolkit.beep();
	 * 	try{Thread.sleep(500);}catch (Exception e){}
	 * }
	 * });
	 *  */

	// runnable 람다식 이용
	/* 
	 * Thread thread = new Thread(()->{
	 * @Override
	 * public void run() {
	 * 	Toolkit toolkit = Toolkit.getDefaultToolkit();
	 * 	for(int i=0; i<5; i++)
	 * {
	 * 	toolkit.beep();
	 * 	try{Thread.sleep(500);}catch (Exception e){}
	 * }
	 * });
	 *  */
}

