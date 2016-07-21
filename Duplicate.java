class Duplicate
{
pubic static voi main(String args[]){
System.out.println("Enter the number of elements in the array:");
	int b=s.nextInt();
	int[] a=new int[b];
	System.out.println("Enter the elements in the array:");
	for(int i=0;i<a.length;i++)
	{
		a[i]=s.nextInt();
	}
Arrays.sort(a);

for(int i = 1; i < a.length; i++) {
    if(a[i] == a[i - 1]) {
        System.out.println("Duplicate: " +a[i]);
    }
}
}
}
