package iFrames;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class ChromeOptionsDesiredCapabilitiesFrames {
	WebDriver driver;

	@Test
	public void frames() {
		System.out.println("chrome browser");
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "//src//main//resources//bg//browserDrivers//chromedriver.exe");
		HashMap<String, Object> browserPrefs = new HashMap<String, Object>();
		browserPrefs.put("profile.default_content_settings.popups", 0);
		browserPrefs.put("plugins.always_open_pdf_externally", true);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", browserPrefs);
		options.addArguments("--start-maximized"); // open Browser in maximized
													// mode
		// options.addArguments("--headless"); // operate in headless mode
		options.addArguments("--disable-infobars"); // disabling infobars
		options.addArguments("--disable-extensions"); // disabling extensions
		options.addArguments("--disable-gpu"); // applicable to windows os only
		options.addArguments("--disable-dev-shm-usage"); // overcome limited
															// resource problems
		options.addArguments("--no-sandbox"); // Bypass OS security model
		options.addArguments("--disable-notifications");
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		driver = new ChromeDriver(cap);
		// driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.switchTo().frame("a077aa5e");
		System.out.println("Switching on Frame");
		driver.findElement(By.xpath("/html/body/a")).click();
		driver.switchTo().defaultContent();
		driver.close();
	}
}
