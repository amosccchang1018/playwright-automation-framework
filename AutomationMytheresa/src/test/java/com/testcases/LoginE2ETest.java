package com.testcases;

import com.constants.BrowserConstant;
import com.constants.DomainConstant;
import com.constants.IconConstant;
import com.constants.UrlConstant;
import com.microsoft.playwright.Locator;
import com.utils.UIUtil;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @Description: Login E2E test
 * @Author: Chi-Chun Chang
 * @Date: 2023/07/25
 */

public class LoginE2ETest extends BaseTest {

    @BeforeClass
    public void beforeClass(){
        setDomain(DomainConstant.getStage());
        setUrl(UrlConstant.MainPage);
        setBrowser(BrowserConstant.Chrome);
        setUp();
    }

    @AfterClass
    public void afterClass() {
        tearDown();
    }

    @Test(description = "E2E test - successful login")
    public void testLogin() throws InterruptedException {
        String url = getUrl();

        // Navigate to the URL
        page.navigate(url);
        page.waitForLoadState();
        UIUtil.webClick(page, IconConstant.LoginIcon);
        logger.info( "now new url is : "+ page.url());

        // set cookie
        setCookie(page, "mt_csf", "15340000");

        // reload the page
        page.reload();
        page.waitForLoadState();

        // TODO: Investigate and address the issue of the unclickable button on the popup page.
        UIUtil.clickPopup(page);

        Locator emailInput = page.locator("input[name=\"email\"]").first();
        Locator passwordInput = page.locator("input[name=\"password\"]").first();

        // Enter the email and password values into the input fields
        emailInput.fill("ccchang@maildrop.cc");
        passwordInput.fill("1qaz@Wsx");

        // Find the button by its class and text content
        Locator loginButton = page.locator(".button__text:has-text(\"Log in\")");
        loginButton.click();

        // Check page source, should contain right info
        softAssert.assertEquals(page.content(),"Welcome Chi-Chun");
    }

    @Test(description = "E2E test - failed login")
    public void testLoginFailure(){
        // TODO: Explore all scenarios that should result in a failed login attempt
    }

    @Test(description = "E2E test - concurrent logins", enabled=false)
    public void testLoginConcurrency(){
        // TODO: Implement concurrent login functionality
    }
}
