

public class LBRACToken extends Token{

	public LBRACToken(String lexeme) {
		super(lexeme);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getHTMLToken() {
		return "<span class=\"curlybrace\">" + lexeme + "</span>";
	}

}
