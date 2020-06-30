class prime
{
   public static void main (String[] args)
   {		
       int i =0;
       int n=0;

       for (i = 1; i <= 500; i++)         
       { 		  	  
          int counter=0; 	  
          for(n=i; n>=1; n--)
	  {
             if(i%n==0)
	     {
 		counter = counter + 1;
	     }
	  }
	  if (counter ==2)
	  {
	     //Appended the Prime number to the String
	     primeNumbers = primeNumbers + i + " ";
	  }	
       }	
       System.out.println("Prime numbers from 1 to 100 are :");
       System.out.println(primeNumbers);
   }