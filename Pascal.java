import java.util.Scanner;
import java.io.*;
class Pascal {


public static void printPascal(int n)
{
	for(int line = 1; line <= n; line++)
	{
		
	int C=1;                    
	for(int i = 1; i <= line; i++)
	{
		
		System.out.print(C+" ");  // The first value in a line is always 1
		C = C * (line - i) / i;
	}
	System.out.println();
	}
}

// Driver code
public static void main (String[] args) {
Scanner ref = new Scanner(System.in);
       System.out.println("Enter a number");
	int n = ref.nextInt();
	printPascal(n);
}
}
