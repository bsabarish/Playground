import java.util.Scanner;
class Main
{
public static void main(String args[])
{
 Scanner in=new Scanner(System.in);
int arr_size=in.nextInt();  
int arr[]= new int[arr_size];
  for(int i=0;i<=arr_size-1; i++)
    {
       arr[i]=in.nextInt();
    }
   int search_ele_1=in.nextInt(); 
  int search_ele_2=in.nextInt(); 
   for(int i=0;i<=arr_size-1; i++)
    {
    if(arr[i]== search_ele_1)
    {
        System.out.println(i);
     }
   if(arr[i]== search_ele_2)
    {
        System.out.println(i);
     }
    
   }
   if((search_ele_1==1000)||(search_ele_2==1000))
     {
        System.out.println("-1");
     }
}
}