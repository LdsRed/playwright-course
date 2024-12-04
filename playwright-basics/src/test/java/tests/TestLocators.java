package tests;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class TestLocators {

    public static void main(String[] args) throws InterruptedException{

        try(Playwright playwright = Playwright.create();
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
            Page page = browser.newPage()) {

            page.navigate("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ifkv=AcMMx-cNTN4XuPk404x9VVsedSK1IzZt8zrbW3Twwdj1hZhFLxNTHxOTLNpyXtU3mFGaVeiEj78Qzw&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S-1925939443%3A1733268915794489&ddm=1");

            //page.locator("#identifierId").fill("canicas.michael");
            //Thread.sleep(2000);
            //page.locator(".VfPpkd-LgbsSe-OWXEXe-k8QpJ > div:nth-child(1)").click();
            //Thread.sleep(2000);
            page.fill("//*[@id=\"identifierId\"]", "canicas.michael", new Page.FillOptions().setTimeout(2000));
            page.click("button:has-text('Next')");
            Thread.sleep(5000);
        }
    }
}
