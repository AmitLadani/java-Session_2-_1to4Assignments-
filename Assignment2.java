
public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  {		
		       int x =0;
		       int y =0;
		       //Empty String
		       String  primeNumbers = "1 ";

		       for (x = 1; x <= 100; x++)         
		       { 		  	  
		          int j=0; 	  
		          	for(y =x; y>=1; y--)
		          		{
		          		if(x%y==0)
		          				{j = j + 1;	}
		      			}
		          	if (j ==2)
		          		{
		          			//Appended the Prime number to the String
		          			primeNumbers = primeNumbers + x + " ";
		          		}	
		       }	
		       
		       				System.out.println(primeNumbers);
		   }
	}
}