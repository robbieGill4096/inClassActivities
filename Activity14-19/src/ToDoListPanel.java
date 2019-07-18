import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ToDoListPanel extends JPanel {
private ToDoList list;

	public ToDoListPanel(String name) {
		
		//not sure if it should take name
		this.list = new ToDoList("blah");
		JLabel firstLabel = new JLabel(name);
		this.add(firstLabel);
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS)); 
	}
	public void addTask(Task t) {
		//add task to the ToDoList
		list.addTask(t);
		//create a new TaskButton for the task
		TaskButton addATaskButton = new TaskButton(t);
		//add the task button to the ToDoListPanel
		this.add(addATaskButton);
		//revalidate() the ToDoListPanel so the button displays.
		this.revalidate();

	}
	
	public void showWorkDialog() {
		this.list.getWork();
		if (this.list.getWork() == null) {
			JOptionPane.showMessageDialog(null,"You're all done. Enjoy!");
		}
		if (this.list.getWork() != null) {
			//there is work todo.
			//display next thing todo.
			JOptionPane.showMessageDialog(null,this.list.getWork());
		
		}
	}

}
