import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Factorial{
	public static void main(String args[]){
		JFrame frame=new JFrame("Factorial");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		Container con=new Container();
		con.setLayout(null);
		JTextField tf1=new JTextField();
		tf1.setSize(100,20);
		tf1.setLocation(30,30);
		con.add(tf1);
		JButton cb=new JButton("Compute");
		con.add(cb);
		cb.setSize(100,30);
		cb.setLocation(30,60);
		JTextField tf2=new JTextField();
		con.add(tf2);
		tf2.setSize(250,20);
		tf2.setLocation(30,100);
		cb.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if((tf1.getText()).length()>0){
					int n=Integer.parseInt(tf1.getText());
					tf2.setText(Integer.toString(factorial(n)));
				}
				else tf2.setText("Pls Enter number in above text field");
				tf1.setText("");
			}
		});
		frame.add(con); frame.setVisible(true);
	}
	public static int factorial(int k){
		if(k==0) return 1;
		int val=1;
		for(int i=1;i<=k;i++) val*=i;
		return val;
	}
}
