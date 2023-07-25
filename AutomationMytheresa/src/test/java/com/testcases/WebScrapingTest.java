package com.testcases;

import com.constants.BrowserConstant;
import com.constants.DomainConstant;
import com.constants.UrlConstant;
import com.utils.UIUtil;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

/**
 * @Description: web scraping test
 * @Author: Chi-Chun Chang
 * @Date: 2023/07/23
 */

public class WebScrapingTest extends BaseTest {

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

    @Test(description = "UI test - Scraping datasheet from pull-request")
    public void testGitHubPRScraper() {

        // Navigate to the page
        String url = UrlConstant.GithubPRDemo;
        page.navigate(url);
        page.waitForLoadState();

        // Extract the PR names, creation dates, and authors
        List<String> prNames = (List<String>) page.evaluate(
                "Array.from(document.querySelectorAll('a.js-navigation-open')).map(el => el.innerText)");
        List<String> creationDates = (List<String>) page.evaluate(
                "Array.from(document.querySelectorAll('relative-time')).map(el => el.getAttribute('datetime'))");
        // Select only elements that have the 'data-hovercard-type="user"' attribute
        List<String> authors = (List<String>) page.evaluate(
                "Array.from(document.querySelectorAll('a.Link--muted[data-hovercard-type=\"user\"]')).map(el => el.innerText)");

        // Output the data in CSV format
        String fileName = "Github_PRs";
        UIUtil.writeCSV(fileName, prNames, creationDates, authors);
    }
}
