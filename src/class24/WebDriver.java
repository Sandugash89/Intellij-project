package class24;

public interface WebDriver {
    /*Create a WebDriver Interface that will have the following unimplemented behaviour:
    openBrowser(), closeBrowser(), maximizeWindow(), findElement(). Create 2 classes that implements WebDriver interface:
    ChromeDriver and FirefoxDriver.
     */
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}
class Chromedriver implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("Open the ChromeBrowser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close the Chrome");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize the window");
    }

    @Override
    public void findElement() {
        System.out.println("find Element in Google Chrome");
    }
}
class Firefox implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("Open the Firefox");
    }

    @Override
    public void closeBrowser() {
        System.out.println("close the Firefox");
            }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize window in FireFox");
    }

    @Override
    public void findElement() {
        System.out.println("find the Element in Firefox");
    }
}
