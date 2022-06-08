package Homework0606;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


    public class LoginPage extends BasePage{
        private By makeAppointmentBtn = By.id("btn-make-appointment");
        private By username = By.id("txt-username");
        private By password = By.id("txt-password");
        private By loginBtn = By.id("btn-login");

        public void makeAppointmentBtnPress (){
            getDriver().findElement(makeAppointmentBtn).click();
            threadWait();
        }

        public void enterUsername (){
            getDriver().findElement(username).sendKeys("John Doe");
            //threadWait();
        }
        public void enterPassword (){
            getDriver().findElement(password).sendKeys("ThisIsNotAPassword");
            //threadWait();
        }
        public void loginBtnPress (){
            getDriver().findElement(loginBtn).click();
            //threadWait();
        }
        public void userLogin (){
            makeAppointmentBtnPress();
            threadWait();
            enterUsername();
            enterPassword();
            loginBtnPress();
            threadWait();
        }

        public LoginPage() {
        }

        public LoginPage(WebDriver driver, WebDriverWait driverWait) {
            super(driver, driverWait);
        }

        public LoginPage(By makeAppointmentBtn, By username, By password, By loginBtn) {
            this.makeAppointmentBtn = makeAppointmentBtn;
            this.username = username;
            this.password = password;
            this.loginBtn = loginBtn;
        }

        public LoginPage(WebDriver driver, WebDriverWait driverWait, By makeAppointmentBtn, By username, By password, By loginBtn) {
            super(driver, driverWait);
            this.makeAppointmentBtn = makeAppointmentBtn;
            this.username = username;
            this.password = password;
            this.loginBtn = loginBtn;
        }

        public By getMakeAppointmentBtn() {
            return makeAppointmentBtn;
        }

        public void setMakeAppointmentBtn(By makeAppointmentBtn) {
            this.makeAppointmentBtn = makeAppointmentBtn;
        }

        public By getUsername() {
            return username;
        }

        public void setUsername(By username) {
            this.username = username;
        }

        public By getPassword() {
            return password;
        }

        public void setPassword(By password) {
            this.password = password;
        }

        public By getLoginBtn() {
            return loginBtn;
        }

        public void setLoginBtn(By loginBtn) {
            this.loginBtn = loginBtn;
        }
    }

