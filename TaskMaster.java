public class TaskMaster {

	public static void main(String[] args) {
		System.out.println("task1");
		Task task1 = new Task("Finish Activity 14",0);
		System.out.println(task1.toString());
		task1.setComplete(true);
		System.out.println("Task 1 is complete:" + task1.isComplete());
		System.out.println(task1.toString());
		System.out.println("task2");
		Task task2 = new Task("Give Tigger a bath",10);
		Task task3 = new Task("Finish Activity 14",0);
		System.out.println(task2.toString());
		task2.setPriority(20);
		System.out.println("Task 2 priority: " + task2.getPriority());
		System.out.println(task2.toString());
		System.out.println("Comparing Task 1 and 2...");
		if (task1.compareTo(task2) > 0) {
			System.out.println("Task 1 more important than Task 2.");
		}
		else if (task1.compareTo(task2) < 0) {
			System.out.println("Task 1 less important than Task 2.");
		}
		else if (task1.compareTo(task2) == 0) {
			System.out.println("Task 1 and Task 3 are equal.");
		}
	}
	
}