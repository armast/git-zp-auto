package ZarplataA;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Zp extends JFrame {
	JButton b1, b2;
	JLabel l0,l1, l2, l3, l4, l5, l6, l7, l8, l9;
	JTextField t0, t1, t2, t3, t4, t5, t6, t7;
	float i, k, l, m, n, o, p, q, r, s, t, u, v;
	String a;
	eHandler handler = new eHandler();
	
	public Zp(String s){
		super (s);
		setLayout(new FlowLayout());
		b1 = new JButton("����������");
		b2 = new JButton("��������");
		l0 = new JLabel("������������� �������� ������, ���");
		l1 = new JLabel("��������� �������� �����, ���.");
		l2 = new JLabel("��������� �����-����, ���.");
		l3 = new JLabel("�����");
		l4 = new JLabel("���-�� ������������ ����");
		l5 = new JLabel("������");
		l6 = new JLabel("K.��");
		l7 = new JLabel("�.��");
		l8 = new JLabel("");
		l9 = new JLabel("��������� ����� :            ");
		t0 = new JTextField(8);
		t1 = new JTextField(10);
		t2 = new JTextField(12);
		t3 = new JTextField(24);
		t4 = new JTextField(13);
		t5 = new JTextField(24);
		t6 = new JTextField(26);
		t7 = new JTextField(26);
		add(l9);
		add(l1);
		add(t1);
		add(l0);
		add(t0);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(l4);
		add(t4);
		add(l5);
		add(t5);
		add(l6);
		add(t6);
		add(l7);
		add(t7);
		add(b1);
		add(b2);
		add(l8);
		b1.addActionListener(handler);
		b2.addActionListener(handler);
	}
	
	public class eHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			try{
				if(e.getSource()==b1){
					i = Float.parseFloat(t1.getText());
					k = Float.parseFloat(t0.getText());
					l = Float.parseFloat(t2.getText());
					m = Float.parseFloat(t3.getText());
					n = Float.parseFloat(t4.getText());
					o = Float.parseFloat(t5.getText());
					p = Float.parseFloat(t6.getText());
					q = Float.parseFloat(t7.getText());
					
					s = (i-k)*82/100*67/1000*p;
					t = l*82/100*43/1000*q;
					u = m*(n/15);
					v = o*17;
					r = (s+t+u+v)*87/100;
					
					a = "���� ���������� ����� ����������: " + r +" ������.";
					l8.setText(a);
				}
				if(e.getSource()==b2){
					t0.setText(null);
					t1.setText(null);
					t2.setText(null);
					t3.setText(null);
					t4.setText(null);
					t5.setText(null);
					t6.setText(null);
					t7.setText(null);
					l8.setText("");
				}
			}catch (Exception ex){
				JOptionPane.showMessageDialog(null, "������� � ���� ����� !");
				
			}		
		}
		
	}
}
