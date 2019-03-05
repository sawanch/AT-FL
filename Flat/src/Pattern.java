import java.util.Scanner;
public class Pattern {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		String str;
		System.out.println("Enter the the string pattern consisting of A's and B's");
		str=sc.next();
		String copy=str;
		str=str.toLowerCase();
		int len=str.length();
		if((str.endsWith("aba"))&& len<5)
		{
			System.out.println(copy + " is an Invalid String");
		}
		else if((str.endsWith("aba"))&& len>=5)
		{
			for(int i=0;i<len-3;i++) {
				char ch=str.charAt(i);
				if(ch =='a'||ch =='A'||ch =='B'||ch =='b') {
					continue;
					
				}
				else 
				{
					System.out.println(copy + " is an Invalid String");
					System.exit(0);
				}
			}
			System.out.println(copy + " is a Valid String");
			System.exit(0);
		}
		else
		{
			System.out.println(copy + " is an Invalid String");
			System.exit(0);
		}
	}

}
