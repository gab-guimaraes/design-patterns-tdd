package org.johnwick182.chain_of_responsability;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class TestPassword {
    private PasswordHandler passwordHandler;

    @Before
    public void createPassowrd() {
        passwordHandler = new CheckUpperCaseHandler();
        passwordHandler.setNextHandler(new CheckLengthHandler());
    }

    @Test
    public void checkInvalidPassoword() {
        String smallPassowrd = "123";
        String largeWithoutU = "passwordwithoutupper";
        String okPassword = "@MyPassw";
        boolean result = passwordHandler.isValid(smallPassowrd);
        Assert.assertFalse("checking size", result);
        boolean result2 = passwordHandler.isValid(largeWithoutU);
        Assert.assertFalse("checking upper", result2 );
        boolean result3 = passwordHandler.isValid(okPassword);
        Assert.assertTrue("password ok", result3);
    }
}
