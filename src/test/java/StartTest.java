import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class StartTest {
   WebDriver wd;
   @BeforeMethod
   public void   precondition(){
wd=new ChromeDriver();

   }
   @Test
   public void test(){

   }

   @AfterMethod
public  void postcondition(){

   }
}
