import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class HelloFrame {
	public static void main(String args[]){
		
			JFrame frame=new JFrame();
			frame.setTitle("First Frame");
			frame.setSize(300,350);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Container con=frame.getContentPane();
			con.setLayout(null);
			  JLabel out=new JLabel();
			  out.setLocation(30,5);
			  out.setSize(100,30);
			  con.add(out);
			JButton b1=new JButton("1");
			b1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e){
					String s=b1.getText();
					String val=out.getText();
					 val +=s;
					 out.setText(val);
					System.out.println("Clicked!!"+s);
				}
			});
			b1.setLocation(30,30);
			b1.setSize(50,30);
			con.add(b1);
			JButton b2=new JButton("2");
			b2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e){
					String s=b2.getText();
					String val=out.getText();
					 val +=s;
					 out.setText(val);
					System.out.println("Clicked!!"+s);
				}
			});
			b2.setLocation(30,60);
			b2.setSize(50,30);
			con.add(b2);
			frame.setVisible(true);
			
	}
}
