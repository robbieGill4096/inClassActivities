import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class TaskButton extends JButton {
private Task task;

public TaskButton(Task task){
	this.task = task;
	
	String text = task.toString();
	this.setText(text);
	this.addActionListener(new TaskButtonListener());
	
}

private class TaskButtonListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Clicked!");
		if (task.isComplete()) {
			task.setComplete(false);
		((JButton)e.getSource()).setForeground(Color.BLACK);
		}
		else {
			task.setComplete(true);
		((JButton)e.getSource()).setForeground(Color.GRAY);
			}
		//set the text of button to the new tostring value of the task
		((JButton)e.getSource()).setText(task.toString());

		}
	
	}
	

	
}


