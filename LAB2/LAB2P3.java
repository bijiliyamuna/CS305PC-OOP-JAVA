import java.util.Scanner;
class LAB2P3{
	public static void main(String...args){
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	sc.nextLine();
	String op = sc.nextLine();
	var str = switch(op){
			case "++" -> "Hello";
			case "++","--","+","-" -> "Not good";
			default -> "sorry";
			
	};
	System.out.println("Result is:"+str);





}
}
