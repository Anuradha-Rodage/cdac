class discount{
public static void main(String args[])
{
int pamount=1500;
int discount;
if(pamount>=1000)
{
 discount=pamount*20/100;
System.out.println("after discount value is"+pamount +discount);

}
else if(pamount>500 && pamount<999)
{
discount=pamount*10/100;
System.out.println("after 10 percent discount value is"+discount);
}
else if(pamount<500)
{
discount=pamount*5/100;
System.out.println("after 5 percent discount value is"+discount);
}
else
{
System.out.println("invalid");
}
}
}