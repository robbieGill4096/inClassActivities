import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.text.StyleConstants.ColorConstants;

/**
 * CS 121 Project 1: Traffic Animation
 *
 * Animates a [put your description here]
 *
 * @author BSU CS 121 Instructors
 * @author [put your name here]
 */
@SuppressWarnings("serial")
public class TrafficAnimation extends JPanel
{
	// This is where you declare constants and variables that need to keep their
	// values between calls	to paintComponent(). Any other variables should be
	// declared locally, in the method where they are used.

	/**
	 * A constant to regulate the frequency of Timer events.
	 * Note: 100ms is 10 frames per second - you should not need
	 * a faster refresh rate than this
	 */
	private final int DELAY = 100; //milliseconds

	/**
	 * The anchor coordinate for drawing / animating. All of your vehicle's
	 * coordinates should be relative to this offset value.
	 */
	private int xOffset = 0;
	/**
	 * The number of pixels added to xOffset each time paintComponent() is called.
	 */
	private int stepSize = 10;

	private final Color BACKGROUND_COLOR = Color.white;

	/* This method draws on the panel's Graphics context.
	 * This is where the majority of your work will be.
	 *
	 * (non-Javadoc)
	 * @see java.awt.Container#paint(java.awt.Graphics)
	 */
	public void paintComponent(Graphics g)
	{
		// Get the current width and height of the window.
		int width = getWidth(); // panel width
		int height = getHeight(); // panel height
		
		// Fill the graphics page with the background color.
		g.setColor(BACKGROUND_COLOR);
		g.fillRect(0, 0, width, height);

		// Calculate the new xOffset position of the moving object.
		xOffset  = (xOffset + stepSize) % width;
		
		// TODO: Use width, height, and xOffset to draw your scalable objects
		// at their new positions on the screen
		
		//sky
		Color skyBlue = new Color(56,176,222);
		g.setColor(skyBlue);
		g.fillRect(dimensionScalerX(0,width), dimensionScalerY(0,height), dimensionScalerX(620,width), dimensionScalerY(350,height));
		
		//sun
		Color sunOrange = new Color(255,196,0);
		g.setColor(sunOrange);
		g.fillArc(dimensionScalerX(100,width), dimensionScalerY(0,height), dimensionScalerX(110,width), dimensionScalerY(175,height),0, 360);
		
		//sea
		g.setColor(Color.BLUE);
		g.fillRect(dimensionScalerX(0,width), dimensionScalerY(250,height), dimensionScalerX(620,width), dimensionScalerY(200,height));
		//ground
		Color sand = new Color(255,255,196);
		g.setColor(sand);
		g.fillRect(dimensionScalerX(0,width), dimensionScalerY(420,height), dimensionScalerX(620,width), dimensionScalerY(200,height));
		//cloud
		g.setColor(Color.white);
		g.fillOval(dimensionScalerX(250,width), dimensionScalerY(50,height), dimensionScalerX(50,width), dimensionScalerY(50,height));
		g.fillOval(dimensionScalerX(280,width), dimensionScalerY(50,height), dimensionScalerX(40,width), dimensionScalerY(40,height));
		g.fillOval(dimensionScalerX(300,width), dimensionScalerY(55,height), dimensionScalerX(30,width), dimensionScalerY(30,height));
		//cloud left 
		g.setColor(Color.white);
		g.fillOval(dimensionScalerX(100,width), dimensionScalerY(70,height), dimensionScalerX(50,width), dimensionScalerY(50,height));
		g.fillOval(dimensionScalerX(130,width), dimensionScalerY(70,height), dimensionScalerX(40,width), dimensionScalerY(40,height));
		g.fillOval(dimensionScalerX(160,width), dimensionScalerY(70,height), dimensionScalerX(30,width), dimensionScalerY(30,height));
		
		//Avatar
			
		
		//Text in Window
			
		
		
		//Vehicle
		//g.fillRect(xOffset + dimensionScalerX(,width), dimensionScalerY(,height), dimensionScalerX(,width), dimensionScalerY(,height));
		
		
		
		//main mast
		Color hullBrown = new Color(65,41,6);
		g.setColor(hullBrown);
		g.fillRect(xOffset + dimensionScalerX(170,width), dimensionScalerY(50,height), dimensionScalerX(19,width), dimensionScalerY(250,height));
		g.fillRect(xOffset + dimensionScalerX(120,width), dimensionScalerY(75,height), dimensionScalerX(100,width), dimensionScalerY(15,height));
		//main sail
		Color shipSail = new Color(240,234,213);
		g.setColor(shipSail);
		g.fillRect(xOffset + dimensionScalerX(120,width), dimensionScalerY(75,height), dimensionScalerX(100,width), dimensionScalerY(150,height));
		//ships hull
		g.setColor(hullBrown);
		g.fillRect(xOffset + dimensionScalerX(0,width), dimensionScalerY(250,height), dimensionScalerX(300,width), dimensionScalerY(75,height));
		
		g.setColor(hullBrown);
		g.fillRect(xOffset + dimensionScalerX(25,width), dimensionScalerY(300,height), dimensionScalerX(250,width), dimensionScalerY(50,height));
		
		g.setColor(Color.BLACK);
		g.drawRect(xOffset + dimensionScalerX(0,width), dimensionScalerY(250,height), dimensionScalerX(300,width), dimensionScalerY(75,height));
		
		g.setColor(hullBrown);
		g.fillRect(xOffset + dimensionScalerX(300,width), dimensionScalerY(250,height), dimensionScalerX(30,width), dimensionScalerY(50,height));
		//front rig post
		g.setColor(hullBrown);
		g.fillRect(xOffset + dimensionScalerX(325,width), dimensionScalerY(240,height), dimensionScalerX(20,width), dimensionScalerY(30,height));
		
		g.setColor(hullBrown);
		g.fillRect(xOffset + dimensionScalerX(340,width), dimensionScalerY(220,height), dimensionScalerX(15,width), dimensionScalerY(25,height));
		
		g.setColor(Color.BLACK);
		g.drawRect(xOffset + dimensionScalerX(340,width), dimensionScalerY(220,height), dimensionScalerX(15,width), dimensionScalerY(25,height));
		g.setColor(Color.BLACK);
		g.drawRect(xOffset + dimensionScalerX(25,width), dimensionScalerY(250,height), dimensionScalerX(250,width), dimensionScalerY(15,height));
		g.setColor(Color.BLACK);
		g.drawRect(xOffset + dimensionScalerX(35,width), dimensionScalerY(265,height), dimensionScalerX(250,width), dimensionScalerY(15,height));
		
		g.setColor(hullBrown);
		g.fillRect(xOffset + dimensionScalerX(350,width), dimensionScalerY(200,height), dimensionScalerX(30,width), dimensionScalerY(24,height));
		//cabin
		g.setColor(hullBrown);
		g.fillRect(xOffset + dimensionScalerX(0,width), dimensionScalerY(200,height), dimensionScalerX(100,width), dimensionScalerY(50,height));
		// windows.
		g.setColor(Color.DARK_GRAY);
		g.fillOval(xOffset + dimensionScalerX(250,width), dimensionScalerY(275,height), dimensionScalerX(17,width), dimensionScalerY(26,height));
		g.fillOval(xOffset + dimensionScalerX(200,width), dimensionScalerY(275,height), dimensionScalerX(17,width), dimensionScalerY(26,height));
		g.fillOval(xOffset + dimensionScalerX(150,width), dimensionScalerY(275,height), dimensionScalerX(17,width), dimensionScalerY(26,height));
		g.fillOval(xOffset + dimensionScalerX(100,width), dimensionScalerY(275,height), dimensionScalerX(17,width), dimensionScalerY(26,height));
	
		//Avatar
	
		//pirates hat 
		int[] xPoints = {dimensionScalerX(300,width),dimensionScalerX(320,width),dimensionScalerX(340,width),dimensionScalerX(360,width),dimensionScalerX(380,width),dimensionScalerX(400,width),dimensionScalerX(380,width),dimensionScalerX(360,width),dimensionScalerX(340,width),dimensionScalerX(310,width)};
		int[] yPoints = {350,300 + 37,300 + 20,300 + 20,300 + 37,300 + 50,300 + 62,300 + 70,300 + 70,300 + 62}; 
		g.setColor(Color.BLACK);
		g.fillPolygon(xPoints, yPoints,10);
	
		//head
		Color skinColor = new Color(255, 205, 148);
		g.setColor(skinColor);
		g.fillOval(dimensionScalerX(325,width), dimensionScalerY(515,height), dimensionScalerX(50,width), dimensionScalerY(86,height));
		//eyes 
		// mouth
		// nose
		
		// Put your code above this line. This makes the drawing smoother.
		Toolkit.getDefaultToolkit().sync();
	}

	//input desired x location and method getWidth() alias width.
		public static int dimensionScalerX(int var ,int width) {
			int result = ((width/6)*var)/100;
			return (result);
		};
		//input desired Y location and method getHeight alias, height.
		public static int dimensionScalerY(int var ,int height) {
			int result = ((height/4)*var)/100;
			return (result);
		};
	

	//==============================================================
	// You don't need to modify anything beyond this point.
	//==============================================================


	/**
	 * Starting point for this program. Your code will not go in the
	 * main method for this program. It will go in the paintComponent
	 * method above.
	 *
	 * DO NOT MODIFY this method!
	 *
	 * @param args unused
	 */
	public static void main (String[] args)
	{
		// DO NOT MODIFY THIS CODE.
		JFrame frame = new JFrame ("Traffic Animation");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new TrafficAnimation());
		frame.pack();
		frame.setVisible(true);
	}

	/**
	 * Constructor for the display panel initializes necessary variables.
	 * Only called once, when the program first begins. This method also
	 * sets up a Timer that will call paint() with frequency specified by
	 * the DELAY constant.
	 */
	public TrafficAnimation()
	{
		// Do not initialize larger than 800x600. I won't be able to
		// grade your project if you do.
		int initWidth = 600;
		int initHeight = 400;
		setPreferredSize(new Dimension(initWidth, initHeight));
		this.setDoubleBuffered(true);

		//Start the animation - DO NOT REMOVE
		startAnimation();
	}

	/**
	 * Create an animation thread that runs periodically.
	 * DO NOT MODIFY this method!
	 */
	private void startAnimation()
	{
		ActionListener timerListener = new TimerListener();
		Timer timer = new Timer(DELAY, timerListener);
		timer.start();
	}

	/**
	 * Repaints the graphics panel every time the timer fires.
	 * DO NOT MODIFY this class!
	 */
	private class TimerListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e) {
			repaint();
		}
	}
}