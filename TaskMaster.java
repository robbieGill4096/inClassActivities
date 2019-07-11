public class TaskMaster {

	public static void main(String[] args) {
		
		Task task1 = new Task("Finish Activity 14",0);
		
		task1.setComplete(true);
		Task task2 = new Task("Give Tigger a bath",10);
		task2.setComplete(true);
		Task task3 = new Task("Finish Activity 14",0);
		task3.setComplete(true);
		task2.setPriority(20);
		
		//Part 3
		ToDoList Thursday = new ToDoList("July 19");
		Thursday.addTask(task1);
		Thursday.addTask(task2);
		Thursday.addTask("task900");
		System.out.println(Thursday.toString());
		System.out.println("next task to complete is: " + Thursday.getWork());
	}
	
	
	
}