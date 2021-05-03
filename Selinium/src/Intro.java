import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Intro {

	public static void mian(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/bodagalasuneelsaibabu/Downloads/chromedriver");
		WebDriver eb = new ChromeDriver();
		eb.get("https://www.google.com/");

	}

}
