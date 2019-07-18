import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

import FahrenheitPanel.TempListener;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	
	ToDoListPanel listPanel;
	public TaskMasterPanel() {
		
		 this.listPanel= new ToDoListPanel("My TODO list");
		
		 JPanel controlPanel = new JPanel();
		 
		JButton getWorkButton = new JButton("Get Work");
		getWorkButton.addActionListener(new GetWorkButtonListener());
		controlPanel.add(getWorkButton);
		
		 setLayout(new BorderLayout()); 
		//add it to the panel
		listPanel.addTask(new Task("Task 1"));
		listPanel.addTask(new Task("Task 2"));
		listPanel.addTask(new Task("Task 3"));
		
		add(this.listPanel, BorderLayout.CENTER);
		add(controlPanel, BorderLayout.SOUTH);
		

		this.setPreferredSize(new Dimension(500, 400));	
		
		this.setPreferredSize(new Dimension(500, 400));	
		
		
			
	}
	private class GetWorkButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			listPanel.showWorkDialog();
			
		}
		
		
	}
}