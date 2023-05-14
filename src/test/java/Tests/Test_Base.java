package Tests;
import manager.ApplicationManagr;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Test_Base {
    static ApplicationManagr app = new ApplicationManagr();
    @BeforeSuite
    public void setUp(){
        app.init();
    }
    @AfterSuite
    public void tearDown(){
        app.stop();

    }
}
