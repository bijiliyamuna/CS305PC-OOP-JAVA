import java.util.Scanner;
class LAB3P4{
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String str = sc.next();
		LAB3P4 mol = new LAB3P4(); 
		mol.display();
		mol.display(a,str);
		mol.display(str);
	
	}
	public void display(){
		System.out.println("method overloading 1");
	}
	public void display(int x,String y){
		System.out.println("method overloading 2 "+x +" "+y);
	}
	public void display(String y){
		System.out.println("method overloading 3 "+y);
	}


}
