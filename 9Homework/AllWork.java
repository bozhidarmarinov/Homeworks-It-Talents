package SeventhHomeworkTask2;

public class AllWork {

	private Task[] tasks;
	private int freePlacesForTasks;
	private int currentUnassignTask;

	public AllWork() {
		this.setFreePlacesForTasks(10);
		this.setCurrentUnassignedTask(0);
		tasks = new Task[freePlacesForTasks];

	}

	public Task[] getTasks() {
		return this.tasks;
	}

	public int getFreePlacesForTasks() {
		return freePlacesForTasks;
	}

	public void setFreePlacesForTasks(int freePlacesForTasks) {
		this.freePlacesForTasks = freePlacesForTasks;
	}

	public int getCurrentUnassignedTask() {
		return currentUnassignTask;
	}

	public void setCurrentUnassignedTask(int currentUnassignedTask) {
		this.currentUnassignTask = currentUnassignedTask;
	}

	public int getLength() {
		return tasks.length;
	}

	public void addTask(Task newTask) {
		if (newTask != null) {
			if (this.freePlacesForTasks > 0) {
				for (int index = 0; index < tasks.length; index++) {
					if (tasks[index] == null) {
						tasks[index] = newTask;
						this.freePlacesForTasks--;
						break;
					}
				}
			} else {
				System.out.println("Full of jobs");
			}
		}
	}

	public Task getNextTask() {
		if (this.currentUnassignTask <= this.tasks.length) {
			return this.tasks[currentUnassignTask++];
		}
		return this.tasks[(currentUnassignTask++) % 10];
	}

	public boolean isAllWorkDone() {
		for (int i = 0; i < this.tasks.length; i++) {
			if (this.tasks != null && this.tasks[i] != null) {
				if (this.tasks[i].getWorkingHours() != 0) {
					return false;
				}
			}
		}
		return true;
	}

}