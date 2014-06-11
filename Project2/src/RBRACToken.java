

public class RBRACToken extends Token{

	public RBRACToken(String lexeme) {
		super(lexeme);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getHTMLToken() {
		return "<span class=\"curlybrace\">" + lexeme + "</span>";
	}

}
