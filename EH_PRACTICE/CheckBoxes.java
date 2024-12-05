import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class CheckBoxes{
	public static void main(String args[]){
		JFrame frame=new JFrame("CHECK BOXES");
		frame.setSize(400,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con=new Container();
		con.setLayout(null);
		
		JCheckBox cb1=new JCheckBox("INDIA");
		JCheckBox cb2=new JCheckBox("PARIS");
		JCheckBox cb3=new JCheckBox("EUROPE");
		cb1.setLocation(20,20);
		cb1.setSize(100,30);
		cb2.setLocation(20,60);
		cb2.setSize(100,30);
		cb3.setLocation(20,100);
		cb3.setSize(100,30);
		con.add(cb1);
		con.add(cb2);
		con.add(cb3);
		
		JLabel label=new JLabel();
		label.setLocation(150,20);
		label.setSize(100,100);
		con.add(label);
		
		JButton b1=new JButton("Submit");
		b1.setLocation(20,180);
		b1.setSize(100,50);
		con.add(b1);
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(cb1.isSelected()){
					label.setText(cb1.getText());
				}
				if(cb2.isSelected()){
					label.setText(label.getText()+" "+cb2.getText());
				}
				if(cb3.isSelected()){
					label.setText(label.getText()+" "+cb3.getText());
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
