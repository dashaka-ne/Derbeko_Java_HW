package home_work_1;

public class CreatePhoneNumber {
    public static String phoneNumber(int[] itemArr) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('(');
        for (int i = 0; i < 3; i++) {
            stringBuilder.append(itemArr[i]);
        }
        stringBuilder.append(')');
        for (int i = 3; i < 6; i++) {
            stringBuilder.append(itemArr[i]);
        }
        stringBuilder.append('-');
        for (int i = 6; i < 10; i++) {
            stringBuilder.append(itemArr[i]);
        }
        return stringBuilder.toString();
    }
}
