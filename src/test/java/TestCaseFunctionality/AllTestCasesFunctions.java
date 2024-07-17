package TestCaseFunctionality;

import AutomationExcercise.*;
import OrangeHRM.OrangeHRMDashBoardPage;
import OrangeHRM.OrangeHRMLoginPage;
import VehicalInsuranceApplication.AutomobileClass;
import commonLibrarymethods.CommonResuableMethods;
import org.openqa.selenium.*;
import extentreport.ExtentReportGenerationClass;

public class AllTestCasesFunctions extends ExtentReportGenerationClass {

    CommonResuableMethods com=new CommonResuableMethods();
    OrangeHRMLoginPage olp= new OrangeHRMLoginPage();
    OrangeHRMDashBoardPage odp=new OrangeHRMDashBoardPage();
    public void TestOranageHRM1(WebDriver driver,String strUserName,String strUserPassword ){
        com.clickElement(driver,olp.getUserNameTextField(),"Login Button");
        com.type(driver,olp.getUserNameTextField(),"Username",strUserName);
        com.clickElement(driver,olp.getUserPasswordTextField(),"Login Button");
        com.type(driver,olp.getUserPasswordTextField(),"Password",strUserPassword);
        com.clickElement(driver,olp.getLoginButton(),"Login Button");
        com.clickElement(driver,odp.getAdminTab(),"Admin link");
        com.clickElement(driver,odp.getProfilePic(),"MandaUser link");
        com.clickElement(driver,odp.getLogoutLink(),"Logout link");
    }

    public void TestOranageHRM2(WebDriver driver,String strUserName,String strUserPassword ){
        com.clickElement(driver,olp.getUserNameTextField(),"Login Button");
        com.type(driver,olp.getUserNameTextField(),"Username",strUserName);
        com.clickElement(driver,olp.getUserPasswordTextField(),"Login Button");
        com.type(driver,olp.getUserPasswordTextField(),"Password",strUserPassword);
        com.clickElement(driver,olp.getLoginButton(),"Login Button");
        com.clickElement(driver,odp.getAdminTab(),"Admin link");
        com.clickElement(driver,odp.getProfilePic(),"MandaUser link");
        com.clickElement(driver,odp.getLogoutLink(),"Logout link");
    }

    public void TestOranageHRM3(WebDriver driver,String strUserName,String strUserPassword ){
        com.clickElement(driver,olp.getUserNameTextField(),"Login Button");
        com.type(driver,olp.getUserNameTextField(),"Username",strUserName);
        com.clickElement(driver,olp.getUserPasswordTextField(),"Login Button");
        com.type(driver,olp.getUserPasswordTextField(),"Password",strUserPassword);
        com.clickElement(driver,olp.getLoginButton(),"Login Button");
        com.clickElement(driver,odp.getAdminTab(),"Admin link");
        com.clickElement(driver,odp.getProfilePic(),"MandaUser link");
        com.clickElement(driver,odp.getLogoutLink(),"Logout link");
    }




}
