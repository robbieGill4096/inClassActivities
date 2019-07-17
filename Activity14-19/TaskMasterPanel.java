import javax.swing.JPanel;
import java.awt.Dimension;

/**
 * Lesson 18-19: Activity - Task Master GUI
 * 
 * This class represents the main TaskMaster JPanel. 
 * 
 * It contains a ToDoListPanel and the control sub-panel.
 * 
 * @author CS121 Instructors
 * @version [semester]
 * @author [your name]
 */
@SuppressWarnings("serial")
public class TaskMasterPanel extends JPanel
{	
	/**
	 * Creates a new TaskMasterPanel.
	 */
	public TaskMasterPanel() {
		Task task1 = new Task("first task", 1);
		task1.setComplete(false);
		
		this.add(new TaskButton(task1));
		this.setPreferredSize(new Dimension(500, 400));	
			
	}
}