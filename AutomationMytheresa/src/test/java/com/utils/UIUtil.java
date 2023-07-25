package com.utils;

import com.microsoft.playwright.JSHandle;
import com.microsoft.playwright.Page;
import com.testcases.BaseTest;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * @Description: functions for web actions
 * @Author: Chi-Chun Chang
 * @Date: 2023/07/22
 */
public class UIUtil {
    static Logger logger = Logger.getLogger(BaseTest.class.getName());

    public static void webClick(Page page, String keyword) {
        String pageSource = page.content();

        // Extract all "a" elements with class "button" and get their href attributes
        Pattern pattern = Pattern.compile("<a\\s+class=\"button\"\\s+target=\"_self\"\\s+href=\"(.*?)\"");
        Matcher matcher = pattern.matcher(pageSource);
        // Get the first half of the current URL
        String baseUrl = page.url().split(".com")[0] + ".com";

        // Loop through all the "a" elements with class "button"
        while (matcher.find()) {
            String href = matcher.group(1);

            // Check if the href attribute contains the provided keyword
            if (href.contains(keyword)) {
                // Navigate to the URL and click the link
                try {
                    page.navigate(baseUrl + href);
                    page.waitForLoadState();
                    Thread.sleep(2000);

                    // Get the current URL after the click
                    String currentUrl = page.url();
                } catch (Exception e) {
                    logger.info("Error occurred while clicking link with URL: " + href);
                    e.printStackTrace();
                }

                // Break out of the loop after clicking the first link that matches the keyword
                break;
            }
        }
    }


    public static void writeCSV(String fileName, List<String> prNames, List<String> creationDates, List<String> authors) {
        String timestamp = CommonUtil.getTimestamp();
        String full_filename = fileName + timestamp + ".csv";
        try {
            FileWriter csvWriter = new FileWriter(full_filename);

            // Write the CSV header
            csvWriter.append("PR Name");
            csvWriter.append(",");
            csvWriter.append("Creation Date");
            csvWriter.append(",");
            csvWriter.append("Author");
            csvWriter.append("\n");

            // Write the PR data
            for (int i = 0; i < prNames.size(); i++) {
                String prName = prNames.get(i).replaceAll("\"", "\"\""); // Escape double quotes
                csvWriter.append("\"" + prName + "\""); // Enclose PR name in double quotes
                csvWriter.append(",");
                csvWriter.append(creationDates.get(i));
                csvWriter.append(",");
                csvWriter.append(authors.get(i));
                csvWriter.append("\n");
            }

            csvWriter.flush();
            csvWriter.close();

            logger.info("Data has been successfully written to " + full_filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void clickPopup(Page page) {
        // Keep updating this part when any new popup is added
        String keywords = "Confirm selection and continue";
        // String keywords = "ACCEPT ALL AND CONTINUE";

        // Do not use for loop
        String pageSource = page.content();
        while (true) {
            if (pageSource.contains(keywords)) {

                logger.info(keywords);
                clickButtonByText(page, keywords);
            } else {
                break;
            }
            pageSource = page.content();
        }
    }

    public static void clickButtonByText(Page page, String keyword) {
        String jsScript = "Array.from(document.querySelectorAll('button')).find(btn => btn.textContent.trim() === '" + keyword + "')";
        logger.info(jsScript);
        JSHandle handle = (JSHandle) page.evaluateHandle(jsScript);
        if (handle != null) {
            handle.asElement().click();
        } else {
            logger.warning("Button not found with text: " + keyword);
        }
    }

    public static void clickElementByXPath(Page page, String xpathExpression) {
        String jsScript = "document.evaluate(\"" + xpathExpression + "\", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue";
        JSHandle handle = (JSHandle) page.evaluateHandle(jsScript);
        if (handle != null) {
            handle.asElement().click();
        } else {
            logger.warning("Element not found with XPath: " + xpathExpression);
        }
    }
}
