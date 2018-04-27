import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cont = "Y";
		// Repeat if user doen't wish to continue
		while (cont.equalsIgnoreCase("Y")) {

			// Prompt user for input
			System.out.println("Enter a word:");
			Scanner scan = new Scanner(System.in);
			String input = scan.nextLine();

			// convert to lower case
			input = input.toLowerCase();

			// if word starts with a vowel

			char firstletter = input.charAt(0);

			if (firstletter == 'a' || firstletter == 'e' || firstletter == 'i' || firstletter == 'o'
					|| firstletter == 'u') {

				String end = "way";
				System.out.println(input + end);

			} else {
				// translate consanant
				// find first vowel
				String vowel = "aeiou";
				for (int i = 0; i < vowel.length(); ++i) {

					char letter = vowel.charAt(i);

					int pos = input.indexOf(letter);
					// if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' ||
					// firstletter == 'u') {
					// }
					if (pos >= 0) {

						String second = input.substring(pos);
						String first = input.substring(0, pos);

						String pWord = second + first + "ay";

						System.out.println(first);
						System.out.println(second);
						System.out.println(pWord);

					}

				}

			}

		}

	}
}
