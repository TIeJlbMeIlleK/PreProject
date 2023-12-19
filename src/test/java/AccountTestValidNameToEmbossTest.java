import io.qameta.allure.Step;
import org.junit.Assert;
import org.junit.Test;

public class AccountTestValidNameToEmbossTest {

    @Test
    @Step("Валидное имя")
    public void testValidNameToEmboss() {
        Account account = new Account("John Doe");
        Assert.assertTrue(account.checkNameToEmboss());
    }
}