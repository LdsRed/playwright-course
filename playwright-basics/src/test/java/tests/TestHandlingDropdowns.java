package tests;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.SelectOption;

import java.util.List;

public class TestHandlingDropdowns {

    public static void main(String[] args) throws InterruptedException {


        try(Playwright playwright = Playwright.create();
            Browser browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
            Page page = browser.newPage()) {


            page.navigate("https://www.wikipedia.org/");

            //Select by Value
            page.selectOption("select", "تۆرکجه");

            //Select by Text
            page.selectOption("select", new SelectOption().setLabel("تۆرکجه"));


            //Select by Index
            page.selectOption("select", new SelectOption().setIndex(4));

            /*
            Locator values = page.locator("select > option");
            System.out.println(values.count());

            for (int i = 0; i < values.count(); i++){
                System.out.println(values.nth(i).innerText() + " ----> " + values.nth(i).getAttribute("Lang"));
            }
            */

            List<ElementHandle> locators = page.querySelectorAll("select > option");

            locators.forEach(System.out::println);

        }
    }
}
