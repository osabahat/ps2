package MainPackage;

public class MyInteger {

	private int value;

	public int getValue() {
		return value;
	}

	private void setValue(int value) {
		this.value = value;
	}

	public MyInteger(int value) {
		setValue(value);
	}

	public boolean isEven() {
		if (this.getValue() % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isEven(int value) {
		if (value % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isEven(MyInteger myInt) {
		if (myInt.getValue() % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isOdd() {
		if (this.getValue() % 2 == 0) {
			return false;
		} else {
			return true;
		}
	}

	public static boolean isOdd(int value) {
		if (value % 2 == 0) {
			return false;
		} else {
			return true;
		}
	}

	public static boolean isOdd(MyInteger myInt) {
		if (myInt.getValue() % 2 == 0) {
			return false;
		} else {
			return true;
		}
	}

	public boolean isPrime() {
		if (this.getValue() % 2 == 0) {
			return false;
		}
		/*
		 * This line starts at n=3, the first prime number, checks to see if the
		 * square of n is less than or equal to the value, and then finally does
		 * the modular function to check the remainder. It follows the algorithm
		 * traditionally used to determine if a number is prime. Then it
		 * increments n by two to go to the next odd number.
		 */
		else {
			for (int n = 3; n * n <= this.getValue(); n += 2) {
				if (this.getValue() % n == 0) {
					return false;
				}
			}
		}
		return true;
	}

	public static boolean isPrime(int value) {
		if (value % 2 == 0) {
			return false;
		} else {
			for (int n = 3; n * n <= value; n += 2) {
				if (value % n == 0) {
					return false;
				}
			}
		}
		return true;
	}

	public static boolean isPrime(MyInteger myInt) {
		if (myInt.getValue() % 2 == 0) {
			return false;
		} else {
			for (int n = 3; n * n <= myInt.getValue(); n += 2) {
				if (myInt.getValue() % n == 0) {
					return false;
				}
			}
		}
		return true;
	}

	public boolean equals(int value) {
		if (value == this.getValue()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean equal(MyInteger myInt) {
		if (myInt.getValue() == this.getValue()) {
			return true;
		} else {
			return false;
		}
	}

	public static int parseInt(char[] myInts) {
		int result = 0;
		for (int n = 0; n < myInts.length; n++) {
			result += myInts[n];
		}
		return result;
	}

	public static int parseInt(String str) {
		int myString = Integer.parseInt(str);
		return myString;
	}

}
