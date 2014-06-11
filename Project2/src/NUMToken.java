

public class NUMToken extends Token{

	public NUMToken(String lexeme) {
		super(lexeme);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getHTMLToken() {
		return "<span class=\"literal\">" + lexeme + "</span>";
	}

}
