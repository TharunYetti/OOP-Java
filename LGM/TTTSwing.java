import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class TTTSwing{
	static JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
	public static void main(String args[]){
		JFrame frame=new JFrame("TIC-TAC-TOE");
		//frame.setFont(new Font("serif", 1, 24));
		frame.setSize(1000,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.YELLOW);
		Container con=new Container();
		con.setLayout(null);
		frame.add(con);
				
		JLabel head=new JLabel("<html><b><h2>TIC-TAC-TOE GAME</h2></b><html>");
		head.setFont(new Font(head.getText(),Font.TYPE1_FONT,14));
		head.setLocation(400,10);
		head.setSize(250,20);
		con.add(head);
		
		JLabel main=new JLabel();
		main.setLocation(30,30);
		main.setSize(750,350);
		con.add(main);
		main.setText("<html><pre><b>Welcome to TIC TAC TOE Game<br><br>--> We provide a board of 3X3 size<br>--> Each cell will contain either \'O\' or \'X\'<br>--> Two persons will play the game, They are called Active Members<br>--> One person should enter only either \'O\' or \'X\' and the other person will take the rest<br>--> Entering of character is one by one<br>--> The position of the board are as follows<br><br><b><pre><html>");
        	int k=1;
       		for(int i=0;i<3;i++){
            		for(int j=0;j<3;j++){
                		if(i==0 && j==2 || i==1 && j==2 || i==2 && j==2) main.setText(main.getText()+" "+k+"  ");
                		else main.setText(main.getText()+" "+k+" |");
                		k++;
            		}
            		if(i!=2) main.setText(main.getText()+"\n--- --- ---\n");
        	}
		main.setFont(new Font(main.getText(),Font.PLAIN,14));
		JLabel gb=new JLabel("GAME BOARD");
		gb.setLocation(758,10);
		gb.setSize(200,100);
		gb.setFont(new Font("GAME BOARD",Font.PLAIN,25));
		con.add(gb);

		b1=new JButton();
		b1.setLocation(770,80);
		b1.setSize(50,50);
		con.add(b1);
		b2=new JButton();
		b2.setLocation(820,80);
		b2.setSize(50,50);
		con.add(b2);
		b3=new JButton();
		b3.setLocation(870,80);
		b3.setSize(50,50);
		con.add(b3);
		b4=new JButton();
		b4.setLocation(770,130);
		b4.setSize(50,50);
		con.add(b4);
		b5=new JButton();
		b5.setLocation(820,130);
		b5.setSize(50,50);
		con.add(b5);
		b6=new JButton();
		b6.setLocation(870,130);
		b6.setSize(50,50);
		con.add(b6);
		b7=new JButton();
		b7.setLocation(770,180);
		b7.setSize(50,50);
		con.add(b7);
		b8=new JButton();
		b8.setLocation(820,180);
		b8.setSize(50,50);
		con.add(b8);
		b9=new JButton();
		b9.setLocation(870,180);
		b9.setSize(50,50);
		con.add(b9);
		b1.setBackground(Color.cyan);
		b2.setBackground(Color.cyan);
		b3.setBackground(Color.cyan);
		b4.setBackground(Color.cyan);
		b5.setBackground(Color.cyan);
		b6.setBackground(Color.cyan);
		b7.setBackground(Color.cyan);
		b8.setBackground(Color.cyan);
		b9.setBackground(Color.cyan);

		frame.setVisible(true);
		
		int n,count=1;
        	char c,c1='X',c2='O';
        	String s,s1="Person-1",s2="Person-2";
        	boolean flag=false;
        	while(!flag && count<=9){
            		if(count%2==1) s=s1;
            		else s=s2;
            		n=Integer.parseInt(JOptionPane.showInputDialog(s+"\nWhere do you want to enter(1-9):"));
            		if(count==1){
				c=(JOptionPane.showInputDialog("Enter your choice(X or O)")).charAt(0);
				if(c>=97 && c<=122) c-=32;
				if(c=='X'){c1='X';c2='O';}
				else if(c=='O'){c1='O';c2='X';}
				else{JOptionPane.showMessageDialog(null,"You have entered wrong input,Enter again");continue;}  
			}
			if(count%2==1) c=c1;
			else c=c2;
			if(n==1){
				if(b1.getText().length()==0){
					b1.setText(" "+c+"");
					count++;
				}
				else{
				    JOptionPane.showMessageDialog(null,"You entered Wrong input,enter again carefully");
				    continue;
				}
			}
			else if(n==2){
				if(b2.getText().length()==0){
					b2.setText(" "+c+"");
					count++;}
				else{
				    JOptionPane.showMessageDialog(null,"You entered Wrong input,enter again carefully");
				    continue;
				}
			}
			else if(n==3){
				if(b3.getText().length()==0){
					b3.setText(" "+c+"");
					count++;}
				else{
				    JOptionPane.showMessageDialog(null,"You entered Wrong input,enter again carefully");
				    continue;
				}
			}
			else if(n==4){
				if(b4.getText().length()==0){
					b4.setText(" "+c+"");
					count++;}
				else{
				    JOptionPane.showMessageDialog(null,"You entered Wrong input,enter again carefully");
				    continue;
				}
			}
			else if(n==5){
				if(b5.getText().length()==0){
				b5.setText(" "+c+"");
				count++;}
				else{
				    JOptionPane.showMessageDialog(null,"You entered Wrong input,enter again carefully");
				    continue;
				}
			}
			else if(n==6){
				if(b6.getText().length()==0){
				b6.setText(" "+c+"");
				count++;}
				else{
				    JOptionPane.showMessageDialog(null,"You entered Wrong input,enter again carefully");
				    continue;
				}
			}
			else if(n==7){
				if(b7.getText().length()==0){
				b7.setText(" "+c+"");
				count++;}
				else{
				    JOptionPane.showMessageDialog(null,"You entered Wrong input,enter again carefully");
				    continue;
				}
			}
			else if(n==8){
				if(b8.getText().length()==0){
				b8.setText(" "+c+"");
				count++;}
				else{
				    JOptionPane.showMessageDialog(null,"You entered Wrong input,enter again carefully");
				    continue;
				}
			}
			else if(n==9){
				if(b9.getText().length()==0){
				b9.setText(" "+c+"");
				count++;}
				else{
				    JOptionPane.showMessageDialog(null,"You entered Wrong input,enter again carefully");
				    continue;
				}
			}
			else{
				JOptionPane.showMessageDialog(null,"You entered wrong input,enter again carefully");
				continue;
			}
			if(check()==1){
				if((count-1)%2==1){
					JOptionPane.showMessageDialog(null,"Hurray!\nPerson-1("+c1+") Won the Game");
					System.out.println("Hurray!\nPerson-1("+c1+") Won the game");
				}
				else{
					JOptionPane.showMessageDialog(null,"Hurray!\nPerson-2("+c2+") Won the Game");
					System.out.println("Hurray!\nPerson-1("+c2+") Won the game");
				}
				System.out.println("Thank you for playing :)");
				flag=true;
				frame.dispose();
			}
		}
		if(!flag){
			JOptionPane.showMessageDialog(null,"Oops!\nIt's a draw");
			System.out.println("Oops!\nIt's a draw");
			System.out.println("Thank you for playing :)");
			frame.dispose();
		}
	}
	static int check(){
		if(b1.getText().length()!=0 && b2.getText().length()!=0 && b3.getText().length()!=0){
			if(b1.getText().equals(b2.getText()) && b2.getText().equals(b3.getText())) return 1;
		}
		if(b4.getText().length()!=0 && b5.getText().length()!=0 && b6.getText().length()!=0){
			if(b4.getText().equals(b5.getText()) && b5.getText().equals(b6.getText())) return 1;
		}
		if(b7.getText().length()!=0 && b8.getText().length()!=0 && b9.getText().length()!=0){
			if(b7.getText().equals(b8.getText()) && b8.getText().equals(b9.getText())) return 1;
		}
		if(b1.getText().length()!=0 && b4.getText().length()!=0 && b7.getText().length()!=0){
			if(b1.getText().equals(b4.getText()) && b4.getText().equals(b7.getText())) return 1;
		}
		if(b2.getText().length()!=0 && b5.getText().length()!=0 && b8.getText().length()!=0){
			if(b2.getText().equals(b5.getText()) && b5.getText().equals(b8.getText())) return 1;
		}
		if(b3.getText().length()!=0 && b6.getText().length()!=0 && b9.getText().length()!=0){
			if(b3.getText().equals(b6.getText()) && b6.getText().equals(b9.getText())) return 1;
		}
		if(b1.getText().length()!=0 && b5.getText().length()!=0 && b9.getText().length()!=0){
			if(b1.getText().equals(b5.getText()) && b5.getText().equals(b9.getText())) return 1;
		}
		if(b3.getText().length()!=0 && b5.getText().length()!=0 && b7.getText().length()!=0){
			if(b3.getText().equals(b5.getText()) && b5.getText().equals(b7.getText())) return 1;
		}
		return 0;
	}
}
