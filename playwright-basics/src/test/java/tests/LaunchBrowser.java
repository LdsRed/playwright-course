package tests;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class LaunchBrowser {

    public static void main(String[] args) throws InterruptedException {

        try(Playwright playwright = Playwright.create();
        Browser browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage()){

        page.navigate("https://google.com");
        System.out.println(page.title());
        Thread.sleep(5000);
        }
    }
}
