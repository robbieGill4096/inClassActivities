

public class Task {
	private String description;
	private int priority;
	private boolean complete;



	public Task(String description) {
		this.description = description;
		this.priority = 0;
		
	}
	public Task(String description, int priority) {
		this.description = description;
		this.priority = priority;


	}

	public String getDescription() {
		return description;
		
	}


	public void setDescription(String description) {
		this.description = description;
	}
	public int getPriority() {
		return priority;
	}
	
	public void setPriority(int priority) {
		this.priority = priority;
	}
	
	public void setComplete(boolean complete) {
		this.complete = complete;
		
	}

	public boolean isComplete() {
		return this.complete;
	}






	public String toString(){
		if (this.isComplete()) {
			String taskString = ("[X]" + " " + description + ", " + priority);
			return taskString;
		}
		String taskString = ("[ ]" + " " + description + ", " + priority);
			return taskString;
	}	
}	






