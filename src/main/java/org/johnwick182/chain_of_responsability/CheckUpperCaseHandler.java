package org.johnwick182.chain_of_responsability;

public class CheckUpperCaseHandler extends PasswordBaseHandler {
    @Override
    public boolean isValid(String password) {
        System.out.println("Checking UPPER case...");
        return containsUpperCase(password);
    }

    public boolean containsUpperCase(String password) {
        for (char letter : password.toCharArray()) {
            if (Character.isUpperCase(letter)) {
                System.out.println("Upper case identified");
                return super.isValid(password);
            }
        }
        System.out.println("Upper case not identified");
        return false;
    }
}
