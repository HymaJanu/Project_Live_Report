import org.testng.annotations.BeforeMethod;

import com.genericmethods.GenericMethods;

public class example extends GenericMethods{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

						System.out.println("Lanuch application");
					String url="https://demo.nopcommerce.com/";
					launchBrowser("chrome",url);
	}
}