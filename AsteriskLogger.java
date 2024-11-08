package Week5;

public class AsteriskLogger implements Logger {

    
    public void log(String message) {
        System.out.println("***" + message + "***");
    }

 
    public void error(String message) {
        String errorMessage = "ERROR: " + message;
        int length = errorMessage.length() + 6;

        printAsteriskLine(length);
        System.out.println("***" + errorMessage + "***");
        printAsteriskLine(length);
    }

    
    private void printAsteriskLine(int length) {
        for (int i = 0; i < length; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
