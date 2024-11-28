package bootcamp;

public class Secondlast {

	public static void main(String[] args) {
	
		
           String[] strArray = {"java","python","c++","javaScript","ruby","php","swift"};
        
        if (strArray.length >= 2) 
        {
            String secondlaststr = strArray[strArray.length - 2];
            
            System.out.println("second last string " + secondlaststr);
        }
       

	}

}
