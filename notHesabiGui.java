package main.java;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField; 

public class Nothesabi {

	public static void main(String[] args) {

		JFrame frm = new JFrame ("Not hesap uygulaması"); 
		frm.setSize(400,500);                            
		frm.setLocation(100,200);                         
		frm.setLayout(null);
		
		JLabel lb1 = new JLabel("1.Dönem 1.sınav: ");
		lb1.setBounds(10,27,150,30);
		
		JLabel lb2 = new JLabel("1.Dönem 2.sınav: ");
		lb2.setBounds(10,77,150,30);
		
		JLabel lb3 = new JLabel("2.Dönem 1.sınav: ");
		lb3.setBounds(10,127,150,30);
		
		JLabel lb4 = new JLabel("2.Dönem 2.sınav: ");
		lb4.setBounds(10,177,150,30);
		
		JLabel lb5 = new JLabel("Yıl sonu ortalamanız: ");
		lb5.setBounds(20,300,200,30);
		
		JLabel lb6 = new JLabel("Dersten: ");
		lb6.setBounds(230,300,70,30);
		
		
		JTextField txt1 = new JTextField(20);
		txt1.setBounds(140,27,80,20);
		
		JTextField txt2 = new JTextField(20);
		txt2.setBounds(140,77,80,20);
		
		JTextField txt3 = new JTextField(20);
		txt3.setBounds(140,127,80,20);
		
		JTextField txt4 = new JTextField(20);
		txt4.setBounds(140,177,80,20);
		
		JButton btn = new JButton("hesapla");
		btn.setBounds(60,240,100,25);
		
		
		
		btn.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				
				int bdbs, bdis, idbs, idis ;
				double ort;
				
				bdbs = Integer.parseInt(txt1.getText());
				bdis = Integer.parseInt(txt2.getText());
				idbs = Integer.parseInt(txt3.getText());
				idis = Integer.parseInt(txt4.getText());
				
				ort= (((double)bdbs + bdis)/2) + (((double)idbs + idis)/2) ;
				lb5.setText("Yıl sonu ortalamanız: " + String.format("%.2f", ort));
				
				
				if( ort <= 43 )
					lb6.setText("Dersi Kaldı ");
				else 
					lb6.setText("Dersi Geçti ");
				
						
			}
		});
		
		
		
		
		frm.add(btn);
		frm.add(txt1);
		frm.add(txt2);
		frm.add(txt3);
		frm.add(txt4);
		frm.add(lb1);
		frm.add(lb2);
		frm.add(lb3);
		frm.add(lb4);
		frm.add(lb5);
		frm.add(lb6);
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		
	}
	

}
