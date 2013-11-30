import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class TushKeyStroke extends Robot {

	public TushKeyStroke() throws AWTException {
		super();
	}

	public void someDelay() {
		this.delay(400);
	}

	public static void main(String[] args) throws AWTException {
		String programeName = "notepad";
		String Text1 = "Hello, how are you...";
		
		TushKeyStroke tush = new TushKeyStroke();
		tush.keyPress(KeyEvent.VK_CONTROL);
		tush.keyPress(KeyEvent.VK_ESCAPE);
		tush.keyRelease(KeyEvent.VK_CONTROL);
		tush.keyRelease(KeyEvent.VK_ESCAPE);
		tush.someDelay();

		for (int n = 0; n < programeName.length(); n++) {
			tush.keyPress(KeyEvent.getExtendedKeyCodeForChar(programeName
					.charAt(n)));
			tush.someDelay();
		}

		tush.keyPress(KeyEvent.VK_ENTER);
		tush.someDelay();
		
		for (int n = 0; n < Text1.length(); n++) {
			tush.keyPress(KeyEvent.getExtendedKeyCodeForChar(Text1.charAt(n)));
			tush.someDelay();
		}
		
		System.exit(0); // safe return
	}
}
