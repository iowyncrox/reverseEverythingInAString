public class ReverseEverythingInAString {

	public static String reverse(String str) {

		if (str == null || str.length() <= 1)
			return str;

		char[] newArrayChar = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (int i = newArrayChar.length - 1; i >= 0; --i) {
			sb.append(newArrayChar[i]);
		}

		return sb.toString();
	}

	public static String reverseUsingRecursion(String str) {
		if ((str == null) || (str.length() <= 1)) {
			return str;
		}
		StringBuilder sb = new StringBuilder();
		sb.append(reverse(str.substring(1)));
		sb.append(str.charAt(0));
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(ReverseEverythingInAString.reverse("the sky"));
		System.out.println(ReverseEverythingInAString
				.reverseUsingRecursion("the sky is blue"));
	}
}
