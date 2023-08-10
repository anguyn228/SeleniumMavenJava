package org.example.WebDriver;

import org.example.common.BaseTest;
import org.openqa.selenium.WindowType;

public class AdvancedBrowser extends BaseTest {
    public static void main(String[] args) {
        createDriver();
        driver.get("https://anhtester.com");

        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("https://google.com");

        sleep(2);

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://anhtester.com/blog");

        closeDriver();
    }
}
