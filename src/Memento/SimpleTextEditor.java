package Memento;
class SimpleTextEditor {
    private StringBuilder text = new StringBuilder();

    public void type(String newText) {
        text.append(newText);
    }

    public EditorState saveState() {
        return new EditorState(text.toString());
    }

    public void restoreState(EditorState state) {
        text = new StringBuilder(state.getContent());
    }

    public String getText() {
        return text.toString();
    }
}
