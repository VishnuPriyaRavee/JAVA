class ChildrenCandy{
public int candy(int[] ratings) {
	if (ratings == null || ratings.length == 0) {
		return 0;
	}
 
	int[] candies = new int[ratings.length];
	candies[0] = 1;
 	for (int i = 1; i < ratings.length; i++) {
		if (ratings[i] > ratings[i - 1]) {
			candies[i] = candies[i - 1] + 1;
		} else { 
						candies[i] = 1;
		}
	}
 
	int output= candies[ratings.length - 1];
 
	for (int i = ratings.length - 2; i >= 0; i--) {
		int cur = 1;
		if (ratings[i] > ratings[i + 1]) {
			cur = candies[i + 1] + 1;
		}
 
		output += Math.max(cur, candies[i]);
		candies[i] = cur;
	}
 
	return output;
}public static void main(String[] args) {
	ChildrenCandy c=new ChildrenCandy();
	int[] a=new int[30];
	c.candy(a);
}
 
}
