import java.io.IOException;

public class ProcessRun {
    public static void main(String[] args) {
        try {
            // ���м��±�����
            Runtime.getRuntime().exec("notepad.exe");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}