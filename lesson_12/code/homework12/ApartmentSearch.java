package homework12;
// Упражнение 4:Поиск квартиры в бюджете:
// У вас есть массив цен квартир, а также бюджет пользователя.
// Напишите программу, которая выводит все квартиры, цена которых меньше или равна бюджету пользователя.
// int[] prices = {100000, 150000, 200000, 250000, 300000}; int budget = 200000;

public class ApartmentSearch {
    public static void main(String[] args) {
        // создаем массив цен и ищем подходящие нам по бюджету
        int[] prices = {100000, 150000, 200000, 250000, 300000};
        // наш бюджет на квартиру
        int budget = 200000;

        //сравниваем и проверяем что нам подходит
        System.out.println("Квартиры в бюджете:");
        for (int price : prices) { // Проходим по массиву цен с помощью цикла for
            // используем цикл `for-each` для перебора всех цен в массиве `prices`.
            if (price <= budget) { // Проверяем, не превышает ли цена бюджет,задаем условие в if,
                // если цена квартиры меньше или равна бюджету, мы выводим эту цену на экран.
                System.out.println(price);
            }
        }
    }

}// klass ende


