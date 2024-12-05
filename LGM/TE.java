import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class TE{
    static File file=null;
    static JTextArea ta=null;
    public static void main(String args[]){
        JFrame f=new JFrame("Text Editor");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(1500,690);
        Container con=new Container();
        con.setLayout(null);
        
        ta=new JTextArea();
        ta.setSize(1500,660);
        ta.setLocation(0,30);
        con.add(ta);
        JMenuBar mb=new JMenuBar();
        mb.setSize(1500,30);
        mb.setLocation(0,0);
        con.add(mb);
        JMenu m1=new JMenu("   File   ");
        m1.setSize(100,30);
        mb.add(m1);
        JMenuItem n=new JMenuItem(" New ");
        m1.add(n);
        n.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                ta.setText("");
            }
        });
        JMenuItem m11=new JMenuItem(" Save ");
        m1.add(m11);
        m11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if(ta.getText().length()==0) JOptionPane.showMessageDialog(null,"File is empty,can't save");
                else{
                    JFileChooser fc=new JFileChooser("file:");
                    if(fc.showSaveDialog(null)==JFileChooser.APPROVE_OPTION){
                        file=new File(fc.getSelectedFile().getAbsolutePath());
                        try{
                            FileWriter fw=new FileWriter(file);
                            BufferedWriter bw=new BufferedWriter(fw);
                            bw.write(ta.getText());
                            bw.close();
                            fw.close();
                        }catch(Exception ex){
                            JOptionPane.showMessageDialog(f,ex);
                        }
                    }
                }
            }
        });
        JMenuItem m12=new JMenuItem(" Open ");
        m1.add(m12);
        m12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                JFileChooser fc=new JFileChooser("file:");
                if(fc.showOpenDialog(null)==JFileChooser.APPROVE_OPTION){
                    file=new File(fc.getSelectedFile().getAbsolutePath());
                    try{
                        FileReader fr=new FileReader(file);
                        BufferedReader br=new BufferedReader(fr);
                        String line="",total="";
                        while((line=br.readLine())!=null){
                            total+=line+"\n";
                        }
                        ta.setText(total);
                        br.close();
                        fr.close();
                    }catch(Exception ex){
                        JOptionPane.showMessageDialog(f,ex);
                    }
                }
            }
        });
        JMenuItem m13=new JMenuItem(" Close ");
        m1.add(m13);
        m13.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null,"Closing the Text Editor");
                f.dispose();
            }
        });
        JMenuItem m14=new JMenuItem(" Print ");
        m1.add(m14);
        m14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if(ta.getText().length()==0) JOptionPane.showMessageDialog(null, "File is Empty, can't print");
                else{
                    try{
                        ta.print();
                    }catch(Exception ex){
                        JOptionPane.showMessageDialog(f,ex);
                    }
                }
            }
        });
        JMenu m2=new JMenu("   Edit   ");
        mb.add(m2);
        JMenuItem m21=new JMenuItem(" Cut ");
        m2.add(m21);
        m21.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                ta.cut();
            }
        });
        JMenuItem m22=new JMenuItem(" Copy ");
        m2.add(m22);
        m22.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                ta.copy();
            }
        });
        JMenuItem m23=new JMenuItem(" Paste ");
        m2.add(m23);
        m23.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                ta.paste();
            }
        });
        JButton m3=new JButton(" Save & Submit ");
        m3.setBackground(Color.gray);
        m3.setForeground(Color.white);
        m3.setSize(100,50);
        mb.add(m3);
        m3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(ta.getText().length()==0) JOptionPane.showMessageDialog(null,"You didn't select any file");
                else{
                    JFileChooser fc=new JFileChooser("file:");
                    if(fc.showSaveDialog(null)==JFileChooser.APPROVE_OPTION){
                        file=new File(fc.getSelectedFile().getAbsolutePath());
                        try{
                            FileWriter fw=new FileWriter(file);
                            BufferedWriter bw=new BufferedWriter(fw);
                            bw.write(ta.getText());
                            bw.close();
                            fw.close();
                        }catch(Exception ex){
                            JOptionPane.showMessageDialog(f,ex);
                        }
                    }
                }
                JOptionPane.showMessageDialog(null,"Closing the Text Editor");
                f.dispose();
            }
        });
        f.add(con);
        f.setVisible(true);
    }
}