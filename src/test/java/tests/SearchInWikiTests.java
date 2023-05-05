package tests;

import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class SearchInWikiTests extends TestBase{
    @Test
    @DisplayName("Successful search")
    void successfulSearchTest() {
        step("Type search", () -> {
            $(AppiumBy.accessibilityId("Search Wikipedia")).click();
            $(AppiumBy.id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Idea");
        });
        step("Verify content found", () ->
                $(AppiumBy.id("org.wikipedia.alpha:id/view_card_header_title"))
                        .click());
    }

}
