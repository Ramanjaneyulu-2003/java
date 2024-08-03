class Application1
{
public static void main(String args[])
{
String name="apple";
char code='a';
int price=284; 
double quanity=4.4;
double discount=0,gst=0;
double total=price*quanity;
System.out.println(total);
if(total>=0&&total<=500)




{
discount=5.0/100*total;gst=3.0/100*total;
}
else if(total>500&&total<=1000)
{
discount=10.0/100*total;gst=5.0/100*total;
}
else if(total>1000&&total<=1500)
{
discount=15.0/100*total;gst=7.5/100*total;
}
else if(total>1500&&total<=2000)
{
discount=20.0/100*total;gst=9.0/100*total;
}
else
{
discount=30.0/100*total;gst=15.0/100*total;
}
System.out.println(discount);
System.out.println(gst);
System.out.println(total);
}
}



