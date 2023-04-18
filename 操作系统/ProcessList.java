import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ProcessList {
    public static void main(String[] args) {
        try {
            // ��ȡ�ڴ������н����б�
            Process process = Runtime.getRuntime().exec("tasklist.exe /fo csv /nh");

            // ��ȡ�����б����
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line = reader.readLine() ;//��ȡ��1��
            while (line != null) {
                // �ָ�������ͽ���ID
            	String [] parts = line.split(",");
            	String name = parts[0].replaceAll("\"", "");
            	String pid = parts[1].replaceAll("\"", "");

                // ������̵���Ϣ
                System.out.println("Process Name: " + name);
                System.out.println("Process ID: " + pid);
                System.out.println();

                // ��ȡ��һ��
                line = reader.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
