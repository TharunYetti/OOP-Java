import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class CC{
    static Double cur[][]={{1.0,0.012,0.0037,0.0046,0.0086,3.92,3.63},{82.68,1.0,0.31,0.38,0.71,323.98,299.84},{267.98,3.24,1.0,1.22,1.25,1050.22,971.97},{219.27,2.65,0.82,1.0,1.88,859.34,795.32},{116.75,1.41,0.44,0.53,1.0,457.54,423.45},{0.26,0.0031,0.00095,0.0012,0.0022,1.0,0.93},{0.28,0.0033,0.0010,0.0013,0.0024,1.08,1.0}};
    static String s[]={"India (INR)","United States Dollar (USD)","Kuwaiti Dinar (KWD)","Bahraini Dinar (BHD)","Jordanian Dinar (JOD)","Sri Lankan Rupee (SLR)","Pakistani Rupee (PKR)"};
    public static void main(String args[]){
        JFrame f=new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(600,300);
        Container con=new Container();
        con.setLayout(null);
        f.add(con);
        
        JLabel l1=new JLabel("From :");
        l1.setLocation(30,35);
        l1.setSize(45,10);
        con.add(l1);
    
        JComboBox <String>cb=new JComboBox<>(s);
        cb.setSize(212,20);
        cb.setLocation(80,30);
        con.add(cb);
        JLabel ip=new JLabel("Input :");
        ip.setLocation(30,85);
        ip.setSize(60,15);
        con.add(ip);
        JTextField t1=new JTextField();
        t1.setLocation(80,85);
        t1.setSize(212,20);
        con.add(t1);

        JLabel l2=new JLabel("To :");
        l2.setLocation(325,35);
        l2.setSize(40,10);
        con.add(l2);
        JComboBox <String>cb2=new JComboBox<>(s);
        cb2.setSize(212,20);
        cb2.setLocation(360,30);
        con.add(cb2);
        JLabel op=new JLabel("Output :");
        op.setLocation(295,87);
        op.setSize(60,15);
        con.add(op);
        JTextField t2=new JTextField();
        t2.setLocation(360,85);
        t2.setSize(212,20);
        con.add(t2);
        t2.setBackground(Color.LIGHT_GRAY);

        JLabel pl=new JLabel();
        pl.setLocation(210,200);
        pl.setSize(200,20);
        con.add(pl);

        JButton convert=new JButton("Convert");
        convert.setLocation(225,150);
        convert.setSize(150,30);
        convert.setFont(new Font((convert.getText()),Font.BOLD,20));

        convert.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if((t1.getText()).length()==0){
                    //if((cb.getSelectedItem().toString()).equals(s[0])) System.out.println("TY");
                    pl.setText("Please Enter the amount!");
                }
                else{
                    double d;
                    int i;
                    pl.setText("");
                    d=cur[index(cb.getSelectedItem().toString())][index(cb2.getSelectedItem().toString())];
                    try{
                    	d=d*(Double.parseDouble(t1.getText()));
                    }catch(Exception ee){
                    	pl.setText("Please Enter the amount correctly!");
                    }
                    t2.setText(String.valueOf(d));
                }
            }
        });
        con.add(convert);

        convert.setBackground(Color.orange);
        Color c=new Color(254,239,215);
        con.setBackground(c);
        f.setVisible(true);
    }
    static int index(String k){
    	if(k.equals(s[0])) return 0;
    	else if(k.equals(s[1])) return 1;
    	else if(k.equals(s[2])) return 2;
    	else if(k.equals(s[3])) return 3;
    	else if(k.equals(s[4])) return 4;
    	else if(k.equals(s[5])) return 5;
    	else if(k.equals(s[6])) return 6;
    	else return -1;
    }
}
