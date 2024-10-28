package homework12;

public class RentabilyCalkulator1 {
    public static void main(String[] args) {

    // создаем два массива со стоимостью аренды и стоимостью цены продажи жилья сравниваем
    // стоимость - аренда
    int[] rentPrices = {1200, 1500, 1800, 1300, 1600};

    // стоимость - продажа
    int[] sellPrices = {250000, 300000, 350000, 280000, 320000};

    // сравниваем длинну массивов,одинаковые ли данные даныe в массиве,чтобы не было ошибок и повторений при расчетах
    // рассчет рентабельности по заданным параметрам массива
    // вводим значение рентабельности
            for (int i = 0; i < rentPrices.length; i++) {
        // Вычисление годового дохода от аренды
        double annualIncome = rentPrices[i] * 12;
        // Вычисление рентабельности
        double rentability = (annualIncome / sellPrices[i]) * 100;
        // Вывод результата
        System.out.printf("Рентабельность квартиры %d составляет: %.2f%%\n", i + 1, rentability);
    }
  }

} // klass ende

//формула рентабельности складывается из годовой доход минус годовые расходы разделить на покупную цену и умножить на 100
//формула рентабельности складывается из годовой доход от аренды разделить на покупную цену и умножить на 100
