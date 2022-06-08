package Homework0606;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


    public class SummaryPage extends BasePage{
        private By facilityConfirmation = By.id("facility");
        private By hospitalReadmissionConfirmation = By.id("hospital_readmission");
        private By visitDateConfirmation = By.id("visit_date");
        private By commentConfirmation = By.id("comment");
        private By goToHomepageBtn = By.xpath("/html/body/section/div/div/div[7]/p/a");

        public String facilityConfirmationReport (){
            return getDriver().findElement(facilityConfirmation).getText();
        }
        public String hospitalReadmissionConfirmationReport (){
            return getDriver().findElement(hospitalReadmissionConfirmation).getText();
        }
        public String visitDateConfirmationReport () {
            return getDriver().findElement(visitDateConfirmation).getText();
        }
        public String commentConfirmationReport (){
            return getDriver().findElement(commentConfirmation).getText();
        }

        public SummaryPage() {
        }

        public SummaryPage(WebDriver driver, WebDriverWait driverWait) {
            super(driver, driverWait);
        }

        public SummaryPage(By facilityConfirmation, By hospitalReadmissionConfirmation, By visitDateConfirmation, By commentConfirmation, By goToHomepageBtn) {
            this.facilityConfirmation = facilityConfirmation;
            this.hospitalReadmissionConfirmation = hospitalReadmissionConfirmation;
            this.visitDateConfirmation = visitDateConfirmation;
            this.commentConfirmation = commentConfirmation;
            this.goToHomepageBtn = goToHomepageBtn;
        }

        public SummaryPage(WebDriver driver, WebDriverWait driverWait, By facilityConfirmation, By hospitalReadmissionConfirmation, By visitDateConfirmation, By commentConfirmation, By goToHomepageBtn) {
            super(driver, driverWait);
            this.facilityConfirmation = facilityConfirmation;
            this.hospitalReadmissionConfirmation = hospitalReadmissionConfirmation;
            this.visitDateConfirmation = visitDateConfirmation;
            this.commentConfirmation = commentConfirmation;
            this.goToHomepageBtn = goToHomepageBtn;
        }

        public By getFacilityConfirmation() {
            return facilityConfirmation;
        }

        public void setFacilityConfirmation(By facilityConfirmation) {
            this.facilityConfirmation = facilityConfirmation;
        }

        public By getHospitalReadmissionConfirmation() {
            return hospitalReadmissionConfirmation;
        }

        public void setHospitalReadmissionConfirmation(By hospitalReadmissionConfirmation) {
            this.hospitalReadmissionConfirmation = hospitalReadmissionConfirmation;
        }

        public By getVisitDateConfirmation() {
            return visitDateConfirmation;
        }

        public void setVisitDateConfirmation(By visitDateConfirmation) {
            this.visitDateConfirmation = visitDateConfirmation;
        }

        public By getCommentConfirmation() {
            return commentConfirmation;
        }

        public void setCommentConfirmation(By commentConfirmation) {
            this.commentConfirmation = commentConfirmation;
        }

        public By getGoToHomepageBtn() {
            return goToHomepageBtn;
        }

        public void setGoToHomepageBtn(By goToHomepageBtn) {
            this.goToHomepageBtn = goToHomepageBtn;
        }
    }

