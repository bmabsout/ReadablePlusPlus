import java.util.ArrayList;
import java.util.Scanner;


public class LexicalAnalyzer {

	//Character classes
	public static final int LETTER = 0;
	public static final int DIGIT = 1;
	public static final int UNKNOWN = 99;
	
	
	//Token Codes
	public static final int INT_LIT = 10;
	public static final int IDENT = 11;
	public static final int ASSIGN_OP = 20;
	public static final int ADD_OP = 21;
	public static final int SUB_OP = 22;
	public static final int MULT_OP = 23;
	public static final int DIV_OP = 24;
	public static final int LEFT_PAREN = 25;
	public static final int RIGHT_PAREN = 26;
	
	//Newly Added
	public static final int KEYWORD = 1332;
	public static final int LEFT_BRAC = 1333;
	public static final int RIGHT_BRAC = 1334;
	public static final int SEMI = 1335;
	
	public static final int EOF = -1;
	
	
	
	//DEFINE KEYWORDS
	public static final String[] keywords = {"int", "boolean", "TRUE", "return", "true"};
	/****************************************/
	
	
	private ArrayList<TokenPair> tokens;
	
	int charClass;
	String lexeme = "";
	char nextChar;
	
	int token;
	int nextToken;
	
	String buffer;
	int bufferIndex;

	public LexicalAnalyzer(String program){
		this.buffer = program;
		this.bufferIndex = 0;
		
		tokens = new ArrayList<TokenPair>();
		processTokens();
	}
	
	public void processTokens(){
		getChar();
		do{
			lex();
		}while(nextToken != EOF);
	}
	
	public ArrayList<TokenPair> getTokens(){
		return tokens;
	}
	public static void main(String[] args){
		String program = "(sum + 47) / total";
		LexicalAnalyzer lex = new LexicalAnalyzer(program);	
	}
	
	/*****************************************************/
	/* lookup - a function to lookup operators and parentheses
	  and return the token */
	
	public int lookup(char ch){
		switch(ch){
		case '(':
			addChar();
			nextToken = LEFT_PAREN;
			break;
		case ')':
			addChar();
			nextToken = RIGHT_PAREN;
			break;
		case '+':
			addChar();
			nextToken = ADD_OP;
			break;
		case '-':
			addChar();
			nextToken = SUB_OP;
			break;
		case '*':
			addChar();
			nextToken = MULT_OP;
			break;
		case '/':
			addChar();
			nextToken = DIV_OP;
			break;
		case '{':
			addChar();
			nextToken = LEFT_BRAC;
			break;
		case '}':
			addChar();
			nextToken = RIGHT_BRAC;
			break;
		case ';':
			addChar();
			nextToken = SEMI;
			break;
		case '=':
			addChar();
			nextToken = ASSIGN_OP;
			break;
		default:
			addChar();
			nextToken = EOF;
			break;
		}
		return nextToken;
	}
		
	/*****************************************************/
	/* addChar - a function to add nextChar to lexeme */
	
	public void addChar(){
		if(lexeme.length() <= 98){
			lexeme += nextChar;
			
		}else{
			System.out.println("Error - lexeme is too long\n");
		}
	}
	
	/*****************************************************/
	/* getChar - a function to get the next character of
	  input and determine its character class */
	
	public void getChar(){
		if(bufferIndex >= buffer.length()){
			charClass = EOF;
		}else{
			nextChar = buffer.charAt(bufferIndex);
			bufferIndex++;
			
			if((nextChar >= 'A' && nextChar <='Z') || (nextChar >='a' && nextChar <='z'))
				charClass = LETTER;
			else if(nextChar >= '0' && nextChar <='9')
				charClass = DIGIT;
			else
				charClass = UNKNOWN;
		}
	}
	
	/*****************************************************/
	/* getNonBlank - a function to call getChar until it
	  returns a non-whitespace character */
	
	public void getNonBlank(){
		while(Character.isSpace(nextChar))
			getChar();
	}
	
	/*****************************************************/
	/* lex - a simple lexical analyzer for arithmetic expressions */
	
	public int lex(){
		lexeme = "";
		getNonBlank();
		switch(charClass){
		/* Parse identifiers */
		case LETTER:
			addChar();
			getChar();
			while(charClass == LETTER || charClass == DIGIT){
				addChar();
				getChar();
			}
			nextToken = IDENT;
			break;
		/* Parse integer litarals */
		case DIGIT:
			addChar();
			getChar();
			while(charClass == DIGIT){
				addChar();
				getChar();
			}
			nextToken = INT_LIT;
			break;
		/* Parenthese and operators */
		case UNKNOWN:
			lookup(nextChar);
			getChar();
			break;
		/* EOF */
		case EOF:
			nextToken = EOF;
			lexeme = "EOF";
			break;
		} /*End of switch */
		System.out.println("The next token is: " + nextToken +", Next lexeme is " + lexeme);
		if(nextToken == IDENT){
			boolean contains = false;
			for(int i = 0; i<keywords.length; i++){
				if(keywords[i].equals(lexeme)){
					contains = true;
					break;
				}	
			}
			if(contains)
				tokens.add(new TokenPair(KEYWORD, lexeme));
			else
				tokens.add(new TokenPair(IDENT, lexeme));
		}else{
			tokens.add(new TokenPair(nextToken, lexeme));
		}
		return nextToken;
	}
}
