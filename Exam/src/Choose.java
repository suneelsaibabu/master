import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Choose extends Frame implements ActionListener, WindowListener {

	Choose() {
		addWindowListener(this);
		
		Label l1 = new Label("* What is your name? ");
		l1.setBounds(10, 30, 200, 70);
		add(l1);

		Checkbox checkbox1 = new Checkbox("Suneel");
		checkbox1.setBounds(10, 60, 100, 100);
		add(checkbox1);
		
		
		Checkbox checkbox2 = new Checkbox("Sumanth",true);
		checkbox2.setBounds(10, 70, 100, 100);
		add(checkbox2);
		
		
		Button b = new Button("click me");
		b.setBounds(100, 200, 100, 40);
		add(b);
		setSize(300, 300);
		setLayout(null);
		setVisible(true);
		
		final TextField tf=new TextField();  
	    tf.setBounds(50,50, 150,20); 
	   // b.addActionListener(this);  
	}
	

	
	public static void main(String[] args) {
		 
		Choose c = new Choose();
	
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

       //  tf.setText("write answer");
	}
	

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}


	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
	
	}


	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	

}
