import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.Assertion;

public class Guru99BankParameter {

	static WebDriver driver =new ChromeDriver();
	
	String WebSiteGuru99Bank ="https://www.demo.guru99.com/V4/";
	String ExpectTitele="Guru99 Bank Manager HomePage";
	String idUse="mngr526005";
	String passUse="vupEjAz";
	
    String VALID = "valid";
	String INVALID = "invalid";
	//String expected_inValid = "User or Password is not valid";
	String expected_inValid = "https://www.demo.guru99.com/V4/index.php";

	
	Assertion myAssert = new   Assertion();
	
	
	
}
