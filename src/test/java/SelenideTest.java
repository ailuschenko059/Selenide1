import TestBase.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pajeObjects.SelenideObject;


@DisplayName("Проверки")
public class SelenideTest extends BaseTest {


    @Test
    @DisplayName("Проверки на Github")
    void selenideGhTest() {
        SelenideObject.openGhPage();
    }
}
