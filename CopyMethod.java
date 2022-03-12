import java.util.Arrays;

public class CopyMethod

{
	public static void main(String args[])
	{
		
		int[] org = new int[] {1, 2 ,3 ,5,6};    // initializing an array original
                  

		System.out.println("Original Array");
		for (int i = 0; i < org.length; i++)
			System.out.print(org[i] + " ");

		int[] copy = Arrays.copyOf(org, 5);  // copying array org to copy
            // Changing some elements of copy
        copy[3] = 11;
        copy[4] = 55;

		System.out.println("\nNew array copy after modifications:");
		for (int i = 0; i < copy.length; i++)
			System.out.print(copy[i] + " ");
	}
}
