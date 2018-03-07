package exercise;

public class UniqueSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(uniqueSum(1,2,3));
		System.out.println(uniqueSum(3,3,3));
		System.out.println(uniqueSum(1,1,2));
		System.out.println(uniqueSum(1,1,1));
		System.out.println(uniqueSum(-1,-10,5));
		System.out.println(uniqueSum(28,100,28));
	}
	public static boolean areAllEqual (int x, int y, int z) {
		if ((x == y) && (y == z)) {
			return true;
		}
		else {
			return false;
		}
	}
	public static int uniqueSum (int x, int y, int z) {
		int otherOutput = 99;
		if (areAllEqual(x, y, z)) {
			return 0;
		}
		/*if ((x==y) && (y==z)) {
			return 0;
		}*/
		else if ((x!=y) && (y!=z) && (x!=z)) {
			return x+y+z;
		}
		else if ((x!=y) && (y!=z) && (x==z)) {
			return y;
		}
		else if ((x!=y) && (x!=z) && (y==z)) {
			return x;
		}
		else if ((x==y) && (y!=z) && (x!=z)) {
			return z;
		}
		else {
			return otherOutput;
		}
	}

}
