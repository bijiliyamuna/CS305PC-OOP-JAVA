import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.*;
class Lab9P3 extends JFrame{
	Lab9P3(){
		super("JTree Demo");
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("Fruits");
		DefaultMutableTreeNode apple = new DefaultMutableTreeNode("Apples");
		apple.add(new DefaultMutableTreeNode("Green Apples"));
		apple.add(new DefaultMutableTreeNode("Red Apples"));
		DefaultMutableTreeNode sd = new DefaultMutableTreeNode("Soft Drinks");
		sd.add(new DefaultMutableTreeNode("Pepsi"));
		sd.add(new DefaultMutableTreeNode("Coke"));
		JTree jt = new JTree(root);
		root.add(apple);
		root.add(sd);
		add(jt);
		setVisible(true);
		setSize(400,400);
	}
	public static void main(String...args){
		new Lab9P3();
	}
}
