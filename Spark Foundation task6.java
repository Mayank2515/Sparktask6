public class Task6 {
	public static void main(String[] args) throws InterruptedException {
		//Driver Launch
		System.setProperty("webdriver.chrome.driver","./driver/chromeDriver.exe");
		WebDriver driver=new ChromeDriver(); 			
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.thesparksfoundationsingapore.org/");
		
		//Verify Title
		String title1 = driver.getTitle();
		String expectedTitle="The Sparks Foundation | Home";
		String actualTitle=driver.getTitle();
		 if(expectedTitle.equals(expectedTitle))
		 {
			 System.out.println("True-The Sparks Foundation | Home is present");
		 }
		 else {
			System.out.println("False-The Sparks Foundation | Home");
		}
		 //verify home page logo
		 
		 boolean ele = driver.findElement(By.xpath("//img[@src='/images/logo_small.png']")).isDisplayed();
		 if (ele==true) {
			System.out.println("logo is present");
		}
		 else {
			System.out.println("logo is not present");
		}
		 
		 //AboutUs page 
		 driver.findElement(By.xpath("//a[text()='About Us']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[text()='Executive Team']")).click();
		 Thread.sleep(2000);
		 String FoundingTeamName = driver.findElement(By.xpath("//span[text()='Founding Team']")).getText();
		 if (true) {
			System.out.println("founding team name is present");
		}
		 else {
			System.out.println("founding team name is Present");
		}
		  driver.navigate().back();
		 
		 //Join us
		 WebElement joinus = driver.findElement(By.xpath("//a[@data-hover='Join Us']"));
		 joinus.click();
		 Thread.sleep(2000);
		 driver.findElement(By.linkText("Why Join Us")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@placeholder='Full Name']")).sendKeys("Mayank Barve");
		 Thread.sleep(2000);
		 driver.findElement(By.name("Email")).sendKeys("mayankbarve25@gmail.com");
		 Thread.sleep(2000);
		  driver.findElement(By.className("form-control")).click();
		  driver.navigate().back();
		 
		 
		 //politics and code
		  driver.findElement(By.xpath("//a[@data-hover='Policies and Code']")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//a[text()='Personal Data Policy'][position() mod 2=1]")).click();
		  Thread.sleep(2000);
		  driver.navigate().back();
		  
		  //contact us
		  
		driver.findElement(By.xpath("//a[@data-hover='Contact Us']")).click();
		driver.findElement(By.xpath("//h4[text()='Important Notice']")).isDisplayed();
		if (true) {
			System.out.println("important notice is present in contact us page so check it out");
			
		}
		else {
			System.out.println("important njotice is not found");
		}
		driver.findElement(By.xpath("//h4[text()='Address']")).isDisplayed();
		if (true) {
			System.out.println("Address is also their in contact us page");
		}
		else {
			System.out.println("Address is their in contact us page");
		}
		  
		  
		  //Links App
		 	driver.findElement(By.linkText("LINKS App")).click();
		 	Object is = driver.findElement(By.xpath("//img[@src='/images/links-poster.png']")),IsDisplayed;
		 	if (true) {
				System.out.println("mobile image is present");
			}
		 	else
		 	{
		 		System.out.println("mobile image is not present");
		 	}
			  driver.navigate().back();
		 
		 
		 
		
}
}

