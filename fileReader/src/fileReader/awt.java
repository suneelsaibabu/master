package fileReader;
import java.awt.*;
public class awt extends Frame {
	awt(){
	Button b=new Button("click me");
b.setBounds(30,100,80,30);
add(b);
setSize(300,300);
setLayout(null);
setVisible(true);
}
	public static void main(String[] args) {
		awt a=new awt();
	}
}
class frame extends Frame 
{
	public void Myname() {
		int x=2;
		double d=32;
		int add=x+(int)d;
		System.out.println(add);
	}
}
class First2 extends Frame{
	First2(){
		Frame f=new Frame();
		Button b=new Button("click me");
		f.add(f);
		f.setSize(300,300);
		f.setVisible(true);
		f.setLayout(null);
	}
	public static void main(String[] args) {
		First2 f=new First2();
		
	}
}