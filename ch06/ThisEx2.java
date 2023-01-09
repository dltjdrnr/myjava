package ch06;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class ThisEx2 extends MFrame
implements ActionListener{

	Random r;
	Button btn;
	public ThisEx2() {
		super(500,350,Color.GREEN,true);
		
		btn = new Button("button");
		add(btn,"South");
		btn.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		//System.out.println("보이나요?");
		MDialog md = new MDialog(this,"보이나요?");
	}
	class MDialog extends Dialog implements ActionListener{
		Button mbtn;
		ThisEx2 f;
		public MDialog(ThisEx2 f, String title) {
			super(f, title, true);
			this.f = f;
			Color cc;
			r= new Random();
			setLayout(new FlowLayout());
			setSize(150,100);
			mbtn = new Button("Click!");
			mbtn.addActionListener(this);
			add(mbtn);
			setVisible(true);
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			int c=r.nextInt(256);
			Color cc = new Color(c);
			f.btn.setBackground(cc);
			dispose();
		}
	}
	
	public static void main(String[] args) {

		
		new ThisEx2();
	}

}
