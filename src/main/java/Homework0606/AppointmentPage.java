package Homework0606;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



    public class AppointmentPage extends BasePage {

        private By facilityList = By.id("combo_facility");
        private By hospitalReadmission = By.id("chk_hospotal_readmission");
        //private By healthcareProgram = By.xpath("//*[@name='programs'][@value='\"+ radioInputName +\"']");
        private By healthcareProgramMedicare = By.id("radio_program_medicare");
        private By healthcareProgramMedicaid = By.id("radio_program_medicaid");
        private By healthcareProgramNone = By.id("radio_program_none");
        private By visitDate = By.id("txt_visit_date");
        private By comment = By.id("txt_comment");
        private By bookAppointmentBtn = By.id("btn-book-appointment");

        public void enterFacilityTokyo (){
            threadWait();
            Select facilityFromList = new Select(getDriver().findElement(facilityList));
            facilityFromList.selectByVisibleText("Tokyo CURA Healthcare Center");
        }
        public void enterFacilityHongkong (){
            threadWait();
            Select facilityFromList = new Select(getDriver().findElement(facilityList));
            facilityFromList.selectByVisibleText("Hongkong CURA Healthcare Center");
        }
        public void enterFacilitySeoul (){
            threadWait();
            Select facilityFromList = new Select(getDriver().findElement(facilityList));
            facilityFromList.selectByVisibleText("Seoul CURA Healthcare Center");
        }
        public void hospitalReadmissionChk () {
            getDriver().findElement(hospitalReadmission).click();
        }
        public void healthcareProgramChk (){
            getDriver().findElement(healthcareProgramMedicare).click();
        }
        public void enterVisitDate (){
            getDriver().findElement(visitDate).sendKeys("21/09/2020");
        }
        public void enterComment (){
            getDriver().findElement(comment).sendKeys("Ovo je komentar");
        }
        public void pressBookAppointmentBtn (){
            getDriver().findElement(bookAppointmentBtn).click();
            threadWait();
        }

        public void makeAppointmentAll (){
            enterFacilityTokyo();
            hospitalReadmissionChk();
            healthcareProgramChk();
            enterVisitDate();
            enterComment();
            pressBookAppointmentBtn();
            threadWait();
        }

        public boolean isFormPresented (){
            boolean form = false;
            String urlActual = getDriver().getCurrentUrl();
            if (urlActual.equals("https://katalon-demo-cura.herokuapp.com/#appointment")){
                form = true;
            }
            return form;
        }

        public AppointmentPage() {
        }

        public AppointmentPage(WebDriver driver, WebDriverWait driverWait) {
            super(driver, driverWait);
        }

        public AppointmentPage(By facilityList, By hospotalReadmission, By healthcareProgramMedicare, By healthcareProgramMedicaid, By healthcareProgramNone, By visitDate, By comment, By bookAppointmentBtn) {
            this.facilityList = facilityList;
            this.hospitalReadmission = hospotalReadmission;
            this.healthcareProgramMedicare = healthcareProgramMedicare;
            this.healthcareProgramMedicaid = healthcareProgramMedicaid;
            this.healthcareProgramNone = healthcareProgramNone;
            this.visitDate = visitDate;
            this.comment = comment;
            this.bookAppointmentBtn = bookAppointmentBtn;
        }

        public AppointmentPage(WebDriver driver, WebDriverWait driverWait, By facilityList, By hospotalReadmission, By healthcareProgramMedicare, By healthcareProgramMedicaid, By healthcareProgramNone, By visitDate, By comment, By bookAppointmentBtn) {
            super(driver, driverWait);
            this.facilityList = facilityList;
            this.hospitalReadmission = hospotalReadmission;
            this.healthcareProgramMedicare = healthcareProgramMedicare;
            this.healthcareProgramMedicaid = healthcareProgramMedicaid;
            this.healthcareProgramNone = healthcareProgramNone;
            this.visitDate = visitDate;
            this.comment = comment;
            this.bookAppointmentBtn = bookAppointmentBtn;
        }

        public By getFacilityList() {
            return facilityList;
        }

        public void setFacilityList(By facilityList) {
            this.facilityList = facilityList;
        }

        public By getHospotalReadmission() {
            return hospitalReadmission;
        }

        public void setHospotalReadmission(By hospotalReadmission) {
            this.hospitalReadmission = hospotalReadmission;
        }

        public By getHealthcareProgramMedicare() {
            return healthcareProgramMedicare;
        }

        public void setHealthcareProgramMedicare(By healthcareProgramMedicare) {
            this.healthcareProgramMedicare = healthcareProgramMedicare;
        }

        public By getHealthcareProgramMedicaid() {
            return healthcareProgramMedicaid;
        }

        public void setHealthcareProgramMedicaid(By healthcareProgramMedicaid) {
            this.healthcareProgramMedicaid = healthcareProgramMedicaid;
        }

        public By getHealthcareProgramNone() {
            return healthcareProgramNone;
        }

        public void setHealthcareProgramNone(By healthcareProgramNone) {
            this.healthcareProgramNone = healthcareProgramNone;
        }

        public By getVisitDate() {
            return visitDate;
        }

        public void setVisitDate(By visitDate) {
            this.visitDate = visitDate;
        }

        public By getComment() {
            return comment;
        }

        public void setComment(By comment) {
            this.comment = comment;
        }

        public By getBookAppointmentBtn() {
            return bookAppointmentBtn;
        }

        public void setBookAppointmentBtn(By bookAppointmentBtn) {
            this.bookAppointmentBtn = bookAppointmentBtn;
        }
    }

