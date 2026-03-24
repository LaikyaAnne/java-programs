class Fibonacci
{
public static void main(String arge[])
{
int first=0, second=1;
System.out.println("Fibonacci Series from 1 to 100: ");
while(first<=100)
{
System.out.println(first+"");
int next=first+second;
first=second;
second=next;
}
}
}