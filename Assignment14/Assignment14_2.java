import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Assignment14_2{
	
    Assignment14_2(){
		JTextField t = new JTextField("AMAN");
		JFrame f = new JFrame();
		JButton b1 = new JButton("RED");
		JButton b2 = new JButton("BLUE");
		JButton b3 = new JButton("GREEN");
		
		t .setBounds(200, 50,50,20);
		b1.setBounds(100,120,80,30);
		b2.setBounds(200,120,80,30);
		b3.setBounds(300,120,80,30);
		
		f.add(t);
        f.add(b1);
        f.add(b2);
        f.add(b3);
		f.setSize(500,200);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
			t.setForeground(Color.red);	
			}
		});
		 
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
			t.setForeground(Color.blue);
			}
		});

		b3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
			t.setForeground(Color.green);
			}
		});
	}

	public static void main(String [] args){
		new Assignment14_2();
	}
}