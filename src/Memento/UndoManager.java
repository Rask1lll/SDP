package Memento;
import java.util.Stack;

class UndoManager {
    private Stack<EditorState> history = new Stack<>();

    public void backup(EditorState state) {
        history.push(state);
    }

    public EditorState undo() {
        if (!history.isEmpty()) {
            return history.pop();
        }
        return null;
    }
}
