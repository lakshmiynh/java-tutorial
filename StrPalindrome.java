package bootcamp;

public class StrPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="pop";
		String reverse="";
		char ch[]=str.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--)
		{
			reverse = reverse + ch[i];
		}
		
		System.out.println(reverse);
		
		if(str.equals(reverse))
		{
			System.out.println("string is palindrome");
		}
		else
		{
			System.out.println("string is not palindrome");
		}
		

	}

}
