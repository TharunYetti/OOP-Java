import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.*;
class GPA{
	public static void main(String args[]){
		JFrame frame=new JFrame("GPA Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		Container con=new Container();
		con.setLayout(null);
		
		JLabel label1=new JLabel("Enter your grades in each Subject (In Caps)");
		label1.setLocation(50,5);
		label1.setSize(350,15);
		con.add(label1);
		
		JLabel dm=new JLabel("Discrete Mathematics   :");
		dm.setLocation(30,30);
		dm.setSize(180,15);
		con.add(dm);
		JTextField dmtxt=new JTextField();
		dmtxt.setSize(50,16);
		dmtxt.setLocation(230,30);
		con.add(dmtxt);
		
		JLabel ep=new JLabel("Engineering Physics      :");
		ep.setLocation(30,50);
		ep.setSize(180,15);
		con.add(ep);
		JTextField eptxt=new JTextField();
		eptxt.setSize(50,16);
		eptxt.setLocation(230,50);
		con.add(eptxt);
		
		JLabel mefa=new JLabel("Managerial Economics  :");
		mefa.setLocation(30,70);
		mefa.setSize(180,15);
		con.add(mefa);
		JTextField mefatxt=new JTextField();
		mefatxt.setSize(50,15);
		mefatxt.setLocation(230,70);
		con.add(mefatxt);
		
		JLabel oops=new JLabel("JAVA Language               :");
		oops.setLocation(30,90);
		oops.setSize(180,16);
		con.add(oops);
		JTextField oopstxt=new JTextField();
		oopstxt.setSize(50,16);
		oopstxt.setLocation(230,90);
		con.add(oopstxt);
		
		JLabel ds=new JLabel("Data Structures             :");
		ds.setLocation(30,110);
		ds.setSize(180,15);
		con.add(ds);
		JTextField dstxt=new JTextField();
		dstxt.setSize(50,16);
		dstxt.setLocation(230,110);
		con.add(dstxt);
		
		JLabel oopslab=new JLabel("Java Programming Lab   :");
		oopslab.setLocation(30,130);
		oopslab.setSize(180,15);
		con.add(oopslab);
		JTextField oopslabtxt=new JTextField();
		oopslabtxt.setSize(50,16);
		oopslabtxt.setLocation(230,130);
		con.add(oopslabtxt);
		
		JLabel dslab=new JLabel("Data Structures Lab      :");
		dslab.setLocation(30,150);
		dslab.setSize(180,15);
		con.add(dslab);
		JTextField dslabtxt=new JTextField();
		dslabtxt.setSize(50,16);
		dslabtxt.setLocation(230,150);
		con.add(dslabtxt);
		
		JLabel grade=new JLabel();
		grade.setLocation(70,210);
		grade.setSize(500,15);
		con.add(grade);
		
		JButton compute=new JButton("Compute");
		compute.setSize(100,15);
		compute.setLocation(100,180);
		con.add(compute);
		compute.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if( (dmtxt.getText().length())==1 && (eptxt.getText()).length()==1 && (mefatxt.getText()).length()==1 && (oopstxt.getText()).length()==1 && (dstxt.getText()).length()==1 && (oopslabtxt.getText()).length()==1 && (dslabtxt.getText()).length()==1){
					if((dmtxt.getText().charAt(0)>=65 && dmtxt.getText().charAt(0)<=69)&&
					(eptxt.getText().charAt(0)>=65 && eptxt.getText().charAt(0)<=69)&&
					(mefatxt.getText().charAt(0)>=65 && mefatxt.getText().charAt(0)<=69)&&
					(oopstxt.getText().charAt(0)>=65 && oopstxt.getText().charAt(0)<=69)&&
					(dstxt.getText().charAt(0)>=65 && dstxt.getText().charAt(0)<=69)&&
					(oopslabtxt.getText().charAt(0)>=65 && oopslabtxt.getText().charAt(0)<=69)&&
					(dslabtxt.getText().charAt(0)>=65 && dslabtxt.getText().charAt(0)<=69)){
						int m1=getMarks(dmtxt.getText());
						int m2=getMarks(eptxt.getText());
						int m3=getMarks(mefatxt.getText());
						int m4=getMarks(oopstxt.getText());
						int m5=getMarks(dstxt.getText());
						int m6=getMarks(oopslabtxt.getText());
						int m7=getMarks(dslabtxt.getText());
						double total=m1*4+m2*4+m3*3+m4*4+m5*3+m6*(1.5)+m7*(1.5);
						double GPA=total/21;
						grade.setText("Your GPA is "+String.format("%.2f",GPA));
					}
					else{
						grade.setText("Please Enter All Fields Correctly");
					}
				}
				else if( (dmtxt.getText().length())>1 || (eptxt.getText()).length()>1 || (mefatxt.getText()).length()>1 || (oopstxt.getText()).length()>1 || (dstxt.getText()).length()>1 || (oopslabtxt.getText()).length()>1 || (dslabtxt.getText()).length()>1){
					grade.setText("Please Enter valid input!");
				}
				else{
					grade.setText("Please Fill All The Text Fields!");
				}
			}
		});

		
		frame.add(con);
		frame.setVisible(true);
	}
	static int getMarks(String k){
		switch(k){
			case "A":return 10;
			case "B":return 9;
			case "C":return 8;
			case "D":return 7;
			case "E":return 5;
		}
		return 0;
	}
}
