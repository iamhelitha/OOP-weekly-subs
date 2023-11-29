package Utilities;

public class InvalidBMIDetails extends RuntimeException{
    @Override
    public String getMessage() {
        return "Weight and Height cannot be zero or negative";
    }
}
