import io.qameta.allure.Step;
import org.junit.Assert;
import org.junit.Test;

public class AccountTestInvalidspaceAtEnd {

    @Test
    @Step("Пустота в конце")
    public void testInvalidWhitespaceAtEnd() {
        Account account = new Account("John Doe ");
        Assert.assertFalse(account.checkNameToEmboss());
    }

}