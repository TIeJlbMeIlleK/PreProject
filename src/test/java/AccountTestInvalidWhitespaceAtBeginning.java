import io.qameta.allure.Step;
import org.junit.Assert;
import org.junit.Test;

public class AccountTestInvalidWhitespaceAtBeginning {

    @Test
    @Step("Пустота в начале")
    public void testInvalidWhitespaceAtBeginning() {
        Account account = new Account(" Jane Doe");
        Assert.assertFalse(account.checkNameToEmboss());
    }

}