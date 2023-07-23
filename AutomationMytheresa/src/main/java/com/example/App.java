package com.example;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import java.nio.file.Paths;
/**
 * Hello world!
 *
 */
public class App{
    public static void main( String[] args ){
      try (Playwright playwright = Playwright.create()) {
        Browser browser = playwright.chromium().launch( new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        page.navigate("http://playwright.dev");
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("example.png")));
          System.out.println(page.title());
      }
        System.out.println( "Done this demo");
    }
}
