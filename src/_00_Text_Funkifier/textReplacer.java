package _00_Text_Funkifier;

public class textReplacer extends SpecialString{

	public textReplacer(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String t = s.replace('e', 'o');
		return t;
	}

}
