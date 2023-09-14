import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        emptyString();
    }
    private static void emptyString() {
        System.out.println("Введите текст, пустую строку оставлять нельзя: ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        if (string.equals("")) {
            throw new RuntimeException("Ошибка! Вы ввели пвстую строку. Пустые строки вводить нельзя!");
        }
        System.out.println("Вы ввели: " + string);
        scanner.close();
    }
}
