package HomeworkNotepad;

public class Page {
	private String title;
	private String text;

	public Page(String title, String text) {
		if (title != null && text != null) {
			this.title = title;
			this.text = text;
		}
	}

	boolean addText(String text) {
		if (text != null && !text.equals("")) {
			this.text = this.text.concat(" " + text);
			return true;
		}
		return false;
	}

	void deleteText() {
		this.text = "";
	}

	public String getPageAndText() {
		return (this.title + "\n" + this.text);
	}

	public int searchWord(String word) {
		if (text != null && !text.equals("")) {
			this.text.indexOf(word);
		}
		return -1;
	}

	public boolean isContainsDigit() {
		for (int index = 0; index < text.length(); index++) {
			if (text.charAt(index) >= 0 || text.charAt(index) <= 9) {
				return true;
			}
		}
		return false;
	}

	public boolean replaceText(String text) {
		if (text != null && !text.equals("")) {
			this.text = text;
			return true;
		}
		return false;
	}

	public boolean isEmpty() {
		return text.equals("");
	}
}
