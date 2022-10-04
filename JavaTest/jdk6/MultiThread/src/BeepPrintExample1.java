import java.awt.Toolkit;

public class BeepPrintExample1 {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}

		for (int i = 0; i < 5; i++) {
			System.out.println("beep!");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}

	}

}
