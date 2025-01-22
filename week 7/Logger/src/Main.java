public class Main {
    public static void main(String[] args) throws Exception {
        Logger fileLogger = new Logger("app.log");
        fileLogger.permission();
        fileLogger.log("Application started");
        fileLogger.log("Application Ended");
    }
}