import java.util.Scanner;
class LAB3P2{
	public static void main(String...args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		for(int i=2;i<n;i++){
		int count=0;
		if(i==2) count++;
			
			for(int j=2;j<i;j++){
				if(i%j==0){
					count=0;
					break;
				}
				else count++;
			}
			if(count>0)
				System.out.println(i);
		}		
	}
}
