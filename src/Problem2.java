/*You are given an array representing integer. Write a function 
 * which increments this integer. Example: 
 * input [1,2,3] -> output [1,2,4] which represents 123 + 1 = 124
 */
public class Problem2 {
	public int[] findAbsPath(int[] num){
		//Increment the first digit
		num[num.length -1] = num[num.length - 1] + 1;
		for(int i = num.length-1;i>=0;i--){
			if (num[i] > 9){
				num[i] = 0;
				//increment the next digit
				if(i - 1 >= 0){
					num[i - 1] = num[i -1] + 1;
				} else {
					//grow the array
					int[] newNum = new int[num.length + 1];
					newNum[0] = 1;
					for (int j = 1; j < num.length; j ++){
						newNum[j] = num[j - 1];
					}
					return newNum;
				}
			}
		}
		return num;
	}
}
