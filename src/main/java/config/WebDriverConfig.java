package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebDriverConfig {
    @Bean
    public WebDriver webDriver() {
        System.setProperty("webdriver.chrome.driver", "path_to_chrome_driver");
        return new ChromeDriver();
    }
}
