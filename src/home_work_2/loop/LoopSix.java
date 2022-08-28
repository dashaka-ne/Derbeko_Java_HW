package home_work_2.loop;

public class LoopSix {
    public static void main(String[] args) {
        int number2 = 0;
        for (int j = 0; j < 10; j++) {
            number2 = number2 + 1;
            int number1 = 1;
            for (int i = 0; i < 4; i++) {
                number1 = number1 + 1;
                int result = numberResult(number1, number2);
                System.out.print(number1 + " x " + number2 + " = " + result + "         ");
            }
            System.out.print("\n");
        }
        System.out.print("\n\n");
        number2 = 0;
        for (int j = 0; j < 10; j++) {
            number2 = number2 + 1;
            int number1 = 5;
            for (int i = 0; i < 4; i++) {
                number1 = number1 + 1;
                int result = numberResult(number1, number2);
                System.out.print(number1 + " x " + number2 + " = " + result + "         ");
            }
            System.out.print("\n");
        }
    }

    /**
     * метод возвращает произведение чисел
     *
     * @param number1 множитель
     * @param number2 множитель
     * @return произведение аргументов
     */
    public static int numberResult(int number1, int number2) {
        return number1 * number2;
    }
}

