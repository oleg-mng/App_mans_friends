import java.util.Scanner;

public class View {
    public static int getNumber() {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите id команды, которую хотите добавить: ");
        int num = in.nextInt();

        in.close();

        return num;
    }
    public static String getNewValue() {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите value команды, которую хотите добавить: ");
        String val = in.nextLine();

        in.close();

        return val;
    }
}

