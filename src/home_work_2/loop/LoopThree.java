package home_work_2.loop;

public class LoopThree {
    /**
     * метод возводит число в степень и выводит в строку выражение и результат
     *
     * @param number число возводимое
     * @param degree степень, в которую надо возвести число
     * @return результат возведения числа в степень
     */
    public static double result(double number, int degree) {
        double result = 1;
        if (degree == 0) {
            return result;
        } else {
            for (int i = 0; i < degree; i++) {
                result = result * number;
            }
            return result;
        }
    }
}


