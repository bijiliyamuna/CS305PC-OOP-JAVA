import java.util.Scanner;
class Internal{
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		try{
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a/b);
		} catch(ArithmeticException ae){
			System.out.println(ae.getClass().getSimpleName()+ ":"+ae.getMessage());
		} finally{
			System.out.println("This block is always executed");
		}
	
	
	}


}
