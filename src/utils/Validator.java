package utils;

public class Validator {

    public static boolean empty( String... args ){
        boolean fill = false;
        for (String arg : args) {
            if ( arg.equals("") ) {
                fill = true;
            }
        }
        return fill;
    }
    
}
