package string.assigment_problems;

public class ATMPinLengthValidator {

    public static void validatePIN(String pin) {

        if (pin.length() == 4 || pin.length() == 6) {
            System.out.println("Valid PIN");
        } else {
            System.out.println("Invalid PIN");
        }
    }

    public static void main(String[] args) {

        String pin = "1234";

        validatePIN(pin);
    }
}
