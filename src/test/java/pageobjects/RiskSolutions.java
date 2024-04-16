package pageobjects;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Map;

import static pageobjects.CommonPageObject.*;
public class RiskSolutions {

    private final String BaseURL = "https://risk.lexisnexis.co.uk";
    private final By ACCEPT_COOKIES = By.id("onetrust-accept-btn-handler");

    private final String CHOOSE_YOUR_INDUSTRY = ("Choose Your Industry");
    private final String FINANCIAL_SERVICES = ("Financial Services");

    @Step("Open Home Page")
    public void openPage() {
        open(BaseURL);
    }
    @Step("Handle Cookies")
    public void handleCookies() {
        if (probe(ACCEPT_COOKIES)) {
            click();
        }
    }

    @Step("Verify Industry Links and URLs")
    public void checkIndustryLinks(List<Map<String, String>> links) {
        for (Map<String, String> row : links) {
            openPage();
            findTagWithText(HtmlTag.H4,row.get("LinkText"));
            ascend();
            click();
            urlContains(row.get("Link"));
        }
    }
    @Step("Verify Financial Services Links and URLs")
    public void checkFinancialServicesLinks(List<Map<String, String>> links) {
        for (Map<String, String> row : links) {
            selectIndustry(FINANCIAL_SERVICES);
            findTagWithText(HtmlTag.DIV,row.get("LinkText"));
            ascend();
            click();
            urlContains(row.get("Link"));
        }
    }
    @Step("Select Industry from Home Page")
    public void selectIndustry( String industry ) {
        openPage();
        findElementByLinkText(CHOOSE_YOUR_INDUSTRY);
        click();
        findTagWithText(HtmlTag.DIV, industry);
        ascend();
        click();
    }
}
