package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.

		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s) -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");

		// 2. Call the printCustonMessage method using a lambda so that the String
		// prints backwards.
		printCustomMessage((s) -> {
			String sBack = "";
			for (int i = s.length() - 1; i >= 0; i--) {
				sBack += s.charAt(i);
			}
			System.out.println(sBack);
		}, "sdrawkcab");
		// 3. Call the printCustonMessage method using a lambda so that the String
		// prints with a mix between upper an lower case characters.
		printCustomMessage((s) -> {
			String mix = "";
			for (int i = 0; i < s.length() - 1; i++) {
				if (s.charAt(i) % 2 == 0) {
					mix += Character.toUpperCase(s.charAt(i));
				} else {
					mix += Character.toLowerCase(s.charAt(i));
				}
			}
			System.out.println(mix);
		}, "characters");

		// 4. Call the printCustonMessage method using a lambda so that the String
		// prints with a period in between each character.
		printCustomMessage((s) -> {
			String per = "";
			for (int i = 0; i < s.length(); i++) {
				per += s.charAt(i);
				if (i != s.length()-1) {
					per += '.';
				}
			}
			System.out.println(per);
		}, "period");

		// 5. Call the printCustonMessage method using a lambda so that the String
		// prints without any vowels.
		printCustomMessage((s) -> {
			String cons = "";
			for (int i = 0; i < s.length() - 1; i++) {
				if (s.charAt(i) != 'a' && s.charAt(i) != 'e' && s.charAt(i) != 'i' && s.charAt(i) != 'o'
						&& s.charAt(i) != 'u' && s.charAt(i) != 'y') {
					cons += s.charAt(i);
				}
			}
			System.out.println(cons);
		}, "vowels");

	}

	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
