package seleniumframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javapractice123 {

	public static void main(String[] args) {
		
		
//		String ab="okay i gt you";
//		String[] ac=ab.split(" ");
//		System.out.println(ac[1]+" "+ac[3]);
//		System.out.println(ab.replaceAll(" ", ""));
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("hello");
		
		
		
		
		
		
		
		
		
		

	}

}
