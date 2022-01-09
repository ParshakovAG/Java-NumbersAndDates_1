package practice;

import java.util.Scanner;

public class TrucksAndContainers {

    public static void main(String[] args) {
        final int CONTAINERS_IN_TRUCK = 12;
        final int BOXES_IN_CONTAINER = 27;
        int container = 1;
        int truck = 1;

        //получение количество коробок от пользователя
        Scanner scanner = new Scanner(System.in);
        int box = scanner.nextInt();
        if (box == 0) {
            container--;
            truck--;
        } else {

            System.out.println("Грузовик: " + truck);
            System.out.println("\tКонтейнер: " + container);
        }

        // TODO: вывести в консоль коробки разложенные по грузовикам и контейнерам
        for (int i = 1; i <= box; i++) {

            System.out.println("\t\tЯщик: " + i);

            if (i % (CONTAINERS_IN_TRUCK * BOXES_IN_CONTAINER) == 0) {
                truck += 1;

                System.out.println("Грузовик: " + truck);

            }
            if (i % BOXES_IN_CONTAINER == 0) {
                container += 1;

                System.out.println("\tКонтейнер: " + container);
            }
        }
        System.out.println("Необходимо:" + System.lineSeparator() + "грузовиков" + " - " + truck + " шт. "
                + System.lineSeparator() + "контейнеров" + " - " + container + " шт. ");

        // пример вывода при вводе 2
        // для отступа используйте табуляцию - \t

        /*
        Грузовик: 1
            Контейнер: 1
                Ящик: 1
                Ящик: 2
        Необходимо:
        грузовиков - 1 шт.
        контейнеров - 1 шт.
        */
    }

}
