package flags;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//Main Application Class
public class FlagsApp extends Frame {
	private static final long serialVersionUID = 1L;

	int frameWidth = 400, frameHeight = 400;
	int flagWidth = 180, flagHeight = 120;
	int xFlag = 100, yFlag = 100;

	// Store the current flag to be drawn
	private Flag currentFlag;

	// Constructor
	FlagsApp(String title) {
		super(title);

		// Close window event
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});

		// Layout for paintings
		setLayout(new BorderLayout());

		// Layout for buttons
		Panel panel = new Panel();
		panel.setLayout(new FlowLayout());

		// Buttons for each flag type
		Button btnRomania = new Button("Romania");
		btnRomania.addActionListener(e -> {
			currentFlag = new VerticalTricolorFlag(xFlag, yFlag, flagWidth, flagHeight,
					new Color[] { Color.BLUE, Color.YELLOW, Color.RED });
			repaint();
		});

		Button btnFrance = new Button("France");
		btnFrance.addActionListener(e -> {
			currentFlag = new VerticalTricolorFlag(xFlag, yFlag, flagWidth, flagHeight,
					new Color[] { Color.BLUE, Color.WHITE, Color.RED });
			repaint();
		});

		Button btnGermany = new Button("Germany");
		btnGermany.addActionListener(e -> {
			currentFlag = new HorizontalFlag(xFlag, yFlag, flagWidth, flagHeight,
					new Color[] { Color.BLACK, Color.RED, Color.YELLOW });
			repaint();
		});

		Button btnUkraine = new Button("Ukraine");
		btnUkraine.addActionListener(e -> {
			currentFlag = new HorizontalFlag(xFlag, yFlag, flagWidth, flagHeight,
					new Color[] { Color.BLUE, Color.YELLOW });
			repaint();
		});

		Button btnPoland = new Button("Poland");
		btnPoland.addActionListener(e -> {
			currentFlag = new HorizontalFlag(xFlag, yFlag, flagWidth, flagHeight,
					new Color[] { Color.WHITE, Color.RED });
			repaint();
		});

		// Add buttons to Frame
		panel.add(btnRomania);
		panel.add(btnFrance);
		panel.add(btnGermany);
		panel.add(btnUkraine);
		panel.add(btnPoland);
		panel.setVisible(true);
		add(panel, BorderLayout.SOUTH); // show panel with buttons on the bottom of the frame

		setSize(frameWidth, frameHeight);
		setVisible(true);
	}

	// Paint Method to Draw Selected Flag
	public void paint(Graphics g) {
		if (currentFlag != null) {
			currentFlag.draw(g);
		}
	}

	// Main Method
	public static void main(String[] args) {
		new FlagsApp("Flags Application");
	}
}
