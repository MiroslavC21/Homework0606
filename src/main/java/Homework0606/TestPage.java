package Homework0606;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestPage {

        private WebDriver driver;
        private WebDriverWait driverWait;
        private AppointmentPage appointmentPage;
        private SummaryPage summaryPage;
        private LoginPage loginPage;

        @BeforeClass
        public void BeforeClass() {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\ITBootcamp\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driverWait = new WebDriverWait(driver, Duration.ofSeconds(10));

            appointmentPage = new AppointmentPage(driver,driverWait);
            summaryPage = new SummaryPage(driver,driverWait);
            loginPage = new LoginPage(driver,driverWait);

            driver.navigate().to("https://katalon-demo-cura.herokuapp.com/");
        }

        @Test(priority = 1)
        public void TestOne () {

            loginPage.userLogin();
            //appointmentPage.isFormPresented();
            Assert.assertTrue(appointmentPage.isFormPresented());
        }

        @Test(priority = 2)
        public void TestTwo (){
            appointmentPage.makeAppointmentAll();
            Assert.assertEquals("Tokyo CURA Healthcare Center", summaryPage.facilityConfirmationReport());
        }

        @Test(priority = 4)
        public void TestTree (){
            Assert.assertEquals("Yes", summaryPage.hospitalReadmissionConfirmationReport());
        }

        @Test(priority = 5)
        public void Test4 (){
            Assert.assertEquals("21/09/2020", summaryPage.visitDateConfirmationReport());
        }

        @Test(priority = 6)
        public void Test5 (){
            Assert.assertEquals("Ovo je komentar", summaryPage.commentConfirmationReport());
        }

        @AfterClass
        public void afterClass(){
            driver.close();
        }
    }

