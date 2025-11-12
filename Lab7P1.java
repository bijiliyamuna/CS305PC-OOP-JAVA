import java.awt.event.*;
import java.awt.*;
class Lab7P1{
	public static void main(String...args){
		final int []a = {1};
		Button b = new Button("Click");
		b.setSize(20,40);
		Frame f = new Frame();
		f.setLayout(new FlowLayout() );
		TextField tf = new TextField(20);
		Label l = new Label();
		l.setPreferredSize(new Dimension(100,200));
		f.setSize(400,400);
		f.add(tf);
		f.add(b);
		f.add(l);
		f.setVisible(true);
		b.addActionListener(
			new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent ae){
					System.out.println("Hello");
					l.setText(tf.getText()+"-"+a[0]);
					a[0]++;
				}
		}
		);
		f.addWindowListener(
			new WindowAdapter(){
				public void windowClosing(WindowEvent we){
					f.dispose();
				}
			}
		);
	}
}
