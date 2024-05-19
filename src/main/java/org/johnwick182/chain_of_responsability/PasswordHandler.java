package org.johnwick182.chain_of_responsability;

public interface PasswordHandler {
    void setNextHandler(PasswordHandler passwordHandler);
    boolean isValid(String password);
}
