public class ReverseString {
	public static void main(String[] args) {
		String str = "My name is tom";
		char[] arr = str.toCharArray();
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}

	}

}
