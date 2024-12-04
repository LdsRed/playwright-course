package tests;

import com.microsoft.playwright.*;

import java.util.List;

public class TestHandlingLinks {

    public static void main(String[] args) {


        try(Playwright playwright = Playwright.create();
            Browser browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
            Page page = browser.newPage()) {


            page.navigate("https://www.wikipedia.org/");

            List<ElementHandle> links = page.querySelectorAll("a");


            links.stream().map()





        }
    }
}
