

public class RPARToken extends Token{

	public RPARToken(String lexeme) {
		super(lexeme);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getHTMLToken() {
		return "<span class=\"punctuation\">" + lexeme + "</span>";
	}

}
