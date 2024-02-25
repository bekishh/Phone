import java.util.Scanner;

public class Note extends Phone {
    private int notesLength = 0;
    private String[] notes = new String[notesLength];

    public void addNote() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите заметку: ");
        String note = scanner.nextLine();

        String[] newNotes = new String[++notesLength];
        System.arraycopy(notes, 0, newNotes, 0, notes.length);
        newNotes[notesLength - 1] = note;
        notes = newNotes;
    }

    public void getAllNotes() {
        String allNotes = "Все заметки: \n";
        for (int i = 0; i < notes.length; i++) {
            allNotes += (i + 1) + ") " + notes[i] + "\n";
        }
        System.out.println(allNotes);
    }

    public void deleteNote() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер заметки, которую хотите удалить: ");
        int noteNumber = scanner.nextInt();

        if (noteNumber >= 1 && noteNumber <= notes.length) {
            String[] newNotes = new String[notes.length - 1];
            int newIndex = 0;
            for (int i = 0; i < notes.length; i++) {
                if (i + 1 == noteNumber) {
                    continue;
                }
                newNotes[newIndex++] = notes[i];
            }
            notes = newNotes;
            notesLength--;
            System.out.println("Заметка успешно удалена.");
        } else {
            System.out.println("Некорректный номер заметки.");
        }
    }

}
