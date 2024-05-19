package org.johnwick182.chain_of_responsability;

public class CheckLengthHandler extends PasswordBaseHandler {
    private static final int MIN_SIZE = 5;
    private static final int MAX_SIZE = 10;

    @Override
    public boolean isValid(String password) {
        System.out.println("checking size MIN: " + MIN_SIZE + " MAX: "+ MAX_SIZE);
        if (password.length() > MIN_SIZE && password.length() < MAX_SIZE) {
            System.out.println("size compatible");
            return super.isValid(password);
        } else {
            System.out.println("password: " + password + ", size not compatible");
            return false;
        }
    }
}
