class condi{
   public static void main(String args[])
{
int marks=75;

if(marks>=90)
{
System.out.println("A");
}
else if(marks>80 && marks<89)
{
System.out.println("B");
}
else if(marks>70 && marks<79)
{
System.out.println("C");
}
else if(marks>60 && marks<69)
{
System.out.println("D");
}
else if(marks<60)
{
System.out.println("fail");
}
else
{
System.out.println("enter valid marks");
}
}
}