public class LogLevels {
    
    public static String message(String logLine) {
        String msg = "";
        msg = logLine.substring(logLine.indexOf(":") + 1);
        return msg.trim();
    }

    public static String logLevel(String logLine) {
        String msg = logLine.substring(logLine.indexOf("[") + 1, logLine.indexOf("]"));
        return msg.toLowerCase();
    }

    public static String reformat(String logLine) {
        String msg = message(logLine) + " (" + logLevel(logLine) + ")"; 
        // String msg = logLine.substring(logLine.indexOf(":") + 2) 
           // + logLevel(logLine);
        return msg;
        
    }
}
