import java.util.Scanner;

public class View {

    public static void getNewValue() {
        String r = "";

        Scanner in = new Scanner(System.in);

        System.out.println("Хотите добавить команду в базу? (y/n) : ");

        if (in.hasNextLine()) {
            r = in.nextLine();
        }

        if (r.equals("y")) {
            System.out.println("Введите value команды, которую хотите добавить: ");
            String val = null;
            if (in.hasNextLine()) {
                val = in.nextLine();
            }

            System.out.println("Введите id команды, которую хотите добавить: ");
            int n = in.nextInt();

            ComandForAnimal.addComandInMap(n, val);
            ComandForAnimal.getHmpCom();

        }

        in.close();

    }
}

