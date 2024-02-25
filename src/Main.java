public class Main {
    public static void main(String[] args) {
        Note note = new Note();
        Mbank mbank = new Mbank();
        Mbank mbank2 = new Mbank();
        Calculator calculator = new Calculator();

        Phone phone = new Phone(note, mbank, mbank2, calculator);
        phone.openPhone();
    }
}
