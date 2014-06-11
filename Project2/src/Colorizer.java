import java.util.ArrayList;
//Mostafa El-Katerji 201203987
public class Colorizer {
	
	private final static String indexStr = "<span class=\"indent\"></span>";
	private ArrayList<TokenPair> tokens;
	private String outputHTML;
	private int indent;
	
	public Colorizer(String program){
		LexicalAnalyzer lex = new LexicalAnalyzer(program);
		tokens = lex.getTokens();
		
		indent = 0;
		
		outputHTML = "<!DOCTYPE html>\n<!--output.html this is the output file your program must produce-->\n\t<title>CMPS258 Syntax Highlighter</title>\n\t<link rel=\"stylesheet\" type=\"text/css\" href=\"cmps258.css\" />\n</head>\n<body>\n";
		
		//Generate the content in the Body element
		generateLines();
		
		outputHTML += "</body>\n</html>";
		System.out.println(outputHTML);
	}
	public String getHTML(){
		return outputHTML;
	}
	public void generateLines(){
		//Used to know if we should indent or not
		boolean newLine = true;
		for(int i = 0; i<tokens.size()-1; i++){
			//Get the current lexeme and token of what we're currently workign with
			int tokenClass = tokens.get(i).token;
			String lexeme = tokens.get(i).lexeme;
			Token currentToken = getToken(tokenClass, lexeme);
			
			//If its a right bracket, we should remove indentation before putting it
			if(tokenClass == LexicalAnalyzer.RIGHT_BRAC)
				indent--;
			
			//We only indent when we are starting at a new line
			if(newLine){
				for(int j = 0; j<indent; j++)
					outputHTML += indexStr;
				newLine = false;
			}
			
			//if its a left bracket, we should indent then add the indentation for the following line
			if(tokenClass == LexicalAnalyzer.LEFT_BRAC)
				indent++; 

			//Add token's span element to the output
			outputHTML+=currentToken.getHTMLToken()+" \n\t";
			
			//these tokens are followed by a new line
			if(lexeme.equals("{") || lexeme.equals("}") || lexeme.equals(";") || lexeme.equals(")")){
				outputHTML += "<br /> \n\t";
				newLine = true;
			}
		}
	}
	
	public Token getToken(int tokenClass,String lexeme){
		switch(tokenClass){
		case LexicalAnalyzer.ASSIGN_OP:
			return new EQUALOPToken(lexeme);
		case LexicalAnalyzer.IDENT:
			return new IDENTIFIERToken(lexeme);
		case LexicalAnalyzer.KEYWORD:
			return new KEYWORDToken(lexeme);
		case LexicalAnalyzer.LEFT_BRAC:
			return new LBRACToken(lexeme);
		case LexicalAnalyzer.LEFT_PAREN:
			return new LPARToken(lexeme);
		case LexicalAnalyzer.INT_LIT:
			return new NUMToken(lexeme);
		case LexicalAnalyzer.RIGHT_BRAC:
			return new RBRACToken(lexeme);
		case LexicalAnalyzer.RIGHT_PAREN:
			return new RPARToken(lexeme);
		case LexicalAnalyzer.SEMI:
			return new SEMIToken(lexeme);
		
		}
		return null;
	}
}
