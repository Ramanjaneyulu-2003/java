class Amstrong
{
public static void main(String []args)
{
int num=1634,sum=0,count=0,temp=num;
while(num>0)
{
int rem=num%10;
count++;
num=num/10;
}
num=temp;
while(num>0)
{
int rem=num%10;
int power=(int)Math.pow(rem,count);
sum=sum+power;
num=num/10;
}
if(sum==temp)
System.out.println("AMSTRONG");
else
System.out.println("NOT A AMSTRONG");
}
}