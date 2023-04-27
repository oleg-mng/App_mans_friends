import java.util.HashMap;

public class Comand {
    java.util.Map<Integer, String> hmpCom = new HashMap<>();
    public void addmap() {
        hmpCom.putIfAbsent(1, "go");
        hmpCom.putIfAbsent(2, "stop");
        hmpCom.putIfAbsent(3, "run");

        for (java.util.Map.Entry<Integer, String> entry : hmpCom.entrySet()) {
            System.out.println(entry);
        }
    }

    public void searchcomand (int n) {
        hmpCom.putIfAbsent(n, "go");
    }
}
