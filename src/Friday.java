
public class Friday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String device = "Bluetooth headset";

		char[] characters = device.toCharArray();
		char firstChar = characters[0];
		char lastChar = characters[characters.length - 1];
		System.out.printf("first character of string \"%s\" is '%c' %n", device, firstChar);
		System.out.printf("last character of string \"%s\" is '%c' %n",

				device, lastChar);

	}

}
