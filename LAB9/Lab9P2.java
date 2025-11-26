import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Lab9P2 extends JFrame{
	Label l;
	Lab9P2(){
		super("JTable Demo");
		String[] heading = {"Name","Course","Roll no"};
		String[][] data = {
					{"Dell","CSE","12345"},
					{"Cell","CSE","12346"},
					{"Yell","CSE","12347"},
				};
		JTable jt = new JTable(data,heading);
		JScrollPane sp = new JScrollPane();
		sp.setViewportView(jt);
		add(sp);
		setVisible(true);
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		public static void main(String...args){
		new Lab9P2();
		}
}

