package base;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;

public class Base {
    protected WebDriver driver;

    @Autowired
    public Base(WebDriver driver) {
        this.driver = driver;
    }
}
