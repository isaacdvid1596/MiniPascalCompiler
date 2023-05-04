grammar MiniPascal;

program : PROGRAM IDENTIFIER ';' block #Programa
;
block : var_declaration* function_declaration* compound_statement* program_end_marker #Bloque
;
//(var_declaration function_declaration compound_statement)* program_end_marker;
program_end_marker : '.' #ProgramEndMarker
;
var_declaration : 'var' (variable_declaration ';')* #VarDeclaration
;
variable_declaration : IDENTIFIER ':' type (array_specifier)?
;
array_specifier : 'array' '[' index_range ']' 'of' #ArraySpecifier
;
index_range : NUMBER '..' NUMBER #IndexRange
;
index : NUMBER #Indice
; //REMOVE?
type : 'integer'    #Integer
        | 'real'    #Real
        | 'boolean' #Boolean
        | 'char'    #Char
        | 'string'  #String
        | 'array' '[' index_range ']' 'of' type #Array
        ;
//array_type: 'array'
compound_statement : 'begin' statement_list end_statement* #CompountStatement
;
statement_list : statement (';'statement?)* #StatementList
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
assignment_statement : variable ':=' (expression|function_call) #AssignmentStatement
;
if_statement : 'if' expression 'then' statement ('else' statement)? #IfStatement
;
while_statement : 'while' expression 'do' statement #WhileStatement
;
for_statement : 'for' IDENTIFIER ':=' expression 'to' expression 'do' statement #ForStatement
;
repeat_statement : 'repeat' statement_list 'until' expression #RepeatStatement
;
write_statement : 'write' '(' expression ')' #WriteStatement
;
read_statement : 'read' '(' variable (',' variable)* ')' #ReadStatement
;
function_declaration: 'function' IDENTIFIER '(' parameter_list ')' ':' type ';' function_block #FunctionDeclaration
;
function_block: var_declaration* compound_statement function_end_statement #FunctionBlock
;
function_end_statement: 'end;' #FunctionEndStatement
;
parameter_list: (parameter_declaration (',' parameter_declaration)*)? #ParameterList
;
parameter_declaration: IDENTIFIER ':' type #ParameterDeclaration
;
function_call : IDENTIFIER '(' argument_list? ')' #FunctionCall
;
argument_list : (expression (',' expression)*) #ArgumentList
;
end_statement: 'end' #EndStatement
;
expression : simple_expression ((relop | 'and' | 'or') simple_expression)* ';'* #Expresion
;
simple_expression : term ((addop | 'or') term)* #SimpleExpression
;
term : factor (mulop factor)* #Termino
;
factor : IDENTIFIER (index_access | function_call | '(' expression ')' | ('not' factor))? #IdentifierTerminal
        | NUMBER                #NumberTerminal
        | STRINGLITERAL               #StringTerminal
        | CHARACTER                  #CharTerminal
        | '(' expression ')'    #BetweenParentsExpression
        | 'not' factor          #NotFactorOperator
        | 'true'                #TrueOperator
        | 'false'               #FalseOperator
        ;
variable : IDENTIFIER (index_access)? #VariableNonTerminal
;
index_access : '[' expression (',' expression)* ']' #IndexAccess
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
//keyword tokens
PROGRAM:'program'
;
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


