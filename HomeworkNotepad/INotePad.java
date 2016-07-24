package HomeworkNotepad;

public interface INotePad {
	public boolean addText(String text, int page);

	public boolean replaceText(String text, int page);

	public boolean delete(int page);

	public void printAllPages();

	public int searchWord(String word);

	public void printIsDigitContains();
}
