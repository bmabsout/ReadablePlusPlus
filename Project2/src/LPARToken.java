

public class LPARToken extends Token{

	public LPARToken(String lexeme) {
		super(lexeme);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getHTMLToken() {
		return "<span class=\"punctuation\">" + lexeme + "</span>";
	}
}
