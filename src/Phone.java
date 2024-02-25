import java.util.Scanner;

public class Phone {
    Scanner scanner = new Scanner(System.in);
    Note note;
    Mbank mbank;
    Mbank mbank2;
    Calculator calculator;

    public Phone() {

    }

    public Phone(Note note, Mbank mbank, Mbank mbank2, Calculator calculator) {
        this.note = note;
        this.mbank = mbank;
        this.mbank2 = mbank2;
        this.calculator = calculator;
    }

    public void openPhone() {
        while (true) {

            System.out.print("""
                    ------------------ Меню приложений ------------------
                    Какое приложение вы хотите открыть?
                    1) Заметки
                    2) Банк
                    3) Калькулятор
                                        
                    Ваше действие:\s""");
            int command = scanner.nextInt();

            switch (command) {
                case 1:
                    while (true) {
                        System.out.print("""
                                ---------------------- Заметки ----------------------
                                Какую команду вы хотите выполнить?
                                1) Добавить заметку
                                2) Просмотреть все заметки
                                3) Удалить заметку
                                4) Выйти в меню приложений
                                                        
                                Ваше действие:\s""");
                        int noteCommand = scanner.nextInt();
                        switch (noteCommand) {
                            case 1:
                                note.addNote();
                                break;
                            case 2:
                                note.getAllNotes();
                                break;
                            case 3:
                                note.deleteNote();
                                break;
                            case 4:
                                break;
                        }
                        if (noteCommand == 4) {
                            break;
                        }
                    }
                    break;
                case 2:
                    while (true) {
                        System.out.println("""
                                ----------------------- Банк -----------------------
                                                                
                                Какую комманду вы хотите выполнить?
                                1) Пополнить баланс
                                2) Перевод на другую карту
                                3) Мой баланс
                                4) Выйти в меню приложений
                                                                
                                Ваше действие:\s""");
                        int bankCommand = scanner.nextInt();
                        switch (bankCommand) {
                            case 1:
                                System.out.println("Введите сумму пополнения: ");
                                int sum = scanner.nextInt();
                                mbank.addBalance(sum);
                                mbank.getBalance();
                                break;
                            case 2:
                                System.out.println("Введите сумму перевода: ");
                                mbank.transaction(scanner.nextInt(), mbank2);
                                break;
                            case 3:
                                System.out.print("Баланс первой карты: ");
                                mbank.getBalance();
                                System.out.print("Баланс второй карты: ");
                                mbank2.getBalance();
                        }
                        if (bankCommand == 4) {
                            break;
                        }
                    }
                    break;
                case 3:
                    while (true) {
                        System.out.println("""
                                -------------------- Калькулятор --------------------
                                Какую операцию вы хотите выполнить?
                                1) Суммирование
                                2) Вычитание
                                3) Умножение
                                4) Деление
                                5) Выйти в меню приложенй
                                                                
                                Ваше действие:\s""");
                        int calculatorCommand = scanner.nextInt();

                        switch (calculatorCommand) {
                            case 1:
                                calculator.sum();
                                break;
                            case 2:
                                calculator.minus();
                                break;
                            case 3:
                                calculator.multiplication();
                                break;
                            case 4:
                                calculator.shared();
                                break;
                        }
                        if (calculatorCommand == 5) {
                            break;
                        }
                    }
                default:
                    System.out.println("Такой комманды нет!");
            }
        }
    }
}
