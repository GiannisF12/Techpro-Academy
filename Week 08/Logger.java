import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class Logger {

    private String logFile;

    public Logger(String name) throws IOException {
        this.logFile = name;
        File file = new File(logFile);
        file.createNewFile();
    }

    public Logger() throws IOException {
        this.logFile = LocalDate.now()+"_"+"18"+".log";
        System.err.println(logFile);
        File file = new File(logFile);
        file.createNewFile();
    }

    public void permissions() {
        File file = new File(logFile);
        String format = "%-40s%s%n";
        System.out.printf(format,"Permission","Value");
        System.out.printf(format, "Write", file.canWrite());
        System.out.printf(format, "Read", file.canRead());
        System.out.printf(format, "Execute", file.canExecute());
    }

    public void log(String msg){
        try(BufferedWriter fw = new BufferedWriter(new FileWriter(logFile, true))){
            fw.write(LocalDateTime.now()+ "-"+msg);
            fw.write(System.lineSeparator());
        } catch(IOException e){
            System.err.println(e);
        } catch (Exception e){
            System.err.println(e);
        }
    }

    public void printLog() {
        try (BufferedReader rd = new BufferedReader(new FileReader(logFile))) {
            String line = rd.readLine();
            while(line !=null){
                System.out.println(line);
                line = rd.readLine();
            }
        } catch(IOException e){
            System.err.println(e);
        } catch (Exception e){
            System.err.println(e);
        }
    }

    public void printLog(int limit) throws IOException{
        BufferedReader rd = new BufferedReader(new FileReader(logFile));
        try {
            String line = rd.readLine();
            int i =0;
            while(line !=null && i<limit){
                System.out.println(line);
                line = rd.readLine();
                i++;
            }
            
        } catch(IOException e){
            System.err.println(e);
        } catch (Exception e){
            System.err.println(e);
        } finally {
            rd.close();
        }
    }

}
