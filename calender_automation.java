import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TC1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/flights.html");
		
		driver.findElement(By.xpath("//input[@id='ddate']")).click();
		Thread.sleep(500);
		String flag = "False";
		while(flag=="False") {
			if(driver.findElements(By.xpath("//li[@id='fst_1_02/12/2024']")).size()>0) {
				driver.findElement(By.xpath("//li[@id='fst_1_02/12/2024']")).click();
				flag = "True";
				Thread.sleep(5000);
			}
			else {
				Thread.sleep(500);
				driver.findElement(By.xpath("//body/div[6]/div[1]/div[3]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/img[2]")).click();
			}

		
		}
		System.out.println("Successful");
		driver.close();		
	}
}
