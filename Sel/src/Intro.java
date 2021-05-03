import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Intro {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("suneel");

		System.setProperty("webdriver.chrome.driver", "/Users/bodagalasuneelsaibabu/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String urlName = driver.getTitle();
		try {
			if (urlName.equalsIgnoreCase("Facebook - Log In or Sign Up")) {
				String name = urlName + " this is the url you are trying to access";
				Thread.sleep(1000);
				driver.findElement(By.id("email")).sendKeys("akil292002@yahoo.com");
				driver.findElement(By.id("pass")).sendKeys("sumisuni2");
				driver.findElement(By.name("login")).click();

				System.out.println(name);
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			Thread.sleep(3000);
			//driver.close();

		}
		{

		}
	}
}
