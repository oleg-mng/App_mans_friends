import java.util.Scanner;

public class View {

    public static void getNewValue() {
        String r = "";

        Scanner in = new Scanner(System.in);

        System.out.println("Хотите добавить команду в базу? (Y/n) : ");

        if (in.hasNextLine()) {
            r = in.nextLine();
        }

        if (r.equals("y") || r.equals("") || r.equals("Y")) {
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

        System.out.println("Хотите обучить животное новой команде? (Y/n) :  ");
        String ad = null;
        if (in.hasNextLine()) {
            ad = in.nextLine();
        }

        if (ad.equals("y") || ad.equals("Y") || ad.equals("")) {
            System.out.println("Введите id животного: ");
            String studyId = null;
            if (in.hasNextLine()) {
                studyId = in.nextLine();
            }
        }

        in.close();

    }
}

