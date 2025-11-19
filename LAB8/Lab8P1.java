import java.awt.*;
import java.awt.event.*;
//import javax.swing.*;
class Lab8P1 extends Frame implements ActionListener{
	Label l;
	Lab8P1(){
		super("MenuBar Demonstration");
		BorderLayout bl = new BorderLayout();
		l = new Label();
		l.setFont(new Font("Arial",Font.BOLD,40));
		l.setAlignment(l.CENTER);
		add(l,bl.CENTER);
		MenuBar mb = new MenuBar();
		setMenuBar(mb); 
		String [] menus = {"File","Edit","Help"};
		String [][] mi = {{"Open","Save","Close"},{"Cut","Copy","Paste"},		{"About","Update","License"}};
		int x=0, y=0;
		for(String s : menus){
			y = 0;
			Menu m = new Menu(s);
			//s = s.toLowerCase();
			for(int i=0; i<3; i++){
			MenuItem mmi = new MenuItem(mi[x][y]);
				mmi.addActionListener(this);
				m.add(mmi);
				y++;
			}
			x++;
			mb.add(m);
		} 
		setSize(400,400);
		setVisible(true);
		setLayout(bl);
		addWindowListener(
			new WindowAdapter(){
				public void windowClosing(WindowEvent we){
					//dispose();
					System.exit(0);
				}
			}
		);
	}
	public void actionPerformed(ActionEvent ae){
		String mstr = ae.getActionCommand();
		if(mstr.equals("Close")){
			System.exit(0);
		}
		else {
			l.setText(mstr);
		}
	
	}
	public static void main(String...args){
		new Lab8P1();
	}

}

