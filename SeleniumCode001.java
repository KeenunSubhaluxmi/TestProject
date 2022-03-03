import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SeleniumCode001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String Str = driver.getTitle();
		//System.out.println(driver.getTitle());
		System.out.println(Str);
		String url=driver.getCurrentUrl();
	  //  if(url.contains("google.co.in"))
	   // {
	     // System.out.println("Pass");
	    //}
	    //else
	    //{
	     //System.out.println("Fail"+url);
	   // }
		String ActualTitle = Str;
		String ExpectedTitle = "google.co.in";
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		System.out.println(ActualTitle);
		
	}

}
