import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationTests extends TestBase{


    @BeforeMethod
    public void preCondition(){
        if(isLogged()){
            logout();
        }
    }

    @Test
    public void registrationWrongEmail()
    {
       openLoginRegistrationForm();
        int i = (int)(System.currentTimeMillis() / 1000) % 3600;
        String email = "@mail.com";
        String password = "$Abcd1234";
        fillLoginRegistrationForm(email, password);

        submitRegistration();

//        Assert.assertTrue(wd.findElement(By.xpath("//div[text()='Registration failed with code 400']")).getText().equals("Registration failed with code 400"));


    }
//    @Test
//    public void regPositiveTest(){
//
//        openLoginRegistrationForm();
//        int i = (int)(System.currentTimeMillis() / 1000) % 3600;
//        String email = "name" + i + "@mail.com";
//        String password = "$Abcd1234";
//        fillLoginRegistrationForm(email, password);
//
//        submitRegistration();
//
//        Assert.assertTrue(wd.findElement(By.xpath("//a[text()='ADD']")).getText().equals("ADD"));
//    }




    @AfterMethod
    public void tearDown() {
//        wd.quit();
    }
}
