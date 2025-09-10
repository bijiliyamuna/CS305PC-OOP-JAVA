import java.util.Scanner;
class LAB2P1{
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.nextLine();
		String op = sc.nextLine();
		switch(op){
		
		case"++" : System.out.println(a++);
			   System.out.println(++a);
			   break;
		case"--" : System.out.println(a--);
			   System.out.println(--a);
			   break;			   
		case"+" :  a=+a;
			   System.out.println(a);
			   break;
		case"-" :  a=-a;
			   System.out.println(a);
			   break;
		case"~" : System.out.println(~a);
			   break;
		default : System.out.println("you have entered invalid operator");
			   break;
		
		
		
		
		
		}
		
	
	
	}


}
