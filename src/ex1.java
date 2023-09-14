import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex1 {
    public static void main(String[] args) {
        boolean work = true;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while(work){
            System.out.print("Введите дробное число: ");
            try{
                float number = Float.parseFloat(reader.readLine());
                System.out.printf("Вы ввели число: %f\n", number);
                work = false;
            } catch (IOException | NumberFormatException e) {
                System.out.println("Ошибка, вы ввели не дробное число. Введите дробное число!");
            }
        }
    }
}