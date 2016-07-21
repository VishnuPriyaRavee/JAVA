class ArraySubset
{
boolean isSubset(int[] a1, int[] a2) {
    a2 = Arrays.copyOf(a2, a2.length);
    Arrays.sort(a2);
    for(int e : a1) {
        if (Arrays.binarySearch(a2, e) < 0) {
            return false;
        }
    }
    return true;
}
public static void main(String args[])
{
ArraySubset a=new  ArraySubset();
System.out.println(a.isSubset({1,2,3,4,5,6},{1,2,3,9.5}));
}
}

