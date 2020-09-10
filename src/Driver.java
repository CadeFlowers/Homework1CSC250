import java.util.Scanner;
public class Driver 
{
	public static void main(String[] args)
	{
		System.out.println("Enter a book of the bible:");
		Scanner myObj = new Scanner(System.in);
		String Book = myObj.nextLine();
		int count = 0;
		for(int i = Book.length()-1; i >= 0; i--)
		{
			if(Book.charAt(i) == 'a' || Book.charAt(i) == 'A' || Book.charAt(i) == 'e' || Book.charAt(i) == 'E' || Book.charAt(i) == 'i' || Book.charAt(i) == 'I' || Book.charAt(i) == 'o' || Book.charAt(i) == 'O' || Book.charAt(i) == 'u' || Book.charAt(i) == 'U' || Book.charAt(i) == 'y' || Book.charAt(i) == 'Y')
			{
				count++;
			}
				
		}
		System.out.println(count);	
	}
}