package bootcamp;

public class AsciA2Z {

	public static void main(String[] args) {
		
		
        char chstart = 'A'; 
        
        
        for (char c = chstart; c <= 'Z'; c++) 
        {
            int asciivalue = (int) c;
            char chnext = (char) (c + 1);
            
            System.out.println("Character = " + c + ", ascii value = " + asciivalue);
        }

	}

}
