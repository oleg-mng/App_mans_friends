import java.util.HashMap;
import java.util.Map;

class ComandForAnimal {
    int n;
    int com;
    static java.util.Map<Integer, String> hmpCom = new HashMap<>();
    public static Map<Integer, String> getHmpCom() {
        hmpCom.put(1, "go");
        hmpCom.put(2, "stop");
        hmpCom.put(3, "run");
        hmpCom.put(4, "sit");
        hmpCom.put(5, "lie");
        hmpCom.put(6, "jump");
        hmpCom.put(7, "come up");

        System.out.println("Список доступных команд: ");
        for (java.util.Map.Entry<Integer, String> entry : hmpCom.entrySet()) {
            System.out.println(entry);
        }
        return hmpCom;
    }
    public Map<Integer, String> addSomeComand(Map<Integer, String> hmpCom, int com){
        return hmpCom;
    }

    public static void addMap() {
        hmpCom.put(1, "go");
        hmpCom.put(2, "stop");
        hmpCom.put(3, "run");
        hmpCom.put(4, "sit");
        hmpCom.put(5, "lie");
        hmpCom.put(6, "jump");
        hmpCom.put(7, "come up");

        System.out.println("Список доступных команд: ");
        for (java.util.Map.Entry<Integer, String> entry : hmpCom.entrySet()) {
            System.out.println(entry);
        }
    }

    public void searchComand (int n) {
        System.out.println(hmpCom.get(n));
    }
}