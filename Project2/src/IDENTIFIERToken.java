

public class IDENTIFIERToken extends Token{

	public IDENTIFIERToken(String lexeme) {
		super(lexeme);
	}
	
	@Override
	public String getHTMLToken() {
		return "<span class=\"identifier\">" + lexeme + "</span>";
	}

}
