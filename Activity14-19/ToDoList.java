import java.util.ArrayList;
import java.util.Collections;

public class ToDoList implements ToDoListInterface {
	private String name;
	private ArrayList<Task> listOfTasks;
	
	public ToDoList( String name) {
		this.name = name;
		this.listOfTasks = new ArrayList<Task>();
	}
	@Override
	public String getName() {
		return name;
	}

	@Override
	public void addTask(Task task) {
		listOfTasks.add(task);
		
	}

	@Override
	public void addTask(String description) {
		Task task = new Task(description);
		listOfTasks.add(task);
		
	}
	@Override 
	public void addTask(String description, Task.Category catName) {
		Task task2 = new Task(description);
		task2.setCategory(catName);
		listOfTasks.add(task2);

	}


	@Override
	public Task getWork() {
		//check if method from arrayList has any tasks in it
		ArrayList<Task> listOfIncompleteTasks = new ArrayList<Task>();
		if(listOfTasks.isEmpty() == false) {
			for(Task x : listOfTasks) {
				if (x.isComplete() == false) {
					listOfIncompleteTasks.add(x);
				}
			}
			if(listOfIncompleteTasks.isEmpty() == false) {
				Task maxTask = Collections.max(listOfIncompleteTasks);
				return maxTask;
			}
			
			return null;
			
			
		}
		
		return null;
	}

	@Override
	public ArrayList<Task> getTaskList() {
		// TODO Auto-generated method stub
		ArrayList copy = listOfTasks;
		
		return copy;
	}
	
	public String toString() {
		String name = this.getName();
		String stringList = "";
		for (Task x :this.getTaskList())
		{
			stringList += (x).toString() + "\n";
			
		}
		
		String formattedTodoList = ("-------------\n" +"ToDoList " + name + "\n" + "-------------\n" + stringList);
			return formattedTodoList;	
		//returns String containing the name and tasks in the todo List.
		
	}
	
	
}