

public abstract class Token {
	public String lexeme;
	public Token(String lexeme){
		this.lexeme = lexeme;
	}
	public  abstract String getHTMLToken();
}
