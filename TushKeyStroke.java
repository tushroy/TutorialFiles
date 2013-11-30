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
		String Text1 = "hello, how are you...";
		
		TushKeyStroke r = new TushKeyStroke();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		r.someDelay();

		for (int n = 0; n < programeName.length(); n++) {
			r.keyPress(KeyEvent.getExtendedKeyCodeForChar(programeName
					.charAt(n)));
			r.someDelay();
		}

		r.keyPress(KeyEvent.VK_ENTER);
		r.someDelay();
		
		for (int n = 0; n < Text1.length(); n++) {
			r.keyPress(KeyEvent.getExtendedKeyCodeForChar(Text1.charAt(n)));
			r.someDelay();
		}
		
		System.exit(0); // safe return
	}
}
