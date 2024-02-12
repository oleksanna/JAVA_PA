import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();

        System.out.println("Введите данные в формате 'Фамилия Имя Телефон', для завершения введите 'end':");
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] parts = input.split(" ");
            if (parts.length == 3) {
                String fullName = parts[0] + " " + parts[1];
                String phoneNumber = parts[2];
                phoneBook.addContact(fullName, phoneNumber);
            } else {
                System.out.println("Неверный формат ввода. Пожалуйста, введите данные в формате 'Фамилия Имя Телефон'.");
            }
            input = scanner.nextLine();
        }

        System.out.println("Структура телефонной книги:");
        phoneBook.printPhoneBook();
    }
}