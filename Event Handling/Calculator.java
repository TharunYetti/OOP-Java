//calcuator
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Calculator{
	public static void main(String args[]){
		JFrame frame=new JFrame("CALC");
		frame.setSize(400,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con=new Container();
		con.setLayout(null);
		JLabel label=new JLabel();
		label.setLocation(50,0);
		//label.setOpaque(true);
		//label.setBackground(Color.GRAY);
		label.setSize(500,50);
		con.add(label);
		JButton b1=new JButton("1");JButton b2=new JButton("2");JButton b3=new JButton("3");
		JButton b4=new JButton("4");JButton b5=new JButton("5");JButton b6=new JButton("6");
		JButton b7=new JButton("7");JButton b8=new JButton("8");JButton b9=new JButton("9");JButton b0=new JButton("0");
		JButton be=new JButton("=");JButton bPlus=new JButton("+");JButton bMinus=new JButton("-");
		JButton bProd=new JButton("x");JButton bDiv=new JButton("/");
		JButton clear=new JButton("AC");JButton del=new JButton("Del");
		
		con.add(b1);con.add(b2);con.add(b3);con.add(b4);con.add(b5);con.add(b6);con.add(b7);con.add(b8);con.add(b9);con.add(b0);
		con.add(be);con.add(bPlus);con.add(bMinus);con.add(bProd);con.add(bDiv);
		con.add(clear);con.add(del);
		
		b1.setLocation(50,50);
		b2.setLocation(100,50);
		b3.setLocation(150,50);bPlus.setLocation(200,50);
		b4.setLocation(50,100);
		b5.setLocation(100,100);
		b6.setLocation(150,100);bMinus.setLocation(200,100);
		b7.setLocation(50,150);
		b8.setLocation(100,150);
		b9.setLocation(150,150);bProd.setLocation(200,150);
		b0.setLocation(50,200);
		be.setLocation(150,200);bDiv.setLocation(200,200);
		clear.setLocation(50,250);
		del.setLocation(150,250);
		
		b1.setSize(50,50);bPlus.setSize(50,50);
		b2.setSize(50,50);bMinus.setSize(50,50);
		b3.setSize(50,50);bProd.setSize(50,50);
		b4.setSize(50,50);bDiv.setSize(50,50);
		b5.setSize(50,50);clear.setSize(100,50);
		b6.setSize(50,50);del.setSize(100,50);
		b7.setSize(50,50);
		b8.setSize(50,50);
		b9.setSize(50,50);
		b0.setSize(100,50);
		be.setSize(50,50);
		
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String s=b1.getText();
				String val=label.getText();
				val+=s;
				label.setText(val);
				//System.out.println("Clicked!!"+s);
			}
		});
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String s=b2.getText();
				String val=label.getText();
				val+=s;
				label.setText(val);
				//System.out.println("Clicked!!"+s);
			}
		});
		b3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String s=b3.getText();
				String val=label.getText();
				val+=s;
				label.setText(val);
				//System.out.println("Clicked!!"+s);
			}
		});
		b4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String s=b4.getText();
				String val=label.getText();
				val+=s;
				label.setText(val);
				//System.out.println("Clicked!!"+s);
			}
		});
		b5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String s=b5.getText();
				String val=label.getText();
				val+=s;
				label.setText(val);
				//System.out.println("Clicked!!"+s);
			}
		});
		b6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String s=b6.getText();
				String val=label.getText();
				val+=s;
				label.setText(val);
				//System.out.println("Clicked!!"+s);
			}
		});
		b7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String s=b7.getText();
				String val=label.getText();
				val+=s;
				label.setText(val);
				//System.out.println("Clicked!!"+s);
			}
		});
		b8.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String s=b8.getText();
				String val=label.getText();
				val+=s;
				label.setText(val);
				//System.out.println("Clicked!!"+s);
			}
		});
		b9.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String s=b9.getText();
				String val=label.getText();
				val+=s;
				label.setText(val);
				//System.out.println("Clicked!!"+s);
			}
		});
		b0.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String s=b0.getText();
				String val=label.getText();
				val+=s;
				label.setText(val);
				//System.out.println("Clicked!!"+s);
			}
		});
		bPlus.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String s=bPlus.getText();
				String val=label.getText();
				val+=s;
				label.setText(val);
				//System.out.println("Clicked!!"+s);
			}
		});
		bMinus.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String s=bMinus.getText();
				String val=label.getText();
				val+=s;
				label.setText(val);
				//System.out.println("Clicked!!"+s);
			}
		});
		bProd.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String s=bProd.getText();
				String val=label.getText();
				val+=s;
				label.setText(val);
				//System.out.println("Clicked!!"+s);
			}
		});
		bDiv.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String s=bDiv.getText();
				String val=label.getText();
				val+=s;
				label.setText(val);
				//System.out.println("Clicked!!"+s);
			}
		});
		be.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String val=label.getText(),str1="",str2="",outputstr="";
				int i=0;
				while(i<val.length() && val.charAt(i)!='+' && val.charAt(i)!='-' && val.charAt(i)!='x' && val.charAt(i)!='/') 
					str1+=val.charAt(i++);
				if(i==val.length()){
					label.setText("OPERATOR NOT FOUND");
					return;
				}
				for(i=i+1;i<val.length();i++) str2+=val.charAt(i);
				if(str1.length()==0||str2.length()==0){
					label.setText("Arguments are not Enough");
					return;
				}
				int n1=Integer.parseInt(str1),n2=Integer.parseInt(str2),output=0;
				if(val.indexOf('+')!=-1) output=n1+n2;
				else if(val.indexOf('-')!=-1) output=n1-n2;
				else if(val.indexOf('x')!=-1) output=n1*n2;
				else if(val.indexOf('/')!=-1){
					if(n2==0){
						label.setText("ZERO DIVISION ERROR");
						return;
					}
					else output=n1/n2;
				}
				outputstr=Integer.toString(output);
				label.setText(outputstr);
			}
		});
		clear.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				label.setText("");
			}
		});
		del.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String val=label.getText();
				String val2=val.substring(0,val.length()-1);
				label.setText(val2);
			}
		});
		frame.add(con);
		frame.setVisible(true);
	}
}
