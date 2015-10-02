
public class bitwiseOP {

	public static void main(String[] args) {
		short high = 0x03;
		short low = 0x40;
		short twoByteValue = (short) ((high | low)& 0xFF);
		System.out.println("Integer Value="+twoByteValue);
		System.out.println("0x"+Integer.toHexString(twoByteValue));
	}
}
