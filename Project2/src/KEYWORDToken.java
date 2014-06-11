

public class KEYWORDToken extends Token{

	public KEYWORDToken(String lexeme) {
		super(lexeme);
	}

	@Override
	public String getHTMLToken() {
		return "<span class=\"keyword\">" + lexeme + "</span>";
	}

}
