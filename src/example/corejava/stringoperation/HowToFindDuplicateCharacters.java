package example.corejava.stringoperation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class HowToFindDuplicateCharacters {

	public static void main(String[] args) {

		findDuplicateCharectars("Better Butter Best");
		findDuplicateCharectarsByLoop("Better Butter Best");

	}

	private static void findDuplicateCharectarsByLoop(String string) {
		
		String str = string.replace("\\s", "");

		char[] arr = new char[str.length()];
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			String str1 = "";
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					Arrays.sort(arr);
					if (Arrays.binarySearch(arr, str.charAt(i)) < 0) {
						arr[count] = str.charAt(i);

					}
				}

			}

		}

		System.out.println(Arrays.toString(arr));

	}

	private static void findDuplicateCharectars(String string) {

		char[] str = string.replaceAll("\\s", "").toCharArray();
		System.out.println(str);

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : str) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}

		for (Entry<Character, Integer> m : map.entrySet()) {
			if (m.getValue() > 1) {
				System.out.println(m.getKey() + "---" + m.getValue());
			}
		}
	}

}
