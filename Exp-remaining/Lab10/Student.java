import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.*;
class Student{
	public static void main(String args[])throws IOException{
		JFrame frame=new JFrame("Student Registration");
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con=new Container();
		con.setLayout(null);
		
		JLabel label=new JLabel();
		label.setLocation(25,20);
		label.setSize(350,20);
		con.add(label);
		
		JLabel l1=new JLabel("Student Name");
		l1.setLocation(30,50);
		l1.setSize(200,20);
		con.add(l1);
		JTextField tf1=new JTextField();
		tf1.setLocation(200,50);
		tf1.setSize(100,20);
		con.add(tf1);
		JLabel l2=new JLabel("Student Age");
		l2.setLocation(30,90);
		l2.setSize(180,20);
		con.add(l2);
		JTextField tf2=new JTextField();
		tf2.setLocation(200,90);
		tf2.setSize(100,20);
		con.add(tf2);
		JLabel l3=new JLabel("Student mail");
		l3.setLocation(30,120);
		l3.setSize(160,20);
		con.add(l3);
		JTextField tf3=new JTextField();
		tf3.setLocation(200,120);
		tf3.setSize(100,20);
		con.add(tf3);
		
		JButton b1=new JButton("Register");
		b1.setLocation(110,160);
		b1.setSize(100,20);
		con.add(b1);
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try{
					FileWriter fw=new FileWriter("output.txt",true);
					BufferedWriter bw=new BufferedWriter(fw);
					if((tf1.getText()).length()==0||(tf2.getText()).length()==0||(tf2.getText()).length()==0){
						label.setText("*Click Register Button After Filling All Fields");
						return;
					}
					else	label.setText("\t\tRegistered");
					bw.write("------------------------\n");
					bw.write("Student name:"+tf1.getText()+"\n");
					bw.write("Student Age:"+tf2.getText()+"\n");
					bw.write("Student mail:"+tf3.getText()+"\n");
					System.out.println("Registered!");
					bw.close();
					fw.close();
				}catch(Exception eee){}
				finally{
					tf1.setText("");
					tf2.setText("");
					tf3.setText("");
				}
			}
		});
		frame.add(con);
		frame.setVisible(true);
	}
}
