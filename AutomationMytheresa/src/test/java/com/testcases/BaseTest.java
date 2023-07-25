package com.testcases;

import com.microsoft.playwright.*;
import org.testng.asserts.SoftAssert;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;


/**
 * @Description: Testbed
 * @Author: Chi-Chun Chang
 * @Date: 2023/07/22
 */

public class BaseTest {

    // playwright
    private Playwright playwright;
    private Browser browser;
    private BrowserType browserType;
    private BrowserContext context;
    public Page page;

    // url (default QA domain)
    Logger logger = Logger.getLogger(BaseTest.class.getName());
    SoftAssert softAssert = new SoftAssert();
    String domain = "test";
    String baseUrl = "https://%s.%s";
    private static String fullUrl;
    private Map<String, String> keyMap = new HashMap<>();

    public void setKey(String key, String value) {
        keyMap.put(key, value);
    }
    public String getKey(String key) {
        return keyMap.get(key);
    }

    public void setDomain(String domain) {
        this.domain = domain;
        logger.info("domain : " + this.domain);
    }

    public void setUrl(String url) {
        if (domain == null) {
            throw new IllegalStateException("Domain is not set. Please set a domain first.");
        }
        fullUrl = String.format(baseUrl, domain, url);
        logger.info("url : " + fullUrl);
    }

    public String getUrl() {
        if (fullUrl == null) {
            throw new IllegalStateException("URL is not set. Please set a domain and URL first.");
        }
        return fullUrl;
    }

    public void setBrowser(String browserName) {
        playwright = Playwright.create();

        switch (browserName.toLowerCase()) {
            case "chromium":
                browserType = playwright.chromium();
                break;
            case "firefox":
                browserType = playwright.firefox();
                break;
            case "webkit":
                browserType = playwright.webkit();
                break;
            default:
                throw new IllegalArgumentException("Invalid browser name: " + browserName);
        }

        // Launch the browser (TODO : set a parameter to determin see or not)
        browser = browserType.launch(new BrowserType.LaunchOptions().setHeadless(true));
    }

    public  void setUp() {
        // Launch the browser and create a new page (with any header, otherwise will fail)
        context = browser.newContext();
        page = context.newPage();
        page.setExtraHTTPHeaders(getHeaders());
    }

    public void tearDown() {
        if (browser != null) {
            browser.close();
        }
        if (playwright != null) {
            playwright.close();
        }
    }

    public Map<String, String> getHeaders() {
        Map<String, String> headers = new HashMap<>();
        // Add more headers if needed
        headers.put("User-Agent",
                "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/88.0.4324.150 Safari/537.36");
        return headers;
    }

    public static void setCookie(Page page, String key,String value) {

        // Execute JavaScript code to set the cookie
        String script = String.format("document.cookie = '%s=%s'", key, value);
        page.evaluate(script);
    }

}
