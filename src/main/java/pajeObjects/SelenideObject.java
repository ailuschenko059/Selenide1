package pajeObjects;

import com.codeborne.selenide.Condition;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$$;

public class SelenideObject {

    public static void  openGhPage() {
        open("https://github.com");
        $(".header-search-input").click();
        $(".header-search-input").setValue("Selenide").pressEnter();
        $$(".repo-list").first().$("a").click();
        $("#wiki-tab").click();
        $("#wiki-pages-box button").click();
        $$("#wiki-pages-box li").find(Condition.text("SoftAssertions")).click();
        $$(".markdown-body h4").find(Condition.text("Junit5")).shouldBe(Condition.visible);
    }
}
