import java.io.IOException;
import javax.swing.JOptionPane;

public class ProcessKill {
    public static void main(String[] args) {
        try {
            // ��ʾ�û�ȷ��
            int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to close Notepad?", "Confirm", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                // �رռ��±�����
                Runtime.getRuntime().exec("taskkill /f /im notepad.exe");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}