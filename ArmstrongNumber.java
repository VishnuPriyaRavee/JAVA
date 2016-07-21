class ArmstrongNumber{  
  public static void main(String[] args)  {  
    int c=0,a,b;  
    int n=153;
    b=n;  
    while(n>0)  
    {  
    a=n%10;  
    n=n/10;  
    c=c+(a*a*a);  
    }  
    if(b==c)  
    System.out.println("armstrong number");   
    else  
        System.out.println("Not an armstrong number");   
   }  
}  
