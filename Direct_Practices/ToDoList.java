import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class ToDoList{
	public static int h=0,i=0;
	public static JLabel tasks[]=new JLabel[9];
	public static JCheckBox chbs[]=new JCheckBox[9];
	//public static JLabel task=null;
	//public static JCheckBox ch=null;
	public static void main(String args[]){
		JFrame frame=new JFrame("TO DO LIST");
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con=new Container();
		con.setLayout(null);
		
		JLabel head=new JLabel("TO DO LIST");
		head.setSize(100,30);
		head.setLocation(210,10);
		con.add(head);
		
		JLabel l1=new JLabel("Task : ");
		l1.setSize(50,30);
		l1.setLocation(30,40);
		con.add(l1);
		
		JTextArea ta1=new JTextArea();
		ta1.setSize(300,30);
		ta1.setLocation(85,40);
		con.add(ta1);
		
		JButton b1=new JButton("Add");
		b1.setBackground(Color.GREEN);
		b1.setLocation(390,40);
		b1.setSize(70,30);
		con.add(b1);
		
		JLabel l2=new JLabel();
		l2.setSize(400,20);
		l2.setLocation(130,80);
		con.add(l2);

		JButton remove=new JButton("X");
		remove.setBackground(Color.GRAY);
		remove.setForeground(Color.WHITE);
		remove.setSize(48,260);
		remove.setLocation(510,40);
		con.add(remove);
		remove.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				for(int k=0;k<i;k++){
					if(k==i-1)h-=60;
					if(chbs[k].isSelected()){
						con.remove(tasks[k]);
						con.remove(chbs[k]);
					}
				}
				con.revalidate();
				con.repaint();
			}
		});
		
		JButton AC=new JButton("C");
		AC.setBackground(Color.RED);
		AC.setForeground(Color.WHITE);
		AC.setSize(48,260);
		AC.setLocation(510,300);
		con.add(AC);
		AC.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				for(int k=0;k<i;k++){
					con.remove(tasks[k]);
					con.remove(chbs[k]);
				}
				con.revalidate();
				con.repaint();
				h=0;
			}
		});

		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(i==9){
					JOptionPane.showMessageDialog(null,"Over Flow of Tasks,Limit reached");
					//frame.dispose();
				}
				if(ta1.getText().length()==0){
					l2.setText("Please Enter your task to add!");
				}
				else{
					l2.setText("");
					tasks[i]=new JLabel(" --> "+ta1.getText());
					tasks[i].setSize(300,50);
					tasks[i].setLocation(30,100+h);
					con.add(tasks[i]);
					chbs[i]=new JCheckBox("Done");
					chbs[i].setLocation(370,100+h);
					chbs[i].setSize(100,50);
					con.add(chbs[i++]);
					h+=60;
					con.revalidate();
					con.repaint();
					JOptionPane.showMessageDialog(null,"Task Added");
				}
			}
		});
		
		frame.add(con);
		frame.setVisible(true);
	}
}
