package pages.VehicleRegistration;

import enums.CarryingCapacity;
import enums.EngineCapacity;
import enums.PassengerVehicleType;
import enums.VehicleType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UnregisteredVehiclePermitStepOnePage {
    private WebDriver driver;

    //Constructor
    public UnregisteredVehiclePermitStepOnePage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//p[@class='progress-bar-title']")
    private WebElement stepOneTitle;

    @FindBy(xpath = "//label[contains(text(), 'Vehicle type')]/parent::div//select")
    private WebElement vehicleTypeDropdown;

    private String vehicleTypeDropdownXpath = "//label[contains(text(), '#')]/parent::div//select";

    @FindBy(xpath = "//label[contains(text(), 'Passenger vehicle type')]/parent::div//select")
    private WebElement passengerVehicleTypeDropdown;

    @FindBy(xpath = "//label[contains(text(), 'Carrying capacity')]/parent::div//select")
    private WebElement carryingCapacityDropdown;

    @FindBy(xpath = "//label[contains(text(), 'Engine capacity')]/parent::div//select")
    private WebElement engineCapacityDropdown;

    @FindBy(xpath = "(//div[@id='divAddressLine']//input)[1]")
    private WebElement addressLineTextbox;

    //Date in dd/mm/yyyy format
    @FindBy(xpath = "//div[contains(@class, 'datepicker-container')]//input")
    private WebElement permitStartDatePicker;

    @FindBy(xpath = "//div[@id='divPermitDuration']//select")
    private WebElement permitDurationDropdown;

    @FindBy(xpath = "//div[contains(@class, 'detail-total')]//a[contains(text(), 'Calculate')]")
    private WebElement calculatePermitFeeButton;

    @FindBy(xpath = "//input[@value='Next']")
    private WebElement nextButton;

    private void selectVehicleType(VehicleType vehicleType) {
        vehicleTypeDropdown.click();
        driver.findElement(By.xpath(vehicleTypeDropdownXpath
          .replace("#", vehicleType.getValue())));
    }

    private void selectPassengerVehicleType(PassengerVehicleType passengerVehicleType) {
        passengerVehicleTypeDropdown.click();
        driver.findElement(By.xpath(""
          .replace("","")));
    }

    private void selectCarryingCapacity(CarryingCapacity carryingCapacity) {
        carryingCapacityDropdown.click();
        driver.findElement(By.xpath(""
          .replace("","")));
    }

    private void selectEngineCapacity(EngineCapacity engineCapacity) {
        engineCapacityDropdown.click();
        driver.findElement(By.xpath(""
          .replace("","")));
    }

    //201 chars max;
    // The address must end in a valid Australian postcode. Address cannot just be a postal code
    public void setAddress(String address) {
        addressLineTextbox.sendKeys(address);
    }

    //public void enterPermitStartDate()
}
