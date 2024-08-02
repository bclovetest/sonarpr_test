import java.io.Serializable;

public class RCEVulnerableClass implements Serializable {

    private String command;

    public RCEVulnerableClass(String command) {
        this.command = command;
    }

    private void executeCommand() {
        try {
            Runtime.getRuntime().exec(command);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // 模拟接收用户输入的命令
        String userCommand = "whoami"; 
        RCEVulnerableClass rce = new RCEVulnerableClass(userCommand);

        
        rce.executeCommand(); // 执行用户输入的命令
    }
}