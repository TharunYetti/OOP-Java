import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class GUI{
	public static void main(String args[]){
		JFrame f=new JFrame();
		f.setSize(400,400);
		f.setBackground(new Color(0,255,0));
		
		Container con=new Container();
		con.setLayout(null);
		con.setBackground(new Color(0,255,0));
		
		JMenuBar mb=new JMenuBar();
		mb.setSize(1000,30);
		mb.setLocation(0,0);
		
		JMenu m1=new JMenu("new");
		JMenu m2=new JMenu("option");
		JMenu m3=new JMenu("edit");
		
		
		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		
		JMenuItem mi1=new JMenuItem("open");
		JMenuItem mi2=new JMenuItem("save");
		JMenuItem mi3=new JMenuItem("saveas");
	
		m1.add(mi1);
		m1.add(mi2);
		m1.add(mi3);
		
		con.add(mb);
		f.add(con);
		f.setVisible(true);
	}
	
}
