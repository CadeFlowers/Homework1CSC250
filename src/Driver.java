public class Driver 
{
	public static void main(String[] args)
	{
		String s = "Acts";
		int count = 0;
		for(int i = s.length()-1; i >= 0; i--)
		{
			if(s.charAt(i) == 'a' || s.charAt(i) == 'A' || s.charAt(i) == 'e' || s.charAt(i) == 'E' || s.charAt(i) == 'i' || s.charAt(i) == 'I' || s.charAt(i) == 'o' || s.charAt(i) == 'O' || s.charAt(i) == 'u' || s.charAt(i) == 'U' || s.charAt(i) == 'y' || s.charAt(i) == 'Y')
			{
				count++;
			}
				
		}
		System.out.println(count);	
	}
}