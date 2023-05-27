package tests;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.openqa.selenium.By.id;

@Tag("ios")
public class WikiIosTests extends TestBase{
    @Test
    @DisplayName("Mobile wiki page search test by IOS device")
    void loginTest() {
        step("Click button", () ->{
            $(id("Text Button")).click();
        });
        step("Write email", () ->{
            $(id("Text Input")).click();
            $(id("Text Input")).sendKeys("mail@gmail.com");
            $(id("Text Input")).pressEnter();
        });
        step("Check result", () ->{
            assertEquals("mail@gmail.com", $(id("Text Output")).getText());
        });
    }


}
