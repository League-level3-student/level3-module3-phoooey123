package _00_Text_Funkifier;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		
		StringBuilder b = new StringBuilder(s);
		String st = b.reverse().toString();
		return st;
	}

}
