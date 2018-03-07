
public class Goldilocks {

	int weight = 100;
	int temp = 80;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] goldilocks = {{100, 80},{120,89}};
		calculate(goldilocks);
		
	}	
	public static void calculate(int[][] goldilocks) {
		int i = 0;
		int j = 0;
		int counter = 1;
		for (int[] chairWeight : goldilocks) {
			for(int temp : chairWeight) {
				
			if(chairWeight[i] >= 100 && temp[j] <= 80) {
				System.out.println("#"+(counter));
			}
			}
				counter++;
			}
		}
	}
	


