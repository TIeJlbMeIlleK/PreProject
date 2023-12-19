public class Praktikum {


    public static void main(String[] args) {
        // Создаем строку с именем и фамилией
        String fullName = "Имя Фамилия";

        // Создаем экземпляр класса Account
        Account account = new Account(fullName);

        // Вызываем метод для проверки возможности использования имени и фамилии для печати на банковской карте
        boolean isNameValid = account.checkNameToEmboss();

        // Выводим результат проверки
        if (isNameValid) {
            System.out.println("Имя и фамилия могут быть использованы для печати на банковской карте.");
        } else {
            System.out.println("Имя и фамилия не могут быть использованы для печати на банковской карте.");
        }
    }

}