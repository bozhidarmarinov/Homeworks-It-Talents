package HomeworkNotepad;

public class ElectronicSecuredNotepad extends SecuredNotepad implements IElectronicDevice, INotePad {

	private boolean isOn;

	protected ElectronicSecuredNotepad(int numPages, String name, String password) {
		super(numPages, name, password);
		this.isOn = true;
	}

	@Override
	public void start() {
		isOn = true;
	}

	@Override
	public void stop() {
		isOn = false;
	}

	@Override
	public boolean isStarted() {
		return isOn;
	}

	@Override
	public boolean addText(String toAdd, int pageNum) {
		if (isStarted()) {
			return super.addText(toAdd, pageNum);
		}
		return false;
	}

	@Override
	public boolean replaceText(String toReplace, int pageNum) {
		if (isStarted()) {
			return super.replaceText(toReplace, pageNum);
		}
		return false;
	}

	@Override
	public boolean delete(int pageNum) {
		if (isStarted()) {
			return super.delete(pageNum);
		}
		return false;
	}

	@Override
	public void printAllPages() {
		if (isStarted()) {
			super.printAllPages();
		}
	}

	@Override
	public int searchWord(String word) {
		if (isStarted()) {
			return super.searchWord(word);
		}
		return -1;
	}

	@Override
	public void printIsDigitContains() {
		if (isStarted()) {
			super.printIsDigitContains();
		}
	}
}
