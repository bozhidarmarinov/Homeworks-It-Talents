package SeventhHomeworkTask2;

public class Demo {
	public static void main(String[] args) {
		int day = 1;

		Employee ivancho = new Employee("ivancho");
		Employee stoqn = new Employee("stoqn");
		Employee rumen = new Employee("rumen");
		Employee pesho = new Employee("pesho");

		AllWork allwork = new AllWork();

		ivancho.setAllwork(allwork);
		stoqn.setAllwork(allwork);
		rumen.setAllwork(allwork);
		pesho.setAllwork(allwork);

		allwork.addTask(new Task("kopane", 14));
		allwork.addTask(new Task("piene", 7));
		allwork.addTask(new Task("biene", 4));
		allwork.addTask(new Task("prane", 8));
		allwork.addTask(new Task("gotvene", 10));
		allwork.addTask(new Task("chistene", 2));
		allwork.addTask(new Task("pochivka", 12));
		allwork.addTask(new Task("uchene", 5));
		allwork.addTask(new Task("pak kopane", 13));
		allwork.addTask(new Task("polirane", 3));
		allwork.addTask(new Task("broene na pari", 8));

		allwork.setCurrentUnassignedTask(0);

		while (!allwork.isAllWorkDone()) {
			System.out.println("Start the " + day + " day");
			ivancho.work();
			stoqn.work();
			rumen.work();
			pesho.work();
			day++;

		}

	}
}
