
package Exceptions;

public class IsEndException extends Exception{

    @Override
    public String getMessage() {
        return "праздник продолжается";
    }
}