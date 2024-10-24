package Memento;

public class Main {
    public static void main(String[] args) {
        SimpleTextEditor editor = new SimpleTextEditor();
        UndoManager undoManager = new UndoManager();

        editor.type("First sentence. ");
        undoManager.backup(editor.saveState());

        editor.type("Second sentence.");
        System.out.println("Text before undo: " + editor.getText());

        editor.restoreState(undoManager.undo());
        System.out.println("Text after undo: " + editor.getText());
    }
}
