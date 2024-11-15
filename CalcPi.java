// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int calcNums = Integer.parseInt(args[0]);
		calcNums = (calcNums * 2) - 1; 
		double approxPai = 1;
		boolean isSubtraction = true;
		for(int i = 3; i <= calcNums ; i = i + 2) {
			if (isSubtraction) approxPai -= 1 / (double)i;
			else approxPai += 1 / (double)i;
			isSubtraction = !isSubtraction;	
		}
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + (approxPai * 4));
	}
}
