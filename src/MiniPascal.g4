grammar MiniPascal;

prog : PROGRAM IDENTIFIER SEMICOLON code_block #Program
;
code_block : var_declaration* function_declaration* compound_statement* PROGRAM_END #Code_Block
;
var_declaration : VAR (variable_declaration SEMICOLON)* #VarDeclaration
;
variable_declaration : IDENTIFIER COLON type (array_specifier)?
;
array_specifier : ARRAY LBRACKET index_range RBRACKET OF type#ArraySpecifier
;
index_range : NUMBER DOTDOT NUMBER #IndexRange
;
type : INTEGER    #Integer
        | REAL    #Real
        | BOOLEAN #Boolean
        | CHAR    #Char
        | STRING  #String
        | array_specifier#Array
        ;
compound_statement : BEGIN statement_list END* #CompountStatement
;
statement_list : statement (SEMICOLON statement?)* #StatementList
;
statement : compound_statement
            | assignment_statement
            | if_statement
            | while_statement
            | for_statement
            | repeat_statement
            | write_statement
            | read_statement
            | function_call
            ;
assignment_statement : variable ASSIGN (expression|function_call) #AssignmentStatement
;
if_statement : IF expression THEN statement (ELSE statement)? #IfStatement
;
while_statement : WHILE expression DO statement #WhileStatement
;
for_statement : FOR IDENTIFIER ASSIGN expression TO expression DO statement #ForStatement
;
repeat_statement : REPEAT statement_list UNTIL expression #RepeatStatement
;
write_statement : WRITE LPAREN expression RPAREN #WriteStatement
;
read_statement : READ LPAREN variable (DELIMITER variable)* RPAREN #ReadStatement
;
function_declaration: FUNCTION IDENTIFIER LPAREN parameter_list RPAREN COLON type SEMICOLON function_block #FunctionDeclaration
;
function_block: var_declaration* compound_statement FUNC_END #FunctionBlock
;
parameter_list: (parameter_declaration (DELIMITER parameter_declaration)*)? #ParameterList
;
parameter_declaration: IDENTIFIER COLON type #ParameterDeclaration
;
function_call : IDENTIFIER LPAREN argument_list? RPAREN #FunctionCall
;
argument_list : (expression (DELIMITER expression)*) #ArgumentList
;
expression : simple_expression ((relop | AND | OR ) simple_expression)* SEMICOLON* #Expresion
;
simple_expression : term ((addop | OR) term)* #SimpleExpression
;
term : factor (mulop factor)* #Termino
;
identifier_terminal: IDENTIFIER (index_access | function_call | LPAREN expression RPAREN | (NOT factor))? #IdentifierTerminal
;
factor : identifier_terminal 
        | NUMBER                
        | STRINGLITERAL               
        | CHARACTER                  
        | LPAREN expression RPAREN    
        | NOT factor          
        | TRUE                
        | FALSE              
        ;
variable : IDENTIFIER (index_access)? #VariableNonTerminal
;
index_access : LBRACKET expression (DELIMITER expression)* RBRACKET #IndexAccess
;
relop : EQ | NOTEQ | LT | GT | LEQ | GEQ #RelationalOperator
;
addop : ADD | SUB #AddOperator
;
mulop : MUL | DIV | MOD #MulOperator
;
//operator tokens
ADD:'+'
;
SUB:'-'
;
MUL:'*'
;
DIV:'/'|'div'
;
MOD:'mod'
;
EQ:'='
;
NOTEQ:'<>'
;
LT:'<'
;
GT:'>'
;
LEQ:'<='
;
GEQ:'>='
;
SEMICOLON:';'
;
ASSIGN:':='
;
DOTDOT: '..'
;
COLON:':'
;
LPAREN:'('
;
RPAREN:')'
;
LBRACKET:'['
;
RBRACKET:']'
;
DELIMITER:','
;
//keyword tokens
PROGRAM:'program'
;
PROGRAM_END:'.';
VAR:'var'
;
ARRAY:'array'
;
INTEGER:'integer'
;
REAL:'real'
;
BOOLEAN:'boolean'
;
CHAR:'char'
;
STRING:'string'
;
OF:'of'
;
NOT:'not'
;
TRUE:'true'
;
FALSE:'false'
;
END:'end'
;
AND:'and'
;
OR:'or'
;
FUNC_END:'end;'
;
IF:'if'
;
THEN:'then'
;
ELSE:'else'
;
WHILE:'while'
;
DO:'do'
;
FOR:'for'
;
TO:'to'
;
REPEAT:'repeat'
;
UNTIL:'until'
;
WRITE:'write'
;
READ:'read'
;
FUNCTION:'function'
;
BEGIN:'begin'
;
//helper
IDENTIFIER : [a-zA-Z][a-zA-Z0-9_]*
;
NUMBER : [0-9]+ ('.' [0-9]+)?
;
STRINGLITERAL : '\'' (~["\r\n] | '""')* '\''
;
CHARACTER: '\'' (~["\r\n] | '\\' . )* '\''
;
COMMENT : '{' ~('{' | '}')* '}'
;
WS : [ \t\r\n]+ -> skip
;