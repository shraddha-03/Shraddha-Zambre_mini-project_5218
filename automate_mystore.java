package MyStore;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class automate_mystore {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prafull\\Desktop\\seleniumjar\\chromedriver_win32\\chromedriver.exe");
		WebDriver w= new ChromeDriver();
			
		//2. lunch google website
		w.get("http://automationpractice.com/index.php");  //get url
		w.manage().window().maximize();                   //maximize window
		
		//get savings now
		w.findElement(By.className("img-responsive")).click();
		
		//contact us
		w.findElement(By.xpath("//header/div[2]/div[1]/div[1]/nav[1]/div[2]/a[1]")).click();
		Select a=new Select(w.findElement(By.id("id_contact")));
		a.selectByValue("2");
		Thread.sleep(2000);
		Select a1=new Select(w.findElement(By.id("id_contact")));
		a1.selectByValue("1");
		w.findElement(By.id("email")).sendKeys("atchaya09@gmail.com");
		w.findElement(By.id("id_order")).sendKeys("AT0328");
		w.findElement(By.id("fileUpload")).sendKeys("C:/Users/atcha/Downloads/Atchaya.pdf");
		w.findElement(By.id("message")).sendKeys("Defective Product Received");
		w.findElement(By.id("submitMessage")).click();
		
		//sign in
		w.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		w.findElement(By.id("email_create")).sendKeys("atchaya09@gmail.com");
		w.findElement(By.name("SubmitCreate")).click();
		
		//create an account
		Thread.sleep(5000);
		w.findElement(By.id("id_gender2")).click();
		w.findElement(By.id("customer_firstname")).sendKeys("ATCHAYA");
		w.findElement(By.id("customer_lastname")).sendKeys("LATHA");
		w.findElement(By.id("passwd")).sendKeys("Atchu@08");
		Select a3=new Select(w.findElement(By.id("days")));
		a3.selectByValue("28");
		Select a4=new Select(w.findElement(By.id("months")));
		a4.selectByValue("10");
		Select a5=new Select(w.findElement(By.id("years")));
        a5.selectByValue("1997");
        w.findElement(By.id("newsletter")).click();
        w.findElement(By.id("optin")).click();
        w.findElement(By.id("firstname")).sendKeys("Atchaya");
        w.findElement(By.id("lastname")).sendKeys("Latha");
        w.findElement(By.id("company")).sendKeys("Capgemini");
        w.findElement(By.id("address1")).sendKeys("xyz");
        w.findElement(By.id("address2")).sendKeys("abc");
        w.findElement(By.id("city")).sendKeys("kumbakonam");
        Select a6=new Select(w.findElement(By.id("id_state")));
        a6.selectByValue("14");
        w.findElement(By.id("postcode")).sendKeys("00000");
		Select a7=new Select(w.findElement(By.id("id_country")));
		a7.selectByValue("21");
		w.findElement(By.id("other")).sendKeys("Nill");
		w.findElement(By.id("phone")).sendKeys("8220190545");
		w.findElement(By.id("phone_mobile")).sendKeys("8248934920");
		w.findElement(By.id("alias")).sendKeys("abcd");
		w.findElement(By.id("submitAccount")).click();
		w.navigate().back();
		
		//Already registered
		w.findElement(By.id("email")).sendKeys("atchaya09@gmail.com");
		w.findElement(By.id("passwd")).sendKeys("Atchu@0328");
		w.findElement(By.id("SubmitLogin")).click();
		
		//MY ACCOUNT
		Thread.sleep(5000);
		w.findElement(By.xpath("//span[contains(text(),'Order history and details')]")).click();
		w.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/ul[1]/li[1]/a[1]/span[1]")).click();
		w.findElement(By.xpath("//span[contains(text(),'My credit slips')]")).click();
		w.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/ul[1]/li[1]/a[1]/span[1]")).click();
		w.findElement(By.xpath("//span[contains(text(),'My addresses')]")).click();
		w.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/ul[1]/li[1]/a[1]/span[1]")).click();
		w.findElement(By.xpath("//span[contains(text(),'My personal information')]")).click();
		w.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/ul[1]/li[1]/a[1]/span[1]")).click();
        w.findElement(By.xpath("//span[contains(text(),'My wishlists')]")).click();
		w.findElement(By.id("name")).sendKeys("Atchu");
		w.findElement(By.id("submitWishlist")).click();
		w.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/ul[1]/li[1]/a[1]/span[1]")).click();
        w.findElement(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/ul[1]/li[1]/a[1]")).click();
        w.findElement(By.xpath("//header/div[2]/div[1]/div[1]/nav[1]/div[2]/a[1]")).click();
        w.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/ul[1]/li[1]/a[1]/span[1]")).click();
		
		//T-shirt part
		
		w.findElement(By.xpath("//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[3]/a[1]")).click(); // tshirt icon
		w.findElement(By.id("layered_id_attribute_group_1")).click();                             //checkboxes
		w.findElement(By.id("layered_id_feature_5")).click();
		w.findElement(By.id("layered_id_feature_11")).click();
		w.findElement(By.id("layered_id_feature_17")).click();
		w.findElement(By.id("layered_quantity_1")).click();
		w.findElement(By.id("layered_manufacturer_1")).click();
		w.findElement(By.id("layered_condition_new")).click();
		Select s=new Select (w.findElement(By.id("selectProductSort")));                            //sort by dropdown
		s.selectByVisibleText("Price: Lowest first");
		w.findElement(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/div[2]/div[1]/ul[1]/li[3]/a[1]/i[1]")).click(); // list iconn
		w.findElement(By.xpath("//span[contains(text(),'More')]")).click();  //Quick view
		Thread.sleep(1000);
		w.findElement(By.id("thumb_1")).click();                              //view larger 
	    Thread.sleep(2000);
	    w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/a[1]")).click();
		w.findElement(By.id("thumb_2")).click();
	    Thread.sleep(2000);
	    w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/a[1]")).click();
	    w.findElement(By.id("thumb_3")).click();
	    Thread.sleep(2000);
	    w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/a[1]")).click();
		w.findElement(By.id("thumb_4")).click();
	    Thread.sleep(2000);
	    w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/a[1]")).click();
	    Thread.sleep(1000);
	    w.findElement(By.xpath("//span[contains(text(),'Add to cart')]")).click(); // Add to cart
	    Thread.sleep(3000);
	    w.navigate().back();
			    
				
			    
	    //For Cart
	 
	    w.findElement(By.xpath("//header/div[3]/div[1]/div[1]/div[3]/div[1]/a[1]")).click();  // Click on cart
	    Thread.sleep(1000);
	    w.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/p[2]/a[1]/span[1]")).click(); //proceed to checkout button
	    w.findElement(By.id("email")).sendKeys("atchaya0328@gmail.com");  // Already register(sing in)
	    w.findElement(By.id("passwd")).sendKeys("Atchu@0328");
	    w.findElement(By.id("SubmitLogin")).click();
	    w.findElement(By.name("processAddress")).click();                 //process address button(address)
	    w.findElement(By.id("cgv")).click();                              //terms and condition(shipping)
	    w.findElement(By.name("processCarrier")).click();                 //process to checkout
	    w.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/p[1]/a[1]/span[1]")).click(); //Payment pay by bankwire
	    w.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]/span[1]")).click(); //confirm order button
         TakesScreenshot t = (TakesScreenshot) w;         // order confirm
		File src = t.getScreenshotAs(OutputType.FILE);
		Files.copy(src, new File("E:\\gunjan\\Software testing course\\Final Project\\screenshots\\P345.png"));
	    w.findElement(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/p[1]/a[1]")).click();          // back to order
	    w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/ul[1]/li[2]/a[1]/span[1]")).click(); // back to home
			    
		// To check the woman tab
		Actions actions=new Actions(w);
		w.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		WebElement womenTab=w.findElement(By.linkText("WOMEN"));
		WebElement TshirtTab=w.findElement(By.xpath("//div[@id='block_top_menu']/ul/li[1]/ul/li[1]/ul//a[@title='T-shirts']"));
		actions.moveToElement(womenTab).moveToElement(TshirtTab).click().perform();
		Thread.sleep(2000);
			  
		//checkbox click for size
		WebElement size=w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/span[1]/input[1]"));
		size.click();
			  
		//checkbox click for Compositions
		WebElement Compositions=w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/ul[1]/li[1]/div[1]/span[1]/input[1]"));
		Compositions.click();
			  
		//checkbox click for Style
		WebElement style=w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/ul[1]/li[1]/div[1]/span[1]/input[1]"));
		style.click();
			  
		// Get Product Name
		String ProductName=w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[2]/h5[1]/a[1]")).getText();
		System.out.println(ProductName);
		w.findElement(By.id("search_query_top")).sendKeys(ProductName);
		w.findElement(By.name("submit_search")).click();
			  
		//select category	
		WebElement productCategory=w.findElement(By.id("selectProductSort"));
		Select pSelectC=new Select(productCategory);
		pSelectC.selectByVisibleText("Product Name: A to Z");
		w.navigate().back();
			  
		//Click on Sign in
		w.findElement(By.linkText("Sign in")).click();
			  
	    //Login
		w.findElement(By.id("email")).sendKeys("vsoft1120@test.com");
		w.findElement(By.id("passwd")).sendKeys("vosft1212");
		w.findElement(By.id("SubmitLogin")).click();			  
			  
		//Click on Women
		//w.findElement(By.linkText("WOMEN")).click();
		w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/a[1]")).click();
			  
		WebElement SecondImg=w.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div[2]/ul/li[2]/div/div[1]/div/a[1]/img"));
	    WebElement MoreButton=w.findElement(By.xpath("/html/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul/li[2]/div[1]/div[2]/div[2]/a[2]"));
		Actions actions1=new Actions(w);
		actions1.moveToElement(SecondImg).moveToElement(MoreButton).click().perform();
			  
		//Change quantity by 2
		w.findElement(By.id("quantity_wanted")).clear();
		w.findElement(By.id("quantity_wanted")).sendKeys("2");

		//Select size as L
		WebElement Sizedrpdwn=w.findElement(By.xpath("//*[@id='group_1']"));
		Select orderSelect=new Select(Sizedrpdwn);
		orderSelect.selectByVisibleText("M");

		//Select Color
		w.findElement(By.id("color_11")).click();

		//Click on add to cart
		w.findElement(By.xpath("//p[@id='add_to_cart']//span[.='Add to cart']")).click();

		//Click on proceed
		w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[4]/a[1]/span[1]")).click();
			  
		//Checkout page Proceed
		w.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/p[2]/a[1]/span")).click();
		w.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/form/p/button/span")).click();
			  
		//Agree terms&Conditions
		w.findElement(By.xpath("//*[@id=\"cgv\"]")).click();
		w.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/form/p/button/span")).click();

		//Click on Payby Check	  
		w.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/div[3]/div[2]/div/p/a")).click();
			  
		//Confirm the order
		w.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/form/p/button/span")).click();
			  
		//click on dresses tab
		w.findElement(By.xpath("//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]")).click();
			  
		//click on evening dress tab
		w.findElement(By.linkText("Evening Dresses")).click();
			  
		//to check the add to wish list
		WebElement PrintedDress=w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[1]/a[1]/img[1]"));
	    WebElement AddToWishlist=w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[3]/div[1]/a[1]"));
		Actions actions2=new Actions(w);
		actions2.moveToElement(PrintedDress).moveToElement(AddToWishlist).click().perform();
			  
		//click on dresses tab
		w.findElement(By.xpath("//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]")).click();
			 
		//click on Summer dress tab
		w.findElement(By.linkText("Summer Dresses")).click();
			  
		//click on compare button
		w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/div[2]/div[2]/form[1]")).click();
		
		//click on woman
		w.findElement(By.linkText("WOMEN")).click();
		w.navigate().back();
		
		//click on dresses
		w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]")).click();
		w.navigate().back();
		
		//click on t-shirt
		w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[6]/ul[1]/li[3]/a[1]")).click();
		w.navigate().back();
		
		//serach bar
		String ProductNameP=w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[3]/div[1]/div[2]/h5[1]/a[1]")).getText();
		System.out.println(ProductNameP);
		w.findElement(By.id("search_query_top")).sendKeys(ProductNameP);
		w.findElement(By.name("submit_search")).click();
		w.navigate().back();
		
		//To check the Best Seller tab
		w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]")).click();
		
		//To check The Top brands
		w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]/img[1]")).click();
		w.navigate().back();
		
		//To check the newslatter tab
		w.findElement(By.id("newsletter-input")).sendKeys("vsoft7258@test.com");
		w.findElement(By.name("submitNewsletter")).click();
		w.navigate().back();
		
		//to check the Footer tab(best Seller)
		w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/footer[1]/div[1]/section[3]/ul[1]/li[2]/a[1]")).click();
		
		//to check the footer(My Account section)
		w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/footer[1]/div[1]/section[5]/div[1]/ul[1]/li[1]/a[1]")).click();
		
		//Login
		  w.findElement(By.id("email")).sendKeys("vsoft1120@test.com");
		  w.findElement(By.id("passwd")).sendKeys("vosft1212");
		  w.findElement(By.id("SubmitLogin")).click();
		  
		//click to check my wishlist
		  w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/span[1]")).click();
			
		  //to add item in wish list
		  w.findElement(By.id("name")).sendKeys("Printed Chiffon Dress");
		  w.findElement(By.id("submitWishlist")).click();
		  w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/ul[1]/li[1]/a[1]/span[1]")).click();
		  
		  //back to home 
		  w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/ul[1]/li[1]/a[1]/span[1]")).click();
				  
				  
		w.navigate().back();
		w.close();	  
	}
}
