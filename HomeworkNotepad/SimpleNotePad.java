package HomeworkNotepad;

public class SimpleNotePad implements INotePad {

	private Page[] pages;
	protected final String name;
	protected int numPages;

	public SimpleNotePad(String name, int numPages) {
		if (numPages > 0 && name != null && !name.equals("")) {
			this.numPages = numPages;
			this.name = name;
			this.pages = new Page[numPages];

			for (int index = 0; index < numPages; index++) {
				pages[index] = new Page("Page " + (index + 1), "");
			}
		} else {
			this.name = "Unnamed";
		}
	}

	@Override
	public boolean addText(String text, int page) {
		return textEdit(text, page, 2);

	}

	@Override
	public boolean replaceText(String text, int page) {
		return textEdit(text, page, 1);
	}

	@Override
	public boolean delete(int page) {
		return textEdit("", page, 3);
	}

	@Override
	public void printAllPages() {
		for (int index = 0; index < pages.length; index++) {

			if (!pages[index].isEmpty()) {
				System.out.println(pages[index]);
				System.out.println();
			}
		}
	}

	@Override
	public int searchWord(String word) {
		for (int index = 0; index < pages.length; index++) {

			if (pages[index].searchWord(word) > 0) {
				return index;
			}
		}
		return -1;

	}

	@Override
	public void printIsDigitContains() {
		for (int index = 0; index < pages.length; index++) {
			if (pages[index].isContainsDigit()) {
				System.out.println(pages[index]);
			}
		}

	}

	protected boolean textEdit(String textToEdit, int page, int operation) {
		if (textToEdit != null && !textToEdit.equals("") && page > 0 && page <= numPages) {
			page--;
			switch (operation) {
			case 1:
				pages[page].replaceText(textToEdit);
				break;
			case 2:
				pages[page].addText(textToEdit);
				break;
			default:
				pages[page].deleteText();
				break;
			}
			return true;
		}
		return false;
	}

}
