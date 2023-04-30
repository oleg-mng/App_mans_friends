import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class View {

    public static void getNewValue() {
        Scanner in = new Scanner(System.in);
        System.out.println("Хотите добавить команду в базу? (Y/n) : ");
        String r = null;

        if (in.hasNextLine()) {
            r = in.nextLine();
        }

        if (r.equals("y") || r.equals("") || r.equals("Y")) {
            System.out.println("Введите value команды, которую хотите добавить: ");
            String val = "";
            if (in.hasNext()) {
                val = in.next();
            }

            System.out.println("Введите id команды, которую хотите добавить: ");
            int n = in.nextInt();

            ComandForAnimal.addComandInMap(n, val);
//            ComandForAnimal.getHmpCom();
        }

        System.out.println("Хотите обучить питомца новой команде? (Y/n) :  ");

        String ad = "";
        if (in.hasNext()) {
            ad = in.next();
        }

        if (ad.equals("y") || ad.equals("") || ad.equals("Y")) {
            System.out.println("Введите id животного: ");
            int studyId = 0;
            if (in.hasNextInt()) {
                studyId = in.nextInt();
            }
            System.out.println("Вот его параметры: ");
            Controller.searchAnimalOnId(Controller.choice(), studyId);

            System.out.println("Введите номер новой команды для обучения: ");
            int nw = 0;
            if (in.hasNextInt()) {
                nw = in.nextInt();
            }
            Controller.searchAndAddCommand(Controller.choice(), studyId, nw);
        }

        System.out.println("Сегодня мы можем добавить новое животное. Интересно? (Y/n) :  ");
        String anm = null;
        if (in.hasNext()) {
            anm = in.next();
        }

            if (anm.equals("y") || anm.equals("") || anm.equals("Y")) {
                System.out.println("Введите id нового животного: ");
                int anmId = 0;
                if (in.hasNextInt()) {
                    anmId = in.nextInt();
                }
                System.out.println("Введите name нового животного:  ");
                String anmName = "";
                if (in.hasNext()) {
                    anmName = in.next();
                }

                System.out.println("Введите год рождения: ");
                int year = 0;
                if (in.hasNextInt()) {
                    year = in.nextInt();
                }
                System.out.println("Введите месяц рождения рождения: ");
                int month = 0;
                if (in.hasNextInt()) {
                    month = in.nextInt();
                }
                System.out.println("Введите день рождения рождения: ");
                int day = 0;
                if (in.hasNextInt()) {
                    day = in.nextInt();
                }
                System.out.println("Введите класс, например pack(вьючное) ");
                String cla = "";
                if (in.hasNext()) {
                    cla = in.next();
                }
                System.out.println("Введите команду, которую знает питомец: ");
                int cd = 0;
                if (in.hasNextInt()) {
                    cd = in.nextInt();
                }

                Controller.choice();
                ArrayList<PackAnimal> dl = AddAnimal.addSomePetAnimal(Controller.choice(),anmId, anmName, LocalDate.of(year, month, day),
                        cla, 5, new ArrayList<>(Arrays.asList(cd)));
                System.out.println("Новое животное добавлено:");
                AddAnimal.printList(dl);
                Controller.searchAnimalOnId(Controller.choice(), anmId);
            }

        System.out.println("Exit");

        in.close();
    }
}

