

public class EQUALOPToken extends Token{

	public EQUALOPToken(String lexeme) {
		super(lexeme);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getHTMLToken() {
		return "<span class=\"operator\">" + lexeme + "</span>";
	}

}
