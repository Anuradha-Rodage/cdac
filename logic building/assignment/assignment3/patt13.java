class patt13{
 public static void main(String args[]){
	 for(int i=1;i<=5;i++)
	 {
		 for(int j=1;j<i;j++)
		 {
			 System.out.print(i + "*");
		 }
	System.out.println(i);
	 }
	 for(int i=4;i>=1;i--)
	 {
	 
	    for(int j=1;j<i;j++)
	    {
		 System.out.print(i + "*");
      	 }
	System.out.println(i);
	 }
 }
}