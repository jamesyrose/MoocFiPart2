package Part8;

public class TaskTrackerMain {

	public static void main(String[] args) {
		TaskTracker tracker = new TaskTracker();
		tracker.add("Ada", 3);
		tracker.add("Ada", 4);
		tracker.add("Ada", 3);
		tracker.add("Ada", 3);

		tracker.add("Pekka", 4);
		tracker.add("Pekka", 4);

		tracker.add("Matti", 1);
		tracker.add("Matti", 2);

		tracker.print();
	}

}
