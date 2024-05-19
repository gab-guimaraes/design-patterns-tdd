package org.johnwick182.chain_of_responsability;

public class PasswordBaseHandler implements PasswordHandler {
    private PasswordHandler nextHandler;

    @Override
    public void setNextHandler(PasswordHandler passwordHandler) {
        this.nextHandler = passwordHandler;
    }

    @Override
    public boolean isValid(String password) {
        if (nextHandler != null) {
            System.out.println("calling next handler");
            return nextHandler.isValid(password);
        } else {
            return true;
        }
    }
}
