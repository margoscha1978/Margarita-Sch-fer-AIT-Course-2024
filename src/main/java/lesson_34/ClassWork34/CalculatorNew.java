package lesson_34.ClassWork34;

public class CalculatorNew {

    public static void main(String[] args) {
        try {
            Calculator.divideNumbersThrowsException(20, 10);
        } catch (ArithmeticException exception) {
            System.out.println("Я делил на 0 !!!! Это моя ошибка !!!");
            exception.getStackTrace();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

} // klass ended
