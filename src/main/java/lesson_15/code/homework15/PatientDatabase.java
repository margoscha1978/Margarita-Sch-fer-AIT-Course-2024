package homework15;
/*   Задание: Программа для управления базой данных больницы, напишите
 консольное приложение, которое позволяет управлять базой данных пациентов и услуг в больнице.
В программе должны быть реализованы следующие функции:
1.	Добавление пациента: Предусмотрите возможность добавления нового пациента с именем и фамилией в список пациентов.
2.	Удаление пациента: Удалите пациента по имени и фамилии.
3.	Поиск пациента: Найдите пациента в списке по имени и фамилии.
4.	Обновление данных пациента: Позволяет изменить имя или фамилию пациента.
5.	Сортировка пациентов: Отсортируйте список пациентов по алфавиту.
6.	Вывод списка пациентов: Выведите полный список пациентов.
7.	Очистка списка пациентов: Удалите все записи пациентов из списка.
8.	Выход: Завершение работы программы.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class PatientDatabase {
/* " --- 🏥 Меню управления базой данных больницы 🏥 --- "
1. Добавить пациента
2. Удалить пациента
3. Найти пациента
4. Обновить данные пациента
5. Отсортировать список пациентов
6. Показать список пациентов
7. Очистить список пациентов
8. Выйти
Выберите действие:
*/
static Scanner scanner = new Scanner(System.in);

    static ArrayList<String> patient = new ArrayList<>();

    public static void main(String[] args) {

        boolean runnning = true;

        while (runnning) {
           new  PatientDatabase();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> addPatient();
                case 2 -> removePatient();
                case 3 -> searchPatient();
                case 4 -> updatePatient();
                case 5 -> sortPatient();
                case 6 -> showPatient();
                case 7 -> clearPatient();
                case 8 -> {
                    System.out.println("Программа завершена.");
                    scanner.close();
                    runnning = false;
                }
                default -> System.err.println("Неверный ввод, попробуйте снова.");
            }
        }
    }

    private static void showMenu() {
        System.out.println("\n--- Меню управления базой данных больницы ---");
        System.out.println("1. Добавить пациента");
        System.out.println("2. Удалить пациента");
        System.out.println("3. Найти пациента");
        System.out.println("4. Обновить данные пациента");
        System.out.println("5. Отсортировать список пациентов");
        System.out.println("6. Показать список пациентов");
        System.out.println("7. Очистить список пациентов");
        System.out.println("8. Выйти");
        System.out.println("Выберите ваше дальнейшее действие: ");
    }
    private static void addPatient() {
        scanner.nextLine();
        System.out.print("Введите имя пациента: ");
        String patientName = scanner.nextLine();
        patient.add(patientName);
        System.out.println("Имя пациента добавленно.");
    }

    private static void removePatient() {
        scanner.nextLine();
        System.out.print("Введите имя и фамилию пациента для удаления: ");
        String patientNameToRemove = scanner.nextLine().trim();
        if (patient.contains(patientNameToRemove)) {
            Iterator<String> iterator = patient.iterator();
            while (iterator.hasNext()) {
                String patient = iterator.next();
                if (patient.equals(patientNameToRemove)) {
                    iterator.remove(); // Удаление с помощью итератора // Remove using the iterator
                }
            }
            System.out.println("Имя и фамилия пациента удалены.");
        } else {
            System.out.println("Пациент " + patientNameToRemove + " не найден");
        }

    }

    private static void searchPatient() {
        scanner.nextLine();
        System.out.println("Введите имя и фамилию пациента для поиска: ");
        String patientToSearch = scanner.nextLine().trim();
        if (patient.contains(patientToSearch)) {
            System.out.println("Пациент найден: " + patientToSearch);
        } else {
            System.out.println("Пациент не найден.");
        }
    }

    private static void updatePatient() {
        scanner.nextLine();
        System.out.println("Введите имя и фамилию пациента для обновления: ");
        String patientNameToUpdate = scanner.nextLine().trim();
        if (!patient.contains(patientNameToUpdate)) {
            System.out.println("Пациент " + patientNameToUpdate + " не найден");
        } else {
            System.out.print("Введите новые данные - имя и фамилию: ");
            String newProductName = scanner.nextLine().trim();
            int index = patient.indexOf(patientNameToUpdate);
            patient.set(index, newProductName);
            System.out.println("Данные пациента - имя и фамилия обновлены.");
        }
    }

    private static void sortPatient() {
        Collections.sort(patient);
        System.out.println("Список пациентов отсортирован.");
    }

    private static void showPatient() {
        if (patient.isEmpty()) {
            System.out.println("Список пациентов пуст.");
        } else {
            System.out.println("Список пациенто:");
            for (int i = 0; i < patient.size(); i++) {
                System.out.println((i + 1) + ". " + patient.get(i));
            }
        }
    }

    private static void clearPatient() {
        patient.clear();
        System.out.println("Список пациентов очищен.");
    }
    /*
1.	При выборе добавить пациента программа запрашивает имя и фамилию пациента и добавляет его в список.
2.	При выборе удалить пациента программа запрашивает имя и фамилию пациента и удаляет его из списка.
3.	При выборе найти пациента программа запрашивает имя и фамилию и проверяет, есть ли такой пациент в базе данных.
4.	При выборе обновить данные пациента программа позволяет ввести новое имя или фамилию.
5.	При выборе отсортировать список пациентов программа сортирует список пациентов в алфавитном порядке.
6.	При выборе показать список пациентов программа выводит текущий список пациентов.
7.	При выборе очистить список пациентов программа полностью очищает список.
8.	Выход завершает работу программы.
     */
} // klass ended
