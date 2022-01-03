package class25.task5;

public interface WebDriver {
    void open();
    void close();
    String getTitle();
}
interface TakeScreenshort{
    void getScreenshot();
}
interface RemoteWebDriver extends TakeScreenshort, WebDriver{
    void navigate();
}
class ChromeDriver implements RemoteWebDriver{
    @Override
    public void open() {
        System.out.println("Openning Chrome Browser");
    }

    @Override
    public void close() {
        System.out.println("Closing Chrome Browser");

    }

    @Override
    public String getTitle() {
        return "Title from Google Chrome";
    }

    @Override
    public void getScreenshot() {
        System.out.println("Taking the screenshort from the Google Chrome");

    }

    @Override
    public void navigate() {
        System.out.println("Navigating in  Google Chrome");

    }
}
class FireFox implements RemoteWebDriver{
    @Override
    public void open() {
        System.out.println("Openning FireFox");

    }

    @Override
    public void close() {
        System.out.println("Closing FireFox");

    }

    @Override
    public String getTitle() {
        return "Title from FireFox";
    }

    @Override
    public void getScreenshot() {
        System.out.println("Taking the screenshort from the FireFox");

    }

    @Override
    public void navigate() {
        System.out.println("Navigating in  Firefox");

    }

}
class SafariDriver implements RemoteWebDriver{
    @Override
    public void open() {
        System.out.println("Openning Safari Browser");
            }

    @Override
    public void close() {
        System.out.println("Closing Safari Browser");

    }

    @Override
    public String getTitle() {
        return "Title from  Safari";
    }

    @Override
    public void getScreenshot() {
        System.out.println("Taking the screenshort from the  Safari");

    }

    @Override
    public void navigate() {
        System.out.println("Navigating in  Safari");

    }
}