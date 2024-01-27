package Utilities;

public class InvalidBMIException extends RuntimeException {

    @Override
    public String getMessage() {
        return "Weight and Height cannot be Zero or Negative";
    }
}
