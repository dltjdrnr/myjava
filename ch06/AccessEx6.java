package ch06;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ch06.ThisEx3.MDialog;

public class AccessEx6 extends MFrame implements ActionListener{

	public void paramstring(String str) {
		System.out.println(str);
	}
	Button btn;
	String btnstr;
	public AccessEx6() {
		btn = new Button("my_Button");
		add(btn, "South");
		btn.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		//System.out.println("보이나요?");
		btnstr = btn.getLabel();
		paramstring(btnstr);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new AccessEx6();
	}

}
