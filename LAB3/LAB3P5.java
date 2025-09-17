import java.util.Scanner;
class LAB3P5{
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String b= sc.next();
		LAB3P5 l = new LAB3P5();
		LAB3P5 l1 = new LAB3P5(a);
		LAB3P5 l2 = new LAB3P5(b);
		LAB3P5 l3 = new LAB3P5(a,b);
		
		
		
		
	
	}
	LAB3P5(){
		System.out.println("constructor overloading");
	}
	LAB3P5(int x){
		System.out.println("constructor with int params: "+x);
	}
	LAB3P5(String s){
		System.out.println("constructor with String params"+s);
	}
	LAB3P5(int x,String s){
		System.out.println("constructor with two params"+ x +" "+s);
	}


}
