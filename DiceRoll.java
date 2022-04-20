import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import java.awt.Color;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class RollDice extends JFrame 
{

	private JPanel contentPane;
	private JTextField Dice1Roll;
	private JTextField Dice2Roll;
	private JTextField Dice3Roll;
	private JTextField Dice4Roll;
	private JTextField Dice5Roll;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					RollDice frame = new RollDice();
					frame.setVisible(true);
				} 
				
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RollDice() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 623, 568);
		contentPane = new JPanel();
		contentPane.setForeground(Color.GREEN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDie1 = new JLabel("");
		lblDie1.setBounds(10, -6, 194, 154);
		lblDie1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblDie1.setIcon(new ImageIcon(RollDice.class.getResource("/images/DICE/DICE1.PNG")));
		lblDie1.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblDie1);

		JLabel lblDie2 = new JLabel("");
		lblDie2.setBounds(240, 11, 137, 137);
		lblDie2.setVerticalAlignment(SwingConstants.BOTTOM);
		lblDie2.setIcon(new ImageIcon(RollDice.class.getResource("/images/DICE/DICE4.PNG")));
		lblDie2.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblDie2);
		
		JLabel lblDie3 = new JLabel("");
		lblDie3.setBounds(387, 11, 194, 137);
		lblDie3.setVerticalAlignment(SwingConstants.TOP);
		lblDie3.setIcon(new ImageIcon(RollDice.class.getResource("/images/DICE/DICE2.PNG")));
		lblDie3.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblDie3);
		
		JLabel lblDie4 = new JLabel("");
		lblDie4.setBounds(32, 171, 154, 154);
		lblDie4.setIcon(new ImageIcon(RollDice.class.getResource("/images/DICE/DICE1.PNG")));
		contentPane.add(lblDie4);
		
		JLabel lblDie5 = new JLabel("");
		lblDie5.setBounds(407, 176, 154, 131);
		lblDie5.setHorizontalAlignment(SwingConstants.CENTER);
		lblDie5.setIcon(new ImageIcon(RollDice.class.getResource("/images/DICE/DICE5.PNG")));
		contentPane.add(lblDie5);

		/**
		 * Rolling the dice
		 */
		JCheckBox CheckBox1 = new JCheckBox("DICE 1");
		CheckBox1.setBackground(Color.GREEN);
		CheckBox1.setBounds(87, 343, 82, 51);
		contentPane.add(CheckBox1);
		
		JCheckBox CheckBox2 = new JCheckBox("DICE 2");
		CheckBox2.setBackground(Color.ORANGE);
		CheckBox2.setBounds(174, 343, 82, 51);
		contentPane.add(CheckBox2);
		
		JCheckBox CheckBox3 = new JCheckBox("DICE 3");
		CheckBox3.setBackground(Color.CYAN);
		CheckBox3.setBounds(263, 343, 82, 51);
		contentPane.add(CheckBox3);
		
		JCheckBox CheckBox4 = new JCheckBox("DICE 4");
		CheckBox4.setBackground(Color.PINK);
		CheckBox4.setBounds(352, 343, 72, 51);
		contentPane.add(CheckBox4);
		
		JCheckBox CheckBox5 = new JCheckBox("DICE 5");
		CheckBox5.setBackground(Color.LIGHT_GRAY);
		CheckBox5.setBounds(432, 343, 72, 51);
		contentPane.add(CheckBox5);
		
		Dice1Roll = new JTextField();
		Dice1Roll.setBounds(97, 401, 49, 38);
		contentPane.add(Dice1Roll);
		Dice1Roll.setColumns(10);
		
		Dice2Roll = new JTextField();
		contentPane.add(Dice2Roll);
		Dice2Roll.setColumns(10);
		Dice2Roll.setBounds(184, 401, 49, 38);
	
		
		Dice3Roll = new JTextField();
		Dice3Roll.setColumns(10);
		Dice3Roll.setBounds(273, 401, 49, 38);
		contentPane.add(Dice3Roll);
		
		Dice4Roll = new JTextField();
		Dice4Roll.setColumns(10);
		Dice4Roll.setBounds(362, 401, 49, 38);
		contentPane.add(Dice4Roll);
		
		Dice5Roll = new JTextField();
		Dice5Roll.setColumns(10);
		Dice5Roll.setBounds(442, 401, 49, 38);
		contentPane.add(Dice5Roll);
		
		
		JButton btnRoll = new JButton("Roll");
		btnRoll.setForeground(Color.RED);
		btnRoll.setBounds(10, 497, 599, 23);
		btnRoll.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Random rnd = new Random();
				
				int rand1 = 0;
				rand1 = rnd.nextInt(6) + 1;
				
				int rand2 = 0;
				rand2 = rnd.nextInt(6) + 1;
				
				int rand3 = 0;
				rand3 = rnd.nextInt(6) + 1;
				
				int rand4 = 0;
				rand4 = rnd.nextInt(6) + 1;
				
				int rand5 = 0;
				rand5 = rnd.nextInt(6) + 1;
			
			if (!CheckBox1.isSelected())
			{
				Dice1Roll.setText(String.valueOf(rand1));

				switch(rand1) 
				{
					case 1:
						lblDie1.setIcon(new ImageIcon(RollDice.class.getResource("/images/DICE/DICE1.PNG")));
						break;
					case 2:
						lblDie1.setIcon(new ImageIcon(RollDice.class.getResource("/images/DICE/DICE2.PNG")));
						break;
					case 3:
						lblDie1.setIcon(new ImageIcon(RollDice.class.getResource("/images/DICE/DICE3.PNG")));
						break;
					case 4:
						lblDie1.setIcon(new ImageIcon(RollDice.class.getResource("/images/DICE/DICE4.PNG")));
						break;
					case 5:
						lblDie1.setIcon(new ImageIcon(RollDice.class.getResource("/images/DICE/DICE5.PNG")));
						break;
					case 6:
						lblDie1.setIcon(new ImageIcon(RollDice.class.getResource("/images/DICE/DICE6.PNG")));
						break;
				}
			}
			
			if (CheckBox2.isSelected())
			{
				Dice2Roll.setText(String.valueOf(rand2));
				
				switch(rand2) 
				{
					case 1:
						lblDie2.setIcon(new ImageIcon(RollDice.class.getResource("/images/DICE/DICE1.PNG")));
						break;
					case 2:
						lblDie2.setIcon(new ImageIcon(RollDice.class.getResource("/images/DICE/DICE2.PNG")));
						break;
					case 3:
						lblDie2.setIcon(new ImageIcon(RollDice.class.getResource("/images/DICE/DICE3.PNG")));
						break;
					case 4:
						lblDie2.setIcon(new ImageIcon(RollDice.class.getResource("/images/DICE/DICE4.PNG")));
						break;
					case 5:
						lblDie2.setIcon(new ImageIcon(RollDice.class.getResource("/images/DICE/DICE5.PNG")));
						break;
					case 6:
						lblDie2.setIcon(new ImageIcon(RollDice.class.getResource("/images/DICE/DICE6.PNG")));
						break;
				}
			}
			
			if (!CheckBox3.isSelected())
			{
				Dice3Roll.setText(String.valueOf(rand3));
				switch(rand3) 
				{
					case 1:
						lblDie3.setIcon(new ImageIcon(RollDice.class.getResource("/images/DICE/DICE1.PNG")));
						break;
					case 2:
						lblDie3.setIcon(new ImageIcon(RollDice.class.getResource("/images/DICE/DICE2.PNG")));
						break;
					case 3:
						lblDie3.setIcon(new ImageIcon(RollDice.class.getResource("/images/DICE/DICE3.PNG")));
						break;
					case 4:
						lblDie3.setIcon(new ImageIcon(RollDice.class.getResource("/images/DICE/DICE4.PNG")));
						break;
					case 5:
						lblDie3.setIcon(new ImageIcon(RollDice.class.getResource("/images/DICE/DICE5.PNG")));
						break;
					case 6:
						lblDie3.setIcon(new ImageIcon(RollDice.class.getResource("/images/DICE/DICE6.PNG")));
						break;
				}
			}
			if (!CheckBox4.isSelected())
			{
				Dice4Roll.setText(String.valueOf(rand4));
				switch(rand4) 
				{
					case 1:
						lblDie4.setIcon(new ImageIcon(RollDice.class.getResource("/images/DICE/DICE1.PNG")));
						break;
					case 2:
						lblDie4.setIcon(new ImageIcon(RollDice.class.getResource("/images/DICE/DICE2.PNG")));
						break;
					case 3:
						lblDie4.setIcon(new ImageIcon(RollDice.class.getResource("/images/DICE/DICE3.PNG")));
						break;
					case 4:
						lblDie4.setIcon(new ImageIcon(RollDice.class.getResource("/images/DICE/DICE4.PNG")));
						break;
					case 5:
						lblDie4.setIcon(new ImageIcon(RollDice.class.getResource("/images/DICE/DICE5.PNG")));
						break;
					case 6:
						lblDie4.setIcon(new ImageIcon(RollDice.class.getResource("/images/DICE/DICE6.PNG")));
						break;
				}
			}
			
			if (!CheckBox5.isSelected())
			{
				Dice5Roll.setText(String.valueOf(rand5));
		
				switch(rand5) 
				{
					case 1:
						lblDie5.setIcon(new ImageIcon(RollDice.class.getResource("/images/DICE/DICE1.PNG")));
						break;
					case 2:
						lblDie5.setIcon(new ImageIcon(RollDice.class.getResource("/images/DICE/DICE2.PNG")));
						break;
					case 3:
						lblDie5.setIcon(new ImageIcon(RollDice.class.getResource("/images/DICE/DICE3.PNG")));
						break;
					case 4:
						lblDie5.setIcon(new ImageIcon(RollDice.class.getResource("/images/DICE/DICE4.PNG")));
						break;
					case 5:
						lblDie5.setIcon(new ImageIcon(RollDice.class.getResource("/images/DICE/DICE5.PNG")));
						break;
					case 6:
						lblDie5.setIcon(new ImageIcon(RollDice.class.getResource("/images/DICE/DICE6.PNG")));
						break;
				}
			}
			}
			});
		contentPane.add(btnRoll);
		
		

	}
}
