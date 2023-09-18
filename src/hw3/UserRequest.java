package hw3;

import java.io.FileWriter;
import java.util.Scanner;

public class UserRequest {
    private String firstName;
    private String lastName;
    private String middleName;
    private String dateOfBirth;
    private long phone;
    private char gender;
    private final Scanner scan = new Scanner(System.in);

    private void EnterFirstName() {
        System.out.println("Введите имя: ");
        firstName = scan.nextLine();
        if (firstName.equals("")) {
            throw new RuntimeException("Поле не может быть пустым,\nвведите имя: ");
        }
    }

    private void EnterLastName() {
        System.out.println("Введите фамилию: ");
        lastName = scan.nextLine();
        if (lastName.equals("")) {
            throw new RuntimeException("Поле не может быть пустым,\nвведите фамилию: ");
        }
    }

    private void EnterMiddleName() {
        System.out.println("Введите отчество: ");
        middleName = scan.nextLine();
        if (middleName.equals("")) {
            throw new RuntimeException("Поле не может быть пустым,\nвведите отчество: ");
        }
    }

    private void EnterDateOfBirth() {
        System.out.println("Введите дату рождения: ");
        dateOfBirth = scan.nextLine();
        if (dateOfBirth.equals("")) {
            throw new RuntimeException("Поле не может быть пустым,\nвведите дату рождения: ");
        }
    }

    private void EnterPhone() {
        try {
            System.out.println("Введите номер телефона: ");
            String number = scan.nextLine();
            if (number.equals("")) {
                throw new RuntimeException("Поле не может быть пустым,\nвведите номер телефона: ");
            }
            phone = Long.parseLong(number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Не верный формат, попробуйте снова!");
        }
    }

    private void EnterGender() {
        System.out.println("Введите свой пол (ж-женский или м-мужской):");
        String userGender;
        String ж = "ж";
        String м = "м";
        userGender = scan.nextLine();
        if (userGender.length() > 1) {
            throw new RuntimeException("Ошибка! Вы ввели слишком много символов!");
        }
        if (userGender.equals(ж) || userGender.equals(м)) {
            gender = userGender.charAt(0);
        } else {
            throw new RuntimeException("Вы ввели не тот символ!");
        }
    }

    private void OutPutData() {
        System.out.println("\nИмя \t- \t" + firstName + "\n" + "Фамилия \t- \t" + lastName + "\n" +
                "Отчество \t- \t" + middleName + "\n" + "Дата рождения \t- \t" + dateOfBirth + "\n" +
                "Номер телефона \t- \t" + phone + "\n" + "Пол   \t- \t" + gender);
    }

    private void Request() {
        EnterFirstName();
        EnterLastName();
        EnterMiddleName();
        EnterDateOfBirth();
        EnterPhone();
        EnterGender();
        OutPutData();
    }

    public void SaveRequest() {
        Request();
        String file = "data/" + lastName + ".txt";
        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write("<" + firstName + "> " + "<" + lastName + "> " + "<" + middleName + "> " + "<" + dateOfBirth +
                    "> " + "<" + phone + "> " + "<" + gender + ">\n");
        } catch (Exception e) {
            System.out.println("Ошибка сохранения данных!");
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public long getPhone() {
        return phone;
    }

    public char getGender() {
        return gender;
    }
}