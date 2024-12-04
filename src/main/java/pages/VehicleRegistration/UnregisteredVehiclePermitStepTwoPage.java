package pages.VehicleRegistration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class UnregisteredVehiclePermitStepTwoPage {
    private WebDriver driver;

    //Constructor
    public UnregisteredVehiclePermitStepTwoPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


}
