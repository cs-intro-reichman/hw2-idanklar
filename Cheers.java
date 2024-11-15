// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {	        
            String cheer = args[0];
            String upperCase = cheer.toUpperCase();
            String anVowels = "AEFHILMNORSX";
            int runs = Integer.parseInt(args[1]);
            for(int i = 0; i < upperCase.length(); i++) {
                if (anVowels.indexOf(upperCase.charAt(i)) != -1) {
                    System.out.println("Give me an " + upperCase.charAt(i) + ": " + upperCase.charAt(i) + "!");
                } else {
                    System.out.println("Give me a " + upperCase.charAt(i) + ": " + upperCase.charAt(i) + "!");
                }
            }
            System.out.println("What does that spell?");
            for (int i = 0; i < runs; i++) {
                System.out.println(upperCase + "!!!");
            }
        }
}
