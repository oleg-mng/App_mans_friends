import java.util.Scanner;

public class View {
//    public static int getNumber() {
//
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите id команды, которую хотите добавить: ");
//        int n = in.nextInt();
//
//        in.close();
//
//        return n;
//    }
    public static String getNewValue() {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите value команды, которую хотите добавить: ");
        String val = null;
        if (in.hasNextLine()) {
            val = in.nextLine();
        }

        System.out.println("Введите id команды, которую хотите добавить: ");
        int n = in.nextInt();

        ComandForAnimal.addComandInMap(n, val);
        ComandForAnimal.getHmpCom();

        in.close();

        return val;
    }
}

