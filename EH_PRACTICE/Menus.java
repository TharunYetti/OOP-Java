import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Menus{
	public static void main(String agrs[]){
		JFrame frame=new JFrame("MENU");
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con=new Container();
		con.setLayout(null);
		frame.add(con);
		
		JMenuBar mb=new JMenuBar();
		mb.setSize(1000,30);
		mb.setLocation(20,20);
		con.add(mb);
		
		JMenu m1=new JMenu("File");
		mb.add(m1);
		JMenu m2=new JMenu("Edit");
		mb.add(m2);
		
		JMenuItem m1i1=new JMenuItem("Save");
		m1.add(m1i1);
		JMenuItem m1i2=new JMenuItem("Edit");
		m1.add(m1i2);
		JMenuItem m1i3=new JMenuItem("Exit");
		m1.add(m1i3);
		m1i3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				JOptionPane.showMessageDialog(null,"You are closing the File");
				frame.dispose();
			}
		});
		
		frame.setVisible(true);
	}
}
