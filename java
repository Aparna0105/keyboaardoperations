package awt;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.*;
import java.awt.event.KeyListener;
public class lavacake  implements KeyListener {
	Label l;
	lavacake(){
	Frame f=new Frame();
	l=new Label();
	l.setBounds(70, 100, 100, 150);
	f.add(l);
	f.addKeyListener(this);
	f.setSize(500,500);
	f.setLayout(null);
	f.setVisible(true);
	}
	public void keyPressed (KeyEvent a) {
		l.setText("Pressing");
	}
	public void keyTyped (KeyEvent a) {
		l.setText("typing");
	}
	public void keyReleased (KeyEvent a) {
		l.setText("releasing");
	}
	public static void main(String[] args) {
		lavacake l=new lavacake();
	}
}
