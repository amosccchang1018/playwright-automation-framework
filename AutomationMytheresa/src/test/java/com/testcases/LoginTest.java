package com.testcases;

import com.constants.BrowserConstant;
import com.constants.DomainConstant;
import com.constants.UrlConstant;
import com.microsoft.playwright.Response;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Description: Login functional test
 * @Author: Chi-Chun Chang
 * @Date: 2023/07/22
 */

public class LoginTest extends BaseTest {

    @BeforeClass
    public void beforeClass() {
        setDomain(DomainConstant.getStage());
        setUrl(UrlConstant.MainPage);
        setBrowser(BrowserConstant.Chrome);
        setUp();
    }

    @AfterClass
    public void afterClass() {
        tearDown();
    }

    @Test(description = "UI test - JavaScript error checking")
    public void testNoJavaScriptErrors() {
        // List to hold any JavaScript errors
        List<String> jsErrors = new ArrayList<>();

        // Listen for page-error events
        page.onPageError(pageError -> {
            logger.severe("JavaScript error: " + pageError);
            jsErrors.add(pageError);  // Add the error to our list
        });
        String url = getUrl();
        // Navigate to the URL
        page.navigate(url);

        // Assert that no JavaScript errors were found
        softAssert.assertTrue(jsErrors.isEmpty(), "JavaScript errors were found");
    }


    @Test(description = " UI test - monkey test (returning the expected status code)")
    public void testWebMonkey() {
        String url = getUrl();

        // Navigate to the URL
        page.navigate(url);
        page.waitForLoadState();

        String pageSource = page.content();

        // Extract all URLs behind href="..." using regular expression
        Pattern pattern = Pattern.compile("href=\"(.*?)\"");
        Matcher matcher = pattern.matcher(pageSource);
        while (matcher.find()) {
            String href = matcher.group(1);

            // Verify the link URL
            Response response = page.navigate(href);
            page.waitForLoadState();
            int statusCode = response.status();

            // Check if the status code is either 200 or 30x
            softAssert.assertTrue(statusCode == 200 || (statusCode >= 300 && statusCode < 400),
                    "Unexpected status code for link: " + href + ", Status code: " + statusCode);

            // Check if the status code is not 40x
            softAssert.assertFalse(statusCode >= 400 && statusCode < 500,
                    "Unexpected status code for link: " + href + ", Status code: " + statusCode);
        }
    }


    @Test(description = "API test - login related API test", enabled = false)
    public void testLogintest() {
        // TODO: Test login related APIs
    }
}
