import java.awt.*;
import java.awt.event.*;
public class Assignment14_1 extends Frame implements ActionListener {
	TextField tf;
	Button b1,b2,b3;
	Assignment14_1(){
		tf = new TextField("AMAN");
		b1 = new Button("Red");
		b2 = new Button("Blue");
		b3 = new Button("Green");

		tf.setBounds(200, 50,50,20);
		b1.setBounds(100,120,50,30);
		b2.setBounds(200,120,50,30);
		b3.setBounds(300,120,50,30);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		add(tf);
		add(b1);
		add(b2);
		add(b3);
		setSize(500,170);
		setLayout(null);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==b1){
			b1.setBackground(Color.red);
			tf.setForeground(Color.red);
		}
		
		if(e.getSource()==b2){
			b2.setBackground(Color.blue);
			tf.setForeground(Color.blue);
		}

		if(e.getSource()==b3){
			b3.setBackground(Color.green);
			tf.setForeground(Color.green);
		}
	}		
	
	public static void main(String args[]){
		new Assignment14_1();
	}
}