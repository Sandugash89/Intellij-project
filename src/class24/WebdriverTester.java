package class24;

public class WebdriverTester {
    public static void main(String[] args) {
        WebDriver driver = new Chromedriver();
        driver.openBrowser();
        driver.closeBrowser();
        driver.maximizeWindow();
        driver.findElement();

        WebDriver driver1 = new Firefox();
        driver1.openBrowser();
        driver1.closeBrowser();
        driver1.maximizeWindow();
        driver1.findElement();
    }

}
