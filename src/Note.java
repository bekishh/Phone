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
}
