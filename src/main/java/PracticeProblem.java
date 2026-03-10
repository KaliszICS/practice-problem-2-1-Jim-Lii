public class PracticeProblem {

	public static void main(String args[]) {

	}

	//Create your functions here
	public static int sum(int num1, int num2){
		int sum = num1 + num2;
		return sum;
	}

	public static int difference(int num1, int num2){
		int difference = num1 - num2;
		return difference;
	}

	public static double product(double fracNum1, double fracNum2){
		double product = fracNum1 * fracNum2;
		return product;
	}

	public static String removeFirst(String str){
		String strNoFirst = str.substring(1);
		return strNoFirst;
	}
}
