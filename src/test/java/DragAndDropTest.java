import TestBase.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pajeObjects.DragAndDropPage;


@DisplayName("Drag&Drop")
public class DragAndDropTest extends BaseTest {

    @Test
    @DisplayName("Drag&Drop Тест")
    void  dragDropTest(){
        DragAndDropPage.dragAndDropActions();
    }
}
