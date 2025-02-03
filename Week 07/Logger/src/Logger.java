import java.io.*;

public class Logger {

    private String logFile;

    public Logger(String name) throws IOException {
        this.logFile = name;
        File file = new File(this.logFile);
        file.createNewFile();
    }

    public void permission() {
        File file = new File(this.logFile);
        String format = "%-40s%%n";
        System.out.printf(format, "permission","value");
        System.out.printf(format, "Write", file.canWrite());
        System.out.printf(format, "Read", file.canRead());
        System.out.printf(format, "Execute", file.canExecute());
    }

    public void log(String msg) {
        try(BufferedWriter fw =  new BufferedWriter(new FileWriter(logFile, true))) {
            fw.write(msg);
            fw.write(System.lineSeparator());
        } catch (IOException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
