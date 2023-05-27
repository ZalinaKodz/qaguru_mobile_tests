package tests;

import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

@Tag("ios")
public class LanguageIosTests extends TestBase{
    @Test
    @DisplayName("Set language")
    void italianoLanguageTest() {
        step("Tape menu", () ->
                $(AppiumBy.id("org.wikipedia.alpha:id/menu_overflow_button")).click());
        step("Tape Settings", () ->
                $(AppiumBy.id("org.wikipedia.alpha:id/explore_overflow_settings")).click());
        step("Choose Wikipedia language", () ->
                $(AppiumBy.id("android:id/summary")).click());
        step("Taping 'Italiano'", () ->
                $(AppiumBy.id("org.wikipedia.alpha:id/preference_languages_filter")).sendKeys("Italiano"));
                $(AppiumBy.id("org.wikipedia.alpha:id/language_subtitle")).click();
        step("Check that we got selected language in settings", () -> {
            $(AppiumBy.id("android:id/summary")).shouldHave(exactText("Italiano"));
        });
    }

}
