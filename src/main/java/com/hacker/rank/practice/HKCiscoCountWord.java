package com.hacker.rank.practice;

public class HKCiscoCountWord {

	public static void main(String[] args) {
		String sentence = "jds dsaf lkdf kdsa fkldsf, adsbf ldka ads? asd bfdal ds bf[l. akf dhj ds 878  dwa WE DE 7475 dsfh ds  RAMU 748 dj.";
		String[] words = sentence.split(" ");
		int count = 0;
		for (String word : words) {
			if (isLegitimateWord(word)) {
				count++;
			}
		}
		System.out.print(count);

	}

	private static boolean isLegitimateWord(final String word) {

		if (!word.isEmpty()) {
			for (char c : word.toCharArray()) {

				if (!((c >= 65 && c <= 90) || (c >= 97 && c <= 122) || (c == '?') || (c == '.') || (c == ':')
						|| (c == '!') || (c == '-') || (c == ','))) {
					return false;
				}
			}

			return true;

		} else {
			return false;
		}
	}

}
