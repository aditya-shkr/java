import java.util.Scanner;
public class name {
    public static void main(String args[]) {
       Scanner in=new Scanner(System.in);
		String str1[]=new String[10];
		
		int x;
		System.out.println("Enter Name:");
		for(x=0;x<3;x++)
		str1[x]=in.next();
		for(x=0;x<str1[2].length();x++)
		System.out.print(str1[2].charAt(x));
		System.out.print(" ");
		System.out.print(str1[0].charAt(0));
		System.out.print(". ");
		System.out.print(str1[1].charAt(0));
		System.out.print(". ");
		System.out.println(" ");

				
			

	
    }
}
