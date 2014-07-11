grammar line;

tokens { INDENT, DEDENT }

@lexer::members
{

	// A queue where extra tokens are pushed on (see the NEWLINE lexer rule).
	private java.util.Queue<Token> tokens = new java.util.LinkedList<>();

	// The stack that keeps track of the indentation level.
	private java.util.Stack<Integer> indents = new java.util.Stack<>();

	@Override
	public void emit(Token t)
	{
		super.setToken(t);
		tokens.offer(t);
	}

	@Override
	public Token nextToken()
	{

		// Check if the end-of-file is ahead and there are still some DEDENTS expected.
		if (_input.LA(1) == EOF && !this.indents.isEmpty())
		{
			// First emit an extra line break that serves as the end of the statement.
			this.emit(new CommonToken(lineParser.NewLine, "\n"));

			// Now emit as much DEDENT tokens as needed.
			while (!indents.isEmpty())
			{
				this.emit(new CommonToken(lineParser.DEDENT, "DEDENT"));
				indents.pop();
			}
		}

		Token next = super.nextToken();

		return tokens.isEmpty() ? next : tokens.poll();
	}

	static int getIndentationCount(String tabs)
	{
		int count = 0;

		for (char ch : tabs.toCharArray())
			if(ch == '\t')
				count++;

		return count;
	}

}

program: NewLine* body? NewLine* EOF;

body: line (NewLine+ line)*;

line: functionCall|assign;

functionCall: name (' ' closedExpr)*;
functionArgs: name (' ' closedExpr)+;
functionNoArgs: name;

assignScope: INDENT (assignLine NewLine+)+ DEDENT;
assignLine: lineAssign | declarator (' '+ linemix)?;

assign
:	type '|' ' '* assignLine
|	type '|' (' '* assignLine)? NewLine assignScope
|	type ' '* closedItem (' '+ linemix)? (NewLine assignScope)?
;

declarator: name (' ' name)*;

closedItem: '{' ' '* declarator ' '+
	(	closedExpr
	|	'=' ' '+ expr
	) ' '* '}'
;

lineAssign: declarator (' '* '=' ' '* (expr|functionArgs|'('functionNoArgs')'));

linemix: (closedItem|declarator) (' '+ (closedItem|declarator))*;

closedExpr   : Number|name|'('functionCall')';
expr         : Number|name|functionCall;

Number       : Digit (Digit|NonDigit)*;
TABS         : '\t'+;
Spaces       : ' '+;
Pointers     : '*' | '^' | '&';
type         : ID Pointers*;
name         : ID;
ID           : NonDigit (Digit|NonDigit)*;
Digit        : [0-9];
NonDigit     : [a-zA-Z_];
NewLine
:	('\n' | '\r' | '\r\n') TABS?
	{
		int next = _input.LA(1);

		emit(new CommonToken(NewLine, "\n"));
		if (next != '\r' && next != '\n')
		{
			int indent = getIndentationCount(getText());
			int previous = indents.isEmpty() ? 0 : indents.peek();

			if (indent == previous)
			{
				skip();
			}
			else if (indent > previous)
			{
				indents.push(indent);
				emit(new CommonToken(lineParser.INDENT, "INDENT"));
			}
			else
			{
				// Possibly emit more than 1 DEDENT token.
				while(!indents.isEmpty() && indents.peek() > indent)
				{
					emit(new CommonToken(lineParser.DEDENT, "DEDENT"));
					emit(new CommonToken(NewLine, "\n"));
					indents.pop();
				}
			}

		}
	}
;
LeftParen    : '(';
RightParen   : ')';
LeftBrace    : '{';
RightBrace   : '}';
Thing        : '|';