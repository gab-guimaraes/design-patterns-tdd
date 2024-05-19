package org.johnwick182.chain_of_responsability;

public class CheckHandlerMain {
    public static void main(String[] args) {
        PasswordHandler checkLengthHandler = new CheckLengthHandler();
        PasswordHandler checkUpperHandler = new CheckUpperCaseHandler();
        checkLengthHandler.setNextHandler(checkUpperHandler);
        boolean result = checkLengthHandler.isValid("@Blink182");

        System.out.println(result ? "password ok" : "password not ok");
    }
}
