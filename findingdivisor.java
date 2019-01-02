class findingdivisor 
{ 
 public static void main(String args[]) 
    { 

        findingdivisor ob=new findingdivisor();
        ob.print(100);; 
    } 
     void print(int n) 
    { 
    
        for (int i=1; i<=Math.sqrt(n); i++) 
        { 
            if (n%i==0) 
            { 
                
                if (n/i == i) 
                    System.out.println( i); 
       
                else // Otherwise print both 
                    System.out.println( i+" "+ n/i); 
            } 
        } 
    } 
  
   
} 