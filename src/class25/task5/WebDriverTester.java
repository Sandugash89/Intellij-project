package class25.task5;

public class WebDriverTester {
    public static void main(String[] args) {
        RemoteWebDriver[]remoteWebDrivers={new ChromeDriver(), new FireFox(),new SafariDriver()};
        for(RemoteWebDriver remote:remoteWebDrivers){
            //if(remote instanceof ChromeDriver){
              //  System.out.println(((ChromeDriver) remote).getTitle());
           // } else if(remote instanceof FireFox){
              //  System.out.println(((FireFox) remote).getTitle());
           // } else if (remote instanceof SafariDriver){
               // System.out.println(((SafariDriver) remote).getTitle());
         //   }
            remote.open();
            remote.close();
            remote.getScreenshot();
            remote.navigate();
            remote.getTitle();
        }

    }
}
