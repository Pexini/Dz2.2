import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
public class CardTest {
    @Test
    void shouldOpenTest(){
        open ("http://0.0.0.0:9999");
    }
}
