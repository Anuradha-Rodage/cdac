/*class patt12
{
public static void main(String args[])
{
for(int i=0;i<5;i++)
{
for(int j=0;j<=5;j++)
{
System.out.print("*");
}
System.out.println("*");
}
}
}*/

/*class patt13 {
    public static void main(String[] args) {
        int n = 5;
        int num = 1;
        for(int i= 1; i<=10; i++) {
            for(int j=1; j<=num;j++) {
                System.out.print(num);
                if(j<num) {
                    System.out.print("*");
                }
                
            }
            if(i < n){
                num++;
            }else if(i > n){
                num--;
            }
        }

            System.out.print();
    }
}*/
/*class patt13{
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
*/
/*class patt14
{
         public static void main(String args[])
         { 
                 for(int i=5;i>0;i++)
                 {
                          for(int j=5; j>i; j--)
                          {
                                  System.out.print(" ");
                          }
                          for(int j=1;j<=i;j++)
                          {
                                           System.out.print("*");
                          }
                          System.out.println();
                 }
         }

}*/
 /*class patt17{
       public static void main(String args[]){
                int n=5;
               
                for(int i=n;i>=1;i--){
                   
                    for(int j=1;j<=n;j++){
                        if(j<=n-i){
                            System.out.print(" ");
                        }
                        else{
                            System.out.print("* ");
                        }
                    }
                    System.out.println();
                }
           
       }
}
*/
class patt25{
 public static void main(String args[]){
int row=5;
for(int i=1;i<=5;i++)
{
for(int j=1;j<=i;j++)
{
System.out.println(j);
}
System.out.println(" ");

}
}
}