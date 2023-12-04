package tests.vendorportal;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.vendorportal.DashboardPage;
import pages.vendorportal.LoginPage;
import tests.AbstractTest;
import tests.vendorportal.model.VendorPortalTestData;
import util.Config;
import util.Constants;
import util.JsonUtil;

public class VendorPortalTest extends AbstractTest {

    private LoginPage loginPage;
    private DashboardPage dashboardPage;
    private VendorPortalTestData testData;

    @BeforeTest
    @Parameters("testDataPath")
    public void setPageObjects(String testDataPath){
        this.loginPage = new LoginPage(driver);
        this.dashboardPage = new DashboardPage(driver);
        this.testData = JsonUtil.getTestData(testDataPath, VendorPortalTestData.class);
    }

    @Test
    public void loginTest(){
        loginPage.goTo(Config.get(Constants.VENDOR_PORTAL_URL));
        Assert.assertTrue(loginPage.isAt());
        loginPage.login(testData.getUsername(), testData.getPassword());
    }

    @Test(dependsOnMethods = "loginTest")
    public void dashboardTest(){
        Assert.assertTrue(dashboardPage.isAt());

        Assert.assertEquals(dashboardPage.getMonthlyEarning(), testData.getMonthlyEarning());
        Assert.assertEquals(dashboardPage.getAnnualEarning(), testData.getAnnualEarning());
        Assert.assertEquals(dashboardPage.getProgitMargin(), testData.getProfitMargin());
        Assert.assertEquals(dashboardPage.getAvailableInventory(), testData.getAvailableInventory());

        dashboardPage.searchOrderHistoryBy(testData.getSearchKeyword());
        Assert.assertEquals(dashboardPage.getSearchResultsCount(), testData.getSearchResultsCount());

    }

    @Test(dependsOnMethods = "dashboardTest")
    public void logoutTest(){
        dashboardPage.logout();
        Assert.assertTrue(loginPage.isAt());

    }

}
