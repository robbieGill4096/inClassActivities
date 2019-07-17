
public class TaskMaster {
	

	public static void main(String[] args) {
		
		Task task1 = new Task("Finish Activity 14",0);
		
		task1.setComplete(false);
		Task task2 = new Task("Give Tigger a bath",10);
		Task.Category none = Task.Category.NONE;
		task1.setCategory(none);
		task2.setComplete(false);
		Task task3 = new Task("Finish Activity 14",0);
		Task.Category personal = Task.Category.PERSONAL;
		task2.setCategory(personal);
		task3.setComplete(false);
		task2.setPriority(20);
		Task.Category WORK = Task.Category.WORK;
		task3.setCategory(WORK);
		

		//Part 4
		ToDoList Thursday = new ToDoList("July 19");
		Thursday.addTask(task1);
		Thursday.addTask(task2);
		Thursday.addTask(task3);
		Thursday.addTask("task900");
		Thursday.getWork().setComplete(true);
		System.out.println(Thursday.toString());
		
		System.out.println("next task to complete is: " + Thursday.getWork());
	}
	
	
	
}