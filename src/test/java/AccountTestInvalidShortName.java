import io.qameta.allure.Step;
import org.junit.Assert;
import org.junit.Test;

public class AccountTestInvalidShortName {

    @Test
    @Step("Короткое имя")
    public void testInvalidShortName() {
        Account account = new Account("Jo");
        Assert.assertFalse(account.checkNameToEmboss());
    }
}