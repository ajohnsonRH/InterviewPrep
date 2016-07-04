
public class Problem10 {
	/*
	 * Assumptions: given the len of the 'true' string length there is enough
	 * space in the original to hold the new characters %20 is to be represented
	 * as three chars %,2,0
	 */
	public char[] replaceSpaces(char[] original, int len) {
		char[] newString = new char[original.length];
		for (int i = 0; i < len; i++) {
			if (original[i] == ' ') {
				newString[i] = '&';
				newString[i + 1] = '2';
				newString[i + 2] = '0';
			} else {
				newString[i] = original[i];
			}
		}
		return newString;
	}

	// CHange # 1 you are not given the true length
	public char[] replaceSpaces2(char[] original) {
		int len = 0;
		for (int j = original.length - 1; j >= 0; j--) {
			if (original[j] != '\u0000') {
				len = j;
				break;
			}
		}
		char[] newString = new char[original.length + len];
		for (int i = 0; i < len; i++) {
			if (original[i] == ' ') {
				newString[i] = '&';
				newString[i + 1] = '2';
				newString[i + 2] = '0';
			} else {
				newString[i] = original[i];
			}
		}
		return newString;
	}

	// Change # 2 you are not given an array big enough to hold the new
	// characters
	public char[] replaceSpaces3(char[] original) {
		int length = 0;
		for (int j = 0; j < original.length; j++) {
			if (original[j] == ' ') {
				length += 3;
			} else {
				length++;
			}
		}
		char[] newString = new char[length];
		for (int i = 0; i < original.length; i++) {
			if (original[i] == ' ') {
				newString[i] = '&';
				newString[i + 1] = '2';
				newString[i + 2] = '0';
			} else {
				newString[i] = original[i];
			}
		}
		return newString;
	}

}
