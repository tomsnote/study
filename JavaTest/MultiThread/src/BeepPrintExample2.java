
public class BeepPrintExample2 {

	public static void main(String[] args) {
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		thread.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}

	}
	// runnable 익명 객체 사용법
	// runnable 구현 클래스를 내부에 작성한다.
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

	// runnable 익명 객체 사용법
	// 람다식 이용
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

