public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        // Проверка длины имени и фамилии
        if (name.length() >= 3) {
            // Проверка отсутствия пробелов в начале и конце строки
            if (!name.trim().equals(name)) {
                System.out.println("Имя и фамилия не могут содержать пробелы в начале или конце.");
                return false;
            }
            // Другие условия проверки, если необходимо

            // Если все проверки пройдены успешно
            return true;
        } else {
            System.out.println("Имя и фамилия должны содержать как минимум 3 символа.");
            return false;
        }
    }

} 