package bootcamp;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="listen";
		String str2="silent";
		String anagram="";
		

		char str1arr[]=str1.toCharArray();
		char str2arr[]=str2.toCharArray();

		for(int i=0;i<=str1arr.length-1;i++)
		{
			for(int j=0;j<=str2arr.length-1;j++)
			{
				if(str1arr[i] == str2arr[j])
				{
					anagram=anagram + str2arr[j];
				}
			}
		}
		
		System.out.println(anagram);
		
		if(str1.equals(anagram))
		{
			System.out.println("String is anagram");
		}
	}

}
