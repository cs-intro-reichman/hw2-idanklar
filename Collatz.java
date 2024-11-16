// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int seed = Integer.parseInt(args[0]);
	    String input = args[1];
		for(int i = 1; i <= seed; i++) {
			int currNum = i;
			int counter = 1;
			if (input.equals("v")) System.out.print(currNum);
			if(currNum == 1) {
				currNum = (currNum * 3) + 1;
				counter++;
				if (input.equals("v")) System.out.print(" " + currNum);
			}
		
			while (currNum != 1) {
				if (currNum % 2 == 0) {
					currNum /= 2;
					counter++;
				} else {
					currNum = (currNum * 3) + 1;
					counter++;
				}
				if (input.equals("v")) System.out.print(" " + currNum);
			}
			if(input.equals("v")) {
				System.out.print(" " + "(" + counter + ")");
				System.out.println();
			} 
		}
		System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
	}
}
