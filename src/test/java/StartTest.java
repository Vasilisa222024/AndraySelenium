import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class StartTest {
   WebDriver wd;
   @BeforeMethod
   public void   precondition(){
wd=new ChromeDriver();
//wd=new FirefoxDriver();
//wd.get(" https://telranedu.web.app"); //1 opzia
 wd.navigate().to(" https://telranedu.web.app"); //2 opzia
// wd.navigate().back();//
//wd.navigate().forward();//v pered na stranizu
//wd.navigate().refresh();//obnovit

   }
   @Test
   public void testMethod(){
       WebElement element = wd.findElement(By.tagName("a"));
       List<WebElement> elements = wd.findElements(By.tagName("div"));
      System.out.println(elements.size());
       wd.findElement(By.tagName("root"));
       wd.findElement(By.className("container"));
       wd.findElement(By.linkText("HOME"));
       wd.findElement(By.partialLinkText("OM"));

       wd.findElement(By.className("active"));
       wd.findElement(By.cssSelector(".active"));
wd.findElement(By.name("email"));


   }

   @AfterMethod
public  void postcondition(){
     // wd.close();// poslednee okno
      wd.quit();//vse activnie vkladki

   }
}
