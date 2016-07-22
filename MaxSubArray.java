class MaxSubArray
{
public int maxSubArray(int[] a){
	 
       int b=a[0];
       int max=a[0];
       for(int i=1;i<a.length;i++)
       {
           b=Math.max(b+a[i],a[i]);
           max= Math.max(max, b);
       }
       return max;
    }
public static void main(String[] args) {
	MaxSubArray m=new MaxSubArray();
	 int[] a=new int[]{1,2,3,4,5,6,7};
	m.maxSubArray(a);
}}
