import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class RadioCheck{
	public static void main(String args[]){
		JFrame frame=new JFrame("RadioCheck");
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con=new Container();
		con.setLayout(null);
		
		JRadioButton rb1=new JRadioButton("Male");
		rb1.setLocation(20,20);
		rb1.setSize(100,30);
		JRadioButton rb2=new JRadioButton("Female");
		rb2.setLocation(20,60);
		rb2.setSize(100,50);
		JRadioButton rb3=new JRadioButton("Other");
		rb3.setLocation(20,120);
		rb3.setSize(100,50);
		con.add(rb1);
		con.add(rb2);
		con.add(rb3);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		bg.add(rb3);
		
		JLabel label=new JLabel();
		label.setLocation(150,20);
		label.setSize(200,20);
		con.add(label);
		
		JButton b1=new JButton("Submit");
		b1.setLocation(20,180);
		b1.setSize(100,50);
		con.add(b1);
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(rb1.isSelected()){
					label.setText(rb1.getText());
				}
				else if(rb2.isSelected()){
					label.setText(rb2.getText());
				}
				else if(rb3.isSelected()){
					label.setText(rb3.getText());
				}
				else{
					label.setText("Please select your gender");
				}
			}
			
		});
		
		frame.add(con);
		frame.setVisible(true);
	}
}
